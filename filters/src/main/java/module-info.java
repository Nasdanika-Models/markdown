import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.markdown.filters.MarkdownToEcoreResourceContentsFilterCapabilityFactory;

module org.nasdanika.models.markdown.filters {
	
	exports org.nasdanika.models.markdown.filters;
	opens org.nasdanika.models.markdown.filters to org.nasdanika.common; // For transformer
	
	
	requires transitive org.nasdanika.models.markdown;
	requires org.apache.commons.lang3;
	
	provides CapabilityFactory with 
		MarkdownToEcoreResourceContentsFilterCapabilityFactory;
	
}