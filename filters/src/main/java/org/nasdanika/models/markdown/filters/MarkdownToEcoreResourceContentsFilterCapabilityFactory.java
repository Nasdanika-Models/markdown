package org.nasdanika.models.markdown.filters;

import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.common.ProgressMonitor;

public class MarkdownToEcoreResourceContentsFilterCapabilityFactory extends ServiceCapabilityFactory<Void, ResourceContentsFilter> {
	
	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return ResourceContentsFilter.class == type && requirement == null;
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsFilter>>> createService(
			Class<ResourceContentsFilter> serviceType, 
			Void serviceRequirement, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		return wrap(new MarkdownToEcoreResourceContentsFilter());
	}

}
