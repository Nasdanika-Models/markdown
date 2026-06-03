/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Node Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorMarker <em>Anchor Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorRef <em>Anchor Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getPageRef <em>Page Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleClosingMarker <em>Title Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleOpeningMarker <em>Title Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlClosingMarker <em>Url Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlOpeningMarker <em>Url Opening Marker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase()
 * @model abstract="true"
 * @generated
 */
public interface LinkNodeBase extends Node {
	/**
	 * Returns the value of the '<em><b>Anchor Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Marker</em>' attribute.
	 * @see #setAnchorMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_AnchorMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getAnchorMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorMarker <em>Anchor Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Marker</em>' attribute.
	 * @see #getAnchorMarker()
	 * @generated
	 */
	void setAnchorMarker(String value);

	/**
	 * Returns the value of the '<em><b>Anchor Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Ref</em>' attribute.
	 * @see #setAnchorRef(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_AnchorRef()
	 * @model unique="false"
	 * @generated
	 */
	String getAnchorRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorRef <em>Anchor Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Ref</em>' attribute.
	 * @see #getAnchorRef()
	 * @generated
	 */
	void setAnchorRef(String value);

	/**
	 * Returns the value of the '<em><b>Page Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Ref</em>' attribute.
	 * @see #setPageRef(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_PageRef()
	 * @model unique="false"
	 * @generated
	 */
	String getPageRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getPageRef <em>Page Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Ref</em>' attribute.
	 * @see #getPageRef()
	 * @generated
	 */
	void setPageRef(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Title Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Closing Marker</em>' attribute.
	 * @see #setTitleClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_TitleClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getTitleClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleClosingMarker <em>Title Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Closing Marker</em>' attribute.
	 * @see #getTitleClosingMarker()
	 * @generated
	 */
	void setTitleClosingMarker(String value);

	/**
	 * Returns the value of the '<em><b>Title Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Opening Marker</em>' attribute.
	 * @see #setTitleOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_TitleOpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getTitleOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleOpeningMarker <em>Title Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Opening Marker</em>' attribute.
	 * @see #getTitleOpeningMarker()
	 * @generated
	 */
	void setTitleOpeningMarker(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Url Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Closing Marker</em>' attribute.
	 * @see #setUrlClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_UrlClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getUrlClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlClosingMarker <em>Url Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Closing Marker</em>' attribute.
	 * @see #getUrlClosingMarker()
	 * @generated
	 */
	void setUrlClosingMarker(String value);

	/**
	 * Returns the value of the '<em><b>Url Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Opening Marker</em>' attribute.
	 * @see #setUrlOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLinkNodeBase_UrlOpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getUrlOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlOpeningMarker <em>Url Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Opening Marker</em>' attribute.
	 * @see #getUrlOpeningMarker()
	 * @generated
	 */
	void setUrlOpeningMarker(String value);

} // LinkNodeBase
