/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fenced Code Block</b></em>'.
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
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getInfo <em>Info</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingFence <em>Closing Fence</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingMarker <em>Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceIndent <em>Fence Indent</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceLength <em>Fence Length</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningFence <em>Opening Fence</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningMarker <em>Opening Marker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock()
 * @model
 * @generated
 */
public interface FencedCodeBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_Info()
	 * @model unique="false"
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

	/**
	 * Returns the value of the '<em><b>Closing Fence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Fence</em>' attribute.
	 * @see #setClosingFence(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_ClosingFence()
	 * @model unique="false"
	 * @generated
	 */
	String getClosingFence();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingFence <em>Closing Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Fence</em>' attribute.
	 * @see #getClosingFence()
	 * @generated
	 */
	void setClosingFence(String value);

	/**
	 * Returns the value of the '<em><b>Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Marker</em>' attribute.
	 * @see #setClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_ClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingMarker <em>Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Marker</em>' attribute.
	 * @see #getClosingMarker()
	 * @generated
	 */
	void setClosingMarker(String value);

	/**
	 * Returns the value of the '<em><b>Fence Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fence Indent</em>' attribute.
	 * @see #setFenceIndent(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_FenceIndent()
	 * @model unique="false"
	 * @generated
	 */
	int getFenceIndent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceIndent <em>Fence Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fence Indent</em>' attribute.
	 * @see #getFenceIndent()
	 * @generated
	 */
	void setFenceIndent(int value);

	/**
	 * Returns the value of the '<em><b>Fence Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fence Length</em>' attribute.
	 * @see #setFenceLength(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_FenceLength()
	 * @model unique="false"
	 * @generated
	 */
	int getFenceLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceLength <em>Fence Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fence Length</em>' attribute.
	 * @see #getFenceLength()
	 * @generated
	 */
	void setFenceLength(int value);

	/**
	 * Returns the value of the '<em><b>Opening Fence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Fence</em>' attribute.
	 * @see #setOpeningFence(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_OpeningFence()
	 * @model unique="false"
	 * @generated
	 */
	String getOpeningFence();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningFence <em>Opening Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Fence</em>' attribute.
	 * @see #getOpeningFence()
	 * @generated
	 */
	void setOpeningFence(String value);

	/**
	 * Returns the value of the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Marker</em>' attribute.
	 * @see #setOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedCodeBlock_OpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningMarker <em>Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Marker</em>' attribute.
	 * @see #getOpeningMarker()
	 * @generated
	 */
	void setOpeningMarker(String value);

} // FencedCodeBlock
