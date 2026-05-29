package org.nasdanika.models.markdown.loader;

import java.util.IdentityHashMap;
import java.util.Map;

import org.nasdanika.models.markdown.Attributable;
import org.nasdanika.models.markdown.MarkdownFactory;

import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ext.attributes.AttributeNode;
import com.vladsch.flexmark.ext.attributes.AttributesNode;
import com.vladsch.flexmark.util.ast.ContentNode;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

public class MarkdownVisitor {
	
    private final org.nasdanika.models.markdown.Document root;          // your Ecore root
    
    private Map<Node, org.nasdanika.models.markdown.Node> nodeMap = new IdentityHashMap<>();  // to keep track of created Ecore nodes for each visited AST node
    
    private org.nasdanika.models.markdown.Block currentContainerBlock;  

    public MarkdownVisitor(org.nasdanika.models.markdown.Document root) {
        this.root = root;
        this.currentContainerBlock = root;   // start with root as the current container
    }

    // ── visitor wiring ────────────────────────────────────────────────────────
    private final NodeVisitor visitor = new NodeVisitor(
        new VisitHandler<>(Heading.class, this::visitHeading),
//        new VisitHandler<>(Paragraph.class, this::visitParagraph),
//        new VisitHandler<>(BulletListItem.class, this::visitListItem),
//        new VisitHandler<>(FencedCodeBlock.class, this::visitCode),
        new VisitHandler<>(AttributesNode.class, this::visitAttributes)
    );

    public void visit(Document document) {
    	populateContentNode(document, root);
        visitor.visit(document);
        root.setContentEndOffset(root.getEndOffset());
        root.setContent(root.getChars());
        setChildrenContent(root.getChars(), root);        
    }
    
    private void setChildrenContent(String docContent, org.nasdanika.models.markdown.Node node) {
    	org.nasdanika.models.markdown.Node childNode = null;
    	for (org.nasdanika.models.markdown.Node cn: node.getChildren()) {
    		if (childNode != null) {
    			childNode.setContent(docContent.substring(childNode.getStartOffset(), cn.getStartOffset()));
    			childNode.setContentEndOffset(cn.getStartOffset());
			}
    		childNode = cn;
		}
		if (childNode != null) {
			childNode.setContent(docContent.substring(childNode.getStartOffset(), node.getContentEndOffset()));
			childNode.setContentEndOffset(node.getContentEndOffset());
		}    	
		
		// Second pass with content end offsets set
    	for (org.nasdanika.models.markdown.Node cn: node.getChildren()) {
    		setChildrenContent(docContent, cn);    		
		}		
    }    
    
    private void populateContentNode(ContentNode node, org.nasdanika.models.markdown.ContentNode ecoreNode) {
    	ecoreNode.setStartOffset(node.getStartOffset());
    	ecoreNode.setStartLineNumber(node.getStartLineNumber());
    	
    	ecoreNode.setEndOffset(node.getEndOffset());
    	ecoreNode.setEndLineNumber(node.getEndLineNumber());
    	
    	ecoreNode.setChars(node.getChars().toString());
	}

    // ── handler implementations ───────────────────────────────────────────────

    private void visitHeading(Heading node) {
    	org.nasdanika.models.markdown.Heading heading = getFactory().createHeading();
    	populateContentNode(node, heading);
        int nodeLevel = node.getLevel();
		heading.setLevel(org.nasdanika.models.markdown.HeadingLevel.get(nodeLevel));
        heading.setText(node.getText().toString());
        while (currentContainerBlock instanceof org.nasdanika.models.markdown.Heading currentHeading
				&& currentHeading.getLevel().getValue() >= heading.getLevel().getValue()) {
			currentContainerBlock = (org.nasdanika.models.markdown.Block) currentContainerBlock.eContainer();
		}
        currentContainerBlock.getChildren().add(heading);
        nodeMap.put(node, heading);
        currentContainerBlock = heading; 

        visitor.visitChildren(node);   // recurse so AttributesNode is caught
    }

	protected MarkdownFactory getFactory() {
		return MarkdownFactory.eINSTANCE;
	}

//    private void visitParagraph(Paragraph node) {
//    	org.nasdanika.models.markdown.Paragraph para = getFactory().createParagraph();
//        para.setText(node.getContentChars().toString().strip());
//        root.getBlocks().add(para);
//        currentBlock = para;
//
//        visitor.visitChildren(node);
//    }
//
//    private void visitListItem(BulletListItem node) {
//    	org.nasdanika.models.markdown.ListItem item = getFactory().createListItem();
//        item.setText(node.getFirstChild() == null
//                ? "" : node.getFirstChild().getChars().toString().strip());
//        root.getBlocks().add(item);
//        currentBlock = item;
//
//        visitor.visitChildren(node);
//    }
//
//    private void visitCode(FencedCodeBlock node) {
//    	org.nasdanika.models.markdown.CodeBlock code = getFactory().createCodeBlock();
//        code.setLanguage(node.getInfo().toString());
//        code.setContent(node.getContentChars().toString());
//        root.getBlocks().add(code);
//        currentBlock = code;
//
//        visitor.visitChildren(node);
//    }

    /**
     * Called for every { attr="value" } block.
     * The AttributesNode is a sibling of the element it annotates,
     * so currentBlock is already set when this fires.
     */
    private void visitAttributes(AttributesNode node) {
        if (nodeMap.get(node.getParent()) instanceof Attributable attributable) {
        	attributable.setAttributesStartOffset(node.getStartOffset());
        	attributable.setAttributesEndOffset(node.getEndOffset());
	        for (Node child : node.getChildren()) {
	            if (child instanceof AttributeNode attr) {
	                String key   = attr.getName().toString();
	                String value = attr.getValue().toString();
	
	                org.nasdanika.models.markdown.Attribute ecoreAttr = getFactory().createAttribute();
	                ecoreAttr.setKey(key);
	                ecoreAttr.setValue(value);
	                attributable.getAttributes().add(ecoreAttr);
	            }
	        }
        }
    }
	
}