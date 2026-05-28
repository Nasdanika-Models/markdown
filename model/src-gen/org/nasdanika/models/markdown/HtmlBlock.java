/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A block-level raw HTML section.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.HtmlBlock#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getHtmlBlock()
 * @model
 * @generated
 */
public interface HtmlBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getHtmlBlock_Html()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getHtml();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.HtmlBlock#getHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(String value);

} // HtmlBlock
