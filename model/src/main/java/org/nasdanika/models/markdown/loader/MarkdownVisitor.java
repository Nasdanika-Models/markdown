package org.nasdanika.models.markdown.loader;

import org.nasdanika.models.markdown.Block;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.MarkdownFactory;

import com.vladsch.flexmark.ast.*;
import com.vladsch.flexmark.ext.attributes.AttributeNode;
import com.vladsch.flexmark.ext.attributes.AttributesNode;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

public class MarkdownVisitor {

    private final Document root;          // your Ecore root
    private Block currentBlock;           // tracks current parent block

    public MarkdownVisitor(Document root) {
        this.root = root;
    }

    // ── visitor wiring ────────────────────────────────────────────────────────
    private final NodeVisitor visitor = new NodeVisitor(
        new VisitHandler<>(Heading.class, this::visitHeading),
        new VisitHandler<>(Paragraph.class, this::visitParagraph),
        new VisitHandler<>(BulletListItem.class, this::visitListItem),
        new VisitHandler<>(FencedCodeBlock.class, this::visitCode),
        new VisitHandler<>(AttributesNode.class, this::visitAttributes)
    );

    public void visit(Node document) {
    	populateNode(document, root);
        visitor.visit(document);
        root.setText(document.getChars().toString());
    }
    
    private void populateNode(Node node, org.nasdanika.models.markdown.Node ecoreNode) {
    	ecoreNode.setStartOffset(node.getStartOffset());
    	ecoreNode.setStartLineNumber(node.getStartLineNumber());
    	
    	ecoreNode.setEndOffset(node.getEndOffset());
    	ecoreNode.setEndLineNumber(node.getEndLineNumber());
	}

    // ── handler implementations ───────────────────────────────────────────────

    private void visitHeading(Heading node) {
    	org.nasdanika.models.markdown.Heading heading = getFactory().createHeading();
    	populateNode(node, heading);
        heading.setLevel(org.nasdanika.models.markdown.HeadingLevel.get(node.getLevel()));
        heading.setText(node.getText().toString());
        root.getBlocks().add(heading);
        currentBlock = heading;

        visitor.visitChildren(node);   // recurse so AttributesNode is caught
    }

	protected MarkdownFactory getFactory() {
		return MarkdownFactory.eINSTANCE;
	}

    private void visitParagraph(Paragraph node) {
    	org.nasdanika.models.markdown.Paragraph para = getFactory().createParagraph();
        para.setText(node.getContentChars().toString().strip());
        root.getBlocks().add(para);
        currentBlock = para;

        visitor.visitChildren(node);
    }

    private void visitListItem(BulletListItem node) {
    	org.nasdanika.models.markdown.ListItem item = getFactory().createListItem();
        item.setText(node.getFirstChild() == null
                ? "" : node.getFirstChild().getChars().toString().strip());
        root.getBlocks().add(item);
        currentBlock = item;

        visitor.visitChildren(node);
    }

    private void visitCode(FencedCodeBlock node) {
    	org.nasdanika.models.markdown.CodeBlock code = getFactory().createCodeBlock();
        code.setLanguage(node.getInfo().toString());
        code.setContent(node.getContentChars().toString());
        root.getBlocks().add(code);
        currentBlock = code;

        visitor.visitChildren(node);
    }

    /**
     * Called for every { attr="value" } block.
     * The AttributesNode is a sibling of the element it annotates,
     * so currentBlock is already set when this fires.
     */
    private void visitAttributes(AttributesNode node) {
        if (currentBlock == null) return;

        for (Node child : node.getChildren()) {
            if (child instanceof AttributeNode attr) {
                String key   = attr.getName().toString();
                String value = attr.getValue().toString();

                org.nasdanika.models.markdown.Attribute ecoreAttr = getFactory().createAttribute();
                ecoreAttr.setKey(key);
                ecoreAttr.setValue(value);
                currentBlock.getAttributes().add(ecoreAttr);

                System.out.printf("  attr: %s=%s on %s%n",
                        key, value, currentBlock.eClass().getName());
            }
        }
    }
}