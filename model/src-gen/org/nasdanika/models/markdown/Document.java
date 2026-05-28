/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Root of the Markdown AST.  Corresponds to a single parsed file or string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Document#getSourceUri <em>Source Uri</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Block {
	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Optional: source file path stored for traceability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Uri</em>' attribute.
	 * @see #setSourceUri(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getDocument_SourceUri()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Document#getSourceUri <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' attribute.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(String value);

} // Document
