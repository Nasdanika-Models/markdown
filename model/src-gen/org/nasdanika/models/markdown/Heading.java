/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A heading (# … ######).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Heading#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Heading#getInlines <em>Inlines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends Block {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"H1"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.markdown.HeadingLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.nasdanika.models.markdown.HeadingLevel
	 * @see #setLevel(HeadingLevel)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getHeading_Level()
	 * @model default="H1" unique="false" required="true"
	 * @generated
	 */
	HeadingLevel getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Heading#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.nasdanika.models.markdown.HeadingLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(HeadingLevel value);

	/**
	 * Returns the value of the '<em><b>Inlines</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Inline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Inline content of the heading (may contain emphasis, links, …).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inlines</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getHeading_Inlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inline> getInlines();

} // Heading
