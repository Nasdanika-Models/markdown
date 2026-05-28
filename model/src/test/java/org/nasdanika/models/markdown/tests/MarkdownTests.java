package org.nasdanika.models.markdown.tests;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.MarkdownFactory;
import org.nasdanika.models.markdown.loader.MarkdownVisitor;

import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.MutableDataSet;

public class MarkdownTests {
	
	@Test
	public void testMarkdownVisitor() throws Exception {
        // ── 1. Configure parser with the Attributes extension ─────────────────
        MutableDataSet options = new MutableDataSet();
        options.set(Parser.EXTENSIONS, List.of(AttributesExtension.create()));

        Parser parser = Parser.builder(options).build();

        // ── 2. Parse source ───────────────────────────────────────────────────
        String source = """        		
                # Heading {id="intro" class="title"}

                A paragraph with **bold** text. {lang="en"}

                - item one {.highlight}
                - item two
                
                ## Heading 2
                
                My important info

                
                """;

        Node document = parser.parse(source);

        // ── 3. Bootstrap the Ecore root ───────────────────────────────────────
        //  Replace MarkdownFactory / MarkdownPackage with your generated classes.
        Document ecoreDoc = MarkdownFactory.eINSTANCE.createDocument();

        // ── 4. Traverse the AST and populate the model ────────────────────────
        new MarkdownVisitor(ecoreDoc).visit(document);

        System.out.println("Ecore model populated: " + ecoreDoc);
        
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
        
		File markdownFile = new File("target/markdown.yaml").getCanonicalFile();
		Resource markdownResource = resourceSet.createResource(URI.createFileURI(markdownFile.getAbsolutePath()));
		markdownResource.getContents().add(ecoreDoc);
		markdownResource.save(null);
		
	}

}
