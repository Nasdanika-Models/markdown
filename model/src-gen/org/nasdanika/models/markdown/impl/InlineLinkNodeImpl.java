/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.InlineLinkNode;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Link Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl#getLinkClosingMarker <em>Link Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl#getLinkOpeningMarker <em>Link Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl#getTextClosingMarker <em>Text Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl#getTextOpeningMarker <em>Text Opening Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InlineLinkNodeImpl extends LinkNodeImpl implements InlineLinkNode {
	/**
	 * The default value of the '{@link #getLinkClosingMarker() <em>Link Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_CLOSING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLinkOpeningMarker() <em>Link Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_OPENING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextClosingMarker() <em>Text Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_CLOSING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextOpeningMarker() <em>Text Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_OPENING_MARKER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineLinkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.INLINE_LINK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__LINK_CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkClosingMarker(String newLinkClosingMarker) {
		eDynamicSet(MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__LINK_CLOSING_MARKER, newLinkClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__LINK_OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkOpeningMarker(String newLinkOpeningMarker) {
		eDynamicSet(MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__LINK_OPENING_MARKER, newLinkOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(MarkdownPackage.INLINE_LINK_NODE__TEXT, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(MarkdownPackage.INLINE_LINK_NODE__TEXT, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT_CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextClosingMarker(String newTextClosingMarker) {
		eDynamicSet(MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT_CLOSING_MARKER, newTextClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT_OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextOpeningMarker(String newTextOpeningMarker) {
		eDynamicSet(MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER, MarkdownPackage.Literals.INLINE_LINK_NODE__TEXT_OPENING_MARKER, newTextOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER:
				return getLinkClosingMarker();
			case MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER:
				return getLinkOpeningMarker();
			case MarkdownPackage.INLINE_LINK_NODE__TEXT:
				return getText();
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER:
				return getTextClosingMarker();
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER:
				return getTextOpeningMarker();
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
			case MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER:
				setLinkClosingMarker((String)newValue);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER:
				setLinkOpeningMarker((String)newValue);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT:
				setText((String)newValue);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER:
				setTextClosingMarker((String)newValue);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER:
				setTextOpeningMarker((String)newValue);
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
			case MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER:
				setLinkClosingMarker(LINK_CLOSING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER:
				setLinkOpeningMarker(LINK_OPENING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER:
				setTextClosingMarker(TEXT_CLOSING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER:
				setTextOpeningMarker(TEXT_OPENING_MARKER_EDEFAULT);
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
			case MarkdownPackage.INLINE_LINK_NODE__LINK_CLOSING_MARKER:
				return LINK_CLOSING_MARKER_EDEFAULT == null ? getLinkClosingMarker() != null : !LINK_CLOSING_MARKER_EDEFAULT.equals(getLinkClosingMarker());
			case MarkdownPackage.INLINE_LINK_NODE__LINK_OPENING_MARKER:
				return LINK_OPENING_MARKER_EDEFAULT == null ? getLinkOpeningMarker() != null : !LINK_OPENING_MARKER_EDEFAULT.equals(getLinkOpeningMarker());
			case MarkdownPackage.INLINE_LINK_NODE__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_CLOSING_MARKER:
				return TEXT_CLOSING_MARKER_EDEFAULT == null ? getTextClosingMarker() != null : !TEXT_CLOSING_MARKER_EDEFAULT.equals(getTextClosingMarker());
			case MarkdownPackage.INLINE_LINK_NODE__TEXT_OPENING_MARKER:
				return TEXT_OPENING_MARKER_EDEFAULT == null ? getTextOpeningMarker() != null : !TEXT_OPENING_MARKER_EDEFAULT.equals(getTextOpeningMarker());
		}
		return super.eIsSet(featureID);
	}

} //InlineLinkNodeImpl
