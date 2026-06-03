/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.TableCaption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Caption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCaptionImpl#getOpeningMarker <em>Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCaptionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCaptionImpl#getClosingMarker <em>Closing Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCaptionImpl extends NodeImpl implements TableCaption {
	/**
	 * The default value of the '{@link #getOpeningMarker() <em>Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_MARKER_EDEFAULT = null;

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
	 * The default value of the '{@link #getClosingMarker() <em>Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSING_MARKER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCaptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TABLE_CAPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.TABLE_CAPTION__OPENING_MARKER, MarkdownPackage.Literals.TABLE_CAPTION__OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningMarker(String newOpeningMarker) {
		eDynamicSet(MarkdownPackage.TABLE_CAPTION__OPENING_MARKER, MarkdownPackage.Literals.TABLE_CAPTION__OPENING_MARKER, newOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(MarkdownPackage.TABLE_CAPTION__TEXT, MarkdownPackage.Literals.TABLE_CAPTION__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(MarkdownPackage.TABLE_CAPTION__TEXT, MarkdownPackage.Literals.TABLE_CAPTION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER, MarkdownPackage.Literals.TABLE_CAPTION__CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingMarker(String newClosingMarker) {
		eDynamicSet(MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER, MarkdownPackage.Literals.TABLE_CAPTION__CLOSING_MARKER, newClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.TABLE_CAPTION__OPENING_MARKER:
				return getOpeningMarker();
			case MarkdownPackage.TABLE_CAPTION__TEXT:
				return getText();
			case MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER:
				return getClosingMarker();
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
			case MarkdownPackage.TABLE_CAPTION__OPENING_MARKER:
				setOpeningMarker((String)newValue);
				return;
			case MarkdownPackage.TABLE_CAPTION__TEXT:
				setText((String)newValue);
				return;
			case MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER:
				setClosingMarker((String)newValue);
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
			case MarkdownPackage.TABLE_CAPTION__OPENING_MARKER:
				setOpeningMarker(OPENING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.TABLE_CAPTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER:
				setClosingMarker(CLOSING_MARKER_EDEFAULT);
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
			case MarkdownPackage.TABLE_CAPTION__OPENING_MARKER:
				return OPENING_MARKER_EDEFAULT == null ? getOpeningMarker() != null : !OPENING_MARKER_EDEFAULT.equals(getOpeningMarker());
			case MarkdownPackage.TABLE_CAPTION__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case MarkdownPackage.TABLE_CAPTION__CLOSING_MARKER:
				return CLOSING_MARKER_EDEFAULT == null ? getClosingMarker() != null : !CLOSING_MARKER_EDEFAULT.equals(getClosingMarker());
		}
		return super.eIsSet(featureID);
	}

} //TableCaptionImpl
