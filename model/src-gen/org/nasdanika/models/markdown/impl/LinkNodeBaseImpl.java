/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.LinkNodeBase;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Node Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getAnchorMarker <em>Anchor Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getAnchorRef <em>Anchor Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getPageRef <em>Page Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getTitleClosingMarker <em>Title Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getTitleOpeningMarker <em>Title Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getUrlClosingMarker <em>Url Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl#getUrlOpeningMarker <em>Url Opening Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkNodeBaseImpl extends NodeImpl implements LinkNodeBase {
	/**
	 * The default value of the '{@link #getAnchorMarker() <em>Anchor Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAnchorRef() <em>Anchor Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPageRef() <em>Page Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitleClosingMarker() <em>Title Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_CLOSING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitleOpeningMarker() <em>Title Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_OPENING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrlClosingMarker() <em>Url Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_CLOSING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrlOpeningMarker() <em>Url Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_OPENING_MARKER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkNodeBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.LINK_NODE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnchorMarker() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__ANCHOR_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorMarker(String newAnchorMarker) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__ANCHOR_MARKER, newAnchorMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnchorRef() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF, MarkdownPackage.Literals.LINK_NODE_BASE__ANCHOR_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorRef(String newAnchorRef) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF, MarkdownPackage.Literals.LINK_NODE_BASE__ANCHOR_REF, newAnchorRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageRef() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__PAGE_REF, MarkdownPackage.Literals.LINK_NODE_BASE__PAGE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageRef(String newPageRef) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__PAGE_REF, MarkdownPackage.Literals.LINK_NODE_BASE__PAGE_REF, newPageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__TITLE, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__TITLE, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE_CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleClosingMarker(String newTitleClosingMarker) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE_CLOSING_MARKER, newTitleClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE_OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleOpeningMarker(String newTitleOpeningMarker) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__TITLE_OPENING_MARKER, newTitleOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__URL, MarkdownPackage.Literals.LINK_NODE_BASE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__URL, MarkdownPackage.Literals.LINK_NODE_BASE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrlClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__URL_CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrlClosingMarker(String newUrlClosingMarker) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__URL_CLOSING_MARKER, newUrlClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrlOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__URL_OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrlOpeningMarker(String newUrlOpeningMarker) {
		eDynamicSet(MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER, MarkdownPackage.Literals.LINK_NODE_BASE__URL_OPENING_MARKER, newUrlOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER:
				return getAnchorMarker();
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF:
				return getAnchorRef();
			case MarkdownPackage.LINK_NODE_BASE__PAGE_REF:
				return getPageRef();
			case MarkdownPackage.LINK_NODE_BASE__TITLE:
				return getTitle();
			case MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER:
				return getTitleClosingMarker();
			case MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER:
				return getTitleOpeningMarker();
			case MarkdownPackage.LINK_NODE_BASE__URL:
				return getUrl();
			case MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER:
				return getUrlClosingMarker();
			case MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER:
				return getUrlOpeningMarker();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER:
				setAnchorMarker((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF:
				setAnchorRef((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__PAGE_REF:
				setPageRef((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE:
				setTitle((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER:
				setTitleClosingMarker((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER:
				setTitleOpeningMarker((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL:
				setUrl((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER:
				setUrlClosingMarker((String)newValue);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER:
				setUrlOpeningMarker((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER:
				setAnchorMarker(ANCHOR_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF:
				setAnchorRef(ANCHOR_REF_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__PAGE_REF:
				setPageRef(PAGE_REF_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER:
				setTitleClosingMarker(TITLE_CLOSING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER:
				setTitleOpeningMarker(TITLE_OPENING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER:
				setUrlClosingMarker(URL_CLOSING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER:
				setUrlOpeningMarker(URL_OPENING_MARKER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_MARKER:
				return ANCHOR_MARKER_EDEFAULT == null ? getAnchorMarker() != null : !ANCHOR_MARKER_EDEFAULT.equals(getAnchorMarker());
			case MarkdownPackage.LINK_NODE_BASE__ANCHOR_REF:
				return ANCHOR_REF_EDEFAULT == null ? getAnchorRef() != null : !ANCHOR_REF_EDEFAULT.equals(getAnchorRef());
			case MarkdownPackage.LINK_NODE_BASE__PAGE_REF:
				return PAGE_REF_EDEFAULT == null ? getPageRef() != null : !PAGE_REF_EDEFAULT.equals(getPageRef());
			case MarkdownPackage.LINK_NODE_BASE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case MarkdownPackage.LINK_NODE_BASE__TITLE_CLOSING_MARKER:
				return TITLE_CLOSING_MARKER_EDEFAULT == null ? getTitleClosingMarker() != null : !TITLE_CLOSING_MARKER_EDEFAULT.equals(getTitleClosingMarker());
			case MarkdownPackage.LINK_NODE_BASE__TITLE_OPENING_MARKER:
				return TITLE_OPENING_MARKER_EDEFAULT == null ? getTitleOpeningMarker() != null : !TITLE_OPENING_MARKER_EDEFAULT.equals(getTitleOpeningMarker());
			case MarkdownPackage.LINK_NODE_BASE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case MarkdownPackage.LINK_NODE_BASE__URL_CLOSING_MARKER:
				return URL_CLOSING_MARKER_EDEFAULT == null ? getUrlClosingMarker() != null : !URL_CLOSING_MARKER_EDEFAULT.equals(getUrlClosingMarker());
			case MarkdownPackage.LINK_NODE_BASE__URL_OPENING_MARKER:
				return URL_OPENING_MARKER_EDEFAULT == null ? getUrlOpeningMarker() != null : !URL_OPENING_MARKER_EDEFAULT.equals(getUrlOpeningMarker());
		}
		return super.eIsSet(featureID);
	}

} //LinkNodeBaseImpl
