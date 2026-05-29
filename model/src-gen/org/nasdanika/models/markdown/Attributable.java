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
 *   <li>{@link org.nasdanika.models.markdown.Attributable#getAttributesStartOffset <em>Attributes Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Attributable#getAttributesEndOffset <em>Attributes End Offset</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Start Offset</em>' attribute.
	 * @see #setAttributesStartOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getAttributable_AttributesStartOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getAttributesStartOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Attributable#getAttributesStartOffset <em>Attributes Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes Start Offset</em>' attribute.
	 * @see #getAttributesStartOffset()
	 * @generated
	 */
	void setAttributesStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes End Offset</em>' attribute.
	 * @see #setAttributesEndOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getAttributable_AttributesEndOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getAttributesEndOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Attributable#getAttributesEndOffset <em>Attributes End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes End Offset</em>' attribute.
	 * @see #getAttributesEndOffset()
	 * @generated
	 */
	void setAttributesEndOffset(int value);

} // Attributable
