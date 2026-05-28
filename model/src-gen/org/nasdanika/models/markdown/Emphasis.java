/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emphasis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An emphasis span (* / ** / _ / __).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Emphasis#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Emphasis#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getEmphasis()
 * @model
 * @generated
 */
public interface Emphasis extends Inline {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"ITALIC"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.markdown.EmphasisKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.markdown.EmphasisKind
	 * @see #setKind(EmphasisKind)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getEmphasis_Kind()
	 * @model default="ITALIC" unique="false" required="true"
	 * @generated
	 */
	EmphasisKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Emphasis#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.markdown.EmphasisKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EmphasisKind value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Inline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getEmphasis_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inline> getChildren();

} // Emphasis
