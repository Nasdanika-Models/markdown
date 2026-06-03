/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Link Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkClosingMarker <em>Link Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkOpeningMarker <em>Link Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.InlineLinkNode#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.InlineLinkNode#getTextClosingMarker <em>Text Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.InlineLinkNode#getTextOpeningMarker <em>Text Opening Marker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode()
 * @model abstract="true"
 * @generated
 */
public interface InlineLinkNode extends LinkNode {
	/**
	 * Returns the value of the '<em><b>Link Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Closing Marker</em>' attribute.
	 * @see #setLinkClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode_LinkClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getLinkClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkClosingMarker <em>Link Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Closing Marker</em>' attribute.
	 * @see #getLinkClosingMarker()
	 * @generated
	 */
	void setLinkClosingMarker(String value);

	/**
	 * Returns the value of the '<em><b>Link Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Opening Marker</em>' attribute.
	 * @see #setLinkOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode_LinkOpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getLinkOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkOpeningMarker <em>Link Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Opening Marker</em>' attribute.
	 * @see #getLinkOpeningMarker()
	 * @generated
	 */
	void setLinkOpeningMarker(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.InlineLinkNode#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Closing Marker</em>' attribute.
	 * @see #setTextClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode_TextClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getTextClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.InlineLinkNode#getTextClosingMarker <em>Text Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Closing Marker</em>' attribute.
	 * @see #getTextClosingMarker()
	 * @generated
	 */
	void setTextClosingMarker(String value);

	/**
	 * Returns the value of the '<em><b>Text Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Opening Marker</em>' attribute.
	 * @see #setTextOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getInlineLinkNode_TextOpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getTextOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.InlineLinkNode#getTextOpeningMarker <em>Text Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Opening Marker</em>' attribute.
	 * @see #getTextOpeningMarker()
	 * @generated
	 */
	void setTextOpeningMarker(String value);

} // InlineLinkNode
