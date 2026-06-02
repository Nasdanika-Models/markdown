package org.nasdanika.models.markdown.filters;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;

public class MarkdownToEcoreResourceContentsFilter implements ResourceContentsFilter {
	
	private static final String ECORE_QUALIFIER = "ecore";

	@Override
	public List<EObject> load(
			Resource resource, 
			List<EObject> contents, 
			String[] qualifiers, 
			int qualifierPosition,
			Map<?, ?> options) throws IOException {
		
		if (ECORE_QUALIFIER.equals(qualifiers[qualifierPosition])) {
			return contents
				.stream()
				.flatMap(e -> e instanceof Document document ? map(resource, document).stream() : Stream.of(e))
				.toList();
		}
		return ResourceContentsFilter.super.load(resource, contents, qualifiers, qualifierPosition, options);
	}
	
	@Override
	public List<EObject> save(
			Resource resource, 
			List<EObject> contents, 
			String[] qualifiers, 
			int qualifierPosition,
			Map<?, ?> options) throws IOException {
		
		if (ECORE_QUALIFIER.equals(qualifiers[qualifierPosition])) {
			throw new UnsupportedOperationException("Saving to Markdown format is not supported");
		}
		return ResourceContentsFilter.super.save(resource, contents, qualifiers, qualifierPosition, options);
	}
	
	private List<EObject> map(Resource resource, Document document) {
		return document.getChildren()
			.stream()
			.map(e -> {
				if (e instanceof Heading heading && heading.getLevel() == HeadingLevel.H1) {
					return mapHeadingToEpackage(resource, heading);
				}
				// TODO - add an error or a warning to the resource that only H1 headings are supported
				return e;
			})
			.toList();
	}
	
	private String labelToName(String label) {
		String[] cca = label.split("\\s+");
		for (int i=0; i<cca.length; ++i) {
			cca[i] = StringUtils.capitalize(cca[i]);
		}
		return String.join("", cca);
	}

	private EPackage mapHeadingToEpackage(Resource resource, Heading heading) {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();

		int attributesLength = heading.getAttributesEndOffset() - heading.getAttributesStartOffset();
		String name = heading.getText();
		ePackage.setName(StringUtils.uncapitalize(labelToName(name.substring(0, name.length() - attributesLength))));
		for (Attribute attr: heading.getAttributes()) {
			switch (attr.getKey()) {
			case "uri":
				ePackage.setNsURI(attr.getValue());
				break;
			case "prefix":
				ePackage.setNsPrefix(attr.getValue());
				break;
			case "name":
				ePackage.setName(attr.getValue());
				break;
			default:
				// TODO - add an error or a warning to the resource that only uri, prefix and name attributes are supported
			}
		}
		
		// TODO - go through h2 children and create EClassifiers, offset to the first child is documentation
		// then go through h3 children and create EStructuralFeatures, etc.
		
		return ePackage;
	}

}
