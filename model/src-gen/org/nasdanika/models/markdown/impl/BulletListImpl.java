/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.BulletList;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bullet List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.BulletListImpl#getOpeningMarker <em>Opening Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BulletListImpl extends ListBlockImpl implements BulletList {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulletListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.BULLET_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.BULLET_LIST__OPENING_MARKER, MarkdownPackage.Literals.BULLET_LIST__OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningMarker(String newOpeningMarker) {
		eDynamicSet(MarkdownPackage.BULLET_LIST__OPENING_MARKER, MarkdownPackage.Literals.BULLET_LIST__OPENING_MARKER, newOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.BULLET_LIST__OPENING_MARKER:
				return getOpeningMarker();
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
			case MarkdownPackage.BULLET_LIST__OPENING_MARKER:
				setOpeningMarker((String)newValue);
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
			case MarkdownPackage.BULLET_LIST__OPENING_MARKER:
				setOpeningMarker(OPENING_MARKER_EDEFAULT);
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
			case MarkdownPackage.BULLET_LIST__OPENING_MARKER:
				return OPENING_MARKER_EDEFAULT == null ? getOpeningMarker() != null : !OPENING_MARKER_EDEFAULT.equals(getOpeningMarker());
		}
		return super.eIsSet(featureID);
	}

} //BulletListImpl
