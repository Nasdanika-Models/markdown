package org.nasdanika.models.markdown.capability;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.emf.ContentsFilteringResource;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.MarkdownFactory;
import org.nasdanika.models.markdown.loader.MarkdownVisitor;

import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;

public class MarkdownResource extends ContentsFilteringResource {
	
		
	public MarkdownResource(URI uri, Collection<ResourceContentsFilter> filters) {
		super(uri, filters);
	}
	
	@Override
	protected List<EObject> loadContents(InputStream inputStream, Map<?, ?> options) throws IOException {
		try (Reader reader = new InputStreamReader(inputStream)) {
	        MutableDataSet parserOptions = new MutableDataSet();
	        parserOptions.set(Parser.EXTENSIONS, List.of(AttributesExtension.create()));

	        Parser parser = Parser.builder(parserOptions).build();

	        com.vladsch.flexmark.util.ast.Document document = parser.parseReader(reader);
	        Document ecoreDoc = MarkdownFactory.eINSTANCE.createDocument();
	        new MarkdownVisitor(ecoreDoc).visit(document);
			return filter(ecoreDoc);			
		}
	}
		
	/**
	 * Override to filter the document content. By default, the whole document is returned.
	 * @param document
	 * @return
	 */
	protected List<EObject> filter(Document document) {
		return List.of(document);
	}
			
}