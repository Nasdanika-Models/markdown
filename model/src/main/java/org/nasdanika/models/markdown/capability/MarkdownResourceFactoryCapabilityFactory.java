package org.nasdanika.models.markdown.capability;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.markdown.Document;

public class MarkdownResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return new MarkdownResourceFactory() {
			
			@Override
			protected List<EObject> filter(URI uri, Document document) {
				// TODO load content filters from the loader, iterate over them and apply to the document. For now, just return the whole document.
				return super.filter(uri, document);
			}
			
		};
	}
	
	@Override
	protected String getExtension() {
		return "md";
	}

}
