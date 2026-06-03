/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.ListBlock#isTight <em>Tight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getListBlock()
 * @model abstract="true"
 * @generated
 */
public interface ListBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Tight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tight</em>' attribute.
	 * @see #setTight(boolean)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getListBlock_Tight()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.ListBlock#isTight <em>Tight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tight</em>' attribute.
	 * @see #isTight()
	 * @generated
	 */
	void setTight(boolean value);

} // ListBlock
