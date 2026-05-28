/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A fenced or indented code block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.CodeBlock#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.CodeBlock#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Info string after the opening fence — typically a language identifier.
	 * Empty for indented code blocks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getCodeBlock_Language()
	 * @model unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.CodeBlock#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Raw source text of the code, preserving newlines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getCodeBlock_Content()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.CodeBlock#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // CodeBlock
