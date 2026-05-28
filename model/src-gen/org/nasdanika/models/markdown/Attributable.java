/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Mixin interface — any node that can carry Flexmark attribute blocks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Attributable#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getAttributable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Attributable extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * All attributes parsed from the { ... } block that follows this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getAttributable_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Attributable
