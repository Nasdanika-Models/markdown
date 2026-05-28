/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A paragraph — one or more lines of inline content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Paragraph#getInlines <em>Inlines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends Block {
	/**
	 * Returns the value of the '<em><b>Inlines</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Inline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlines</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getParagraph_Inlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inline> getInlines();

} // Paragraph
