package org.nasdanika.models.markdown.capability;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.models.markdown.Document;

public class MarkdownResourceFactory extends ResourceFactoryImpl {
	
	protected Collection<ResourceContentsFilter> filters;
	
	public MarkdownResourceFactory(Collection<ResourceContentsFilter> filters) {
		this.filters = filters;
	}
		
	@Override
	public Resource createResource(URI uri) {
		return new MarkdownResource(uri, filters) {
			
			@Override
			protected List<EObject> filter(Document document) {
				return MarkdownResourceFactory.this.filter(uri, document);
			}
			
		};
	}	
	
	/**
	 * Override to filter the document content. By default, the whole document is returned.
	 * @param document
	 * @return
	 */
	protected List<EObject> filter(URI uri, Document document) {
		return List.of(document);
	}	
	
}
