/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Inline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Raw HTML inline fragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.RawInline#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getRawInline()
 * @model
 * @generated
 */
public interface RawInline extends Inline {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getRawInline_Html()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getHtml();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.RawInline#getHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(String value);

} // RawInline
