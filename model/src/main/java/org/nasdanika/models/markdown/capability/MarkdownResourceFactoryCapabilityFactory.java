package org.nasdanika.models.markdown.capability;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.markdown.Document;

public class MarkdownResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		Requirement<Object, ResourceContentsFilter> resourceContentsFilterRequirement = ServiceCapabilityFactory.createRequirement(ResourceContentsFilter.class);		
		List<ResourceContentsFilter> filters = loader.getCapabilityLoader().loadAll(resourceContentsFilterRequirement, progressMonitor);
		
		
		return new MarkdownResourceFactory(filters) {
			
			@Override
			protected List<EObject> filter(URI uri, Document document) {
				return MarkdownResourceFactoryCapabilityFactory.this.filter(uri, document);
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
	
	
	@Override
	protected String getExtension() {
		return "md";
	}

}
