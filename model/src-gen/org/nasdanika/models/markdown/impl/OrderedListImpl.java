/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.OrderedList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.OrderedListImpl#getStartNumber <em>Start Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.OrderedListImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderedListImpl extends ListBlockImpl implements OrderedList {
	/**
	 * The default value of the '{@link #getStartNumber() <em>Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int START_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.ORDERED_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.ORDERED_LIST__START_NUMBER, MarkdownPackage.Literals.ORDERED_LIST__START_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartNumber(int newStartNumber) {
		eDynamicSet(MarkdownPackage.ORDERED_LIST__START_NUMBER, MarkdownPackage.Literals.ORDERED_LIST__START_NUMBER, newStartNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiter() {
		return (String)eDynamicGet(MarkdownPackage.ORDERED_LIST__DELIMITER, MarkdownPackage.Literals.ORDERED_LIST__DELIMITER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(String newDelimiter) {
		eDynamicSet(MarkdownPackage.ORDERED_LIST__DELIMITER, MarkdownPackage.Literals.ORDERED_LIST__DELIMITER, newDelimiter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.ORDERED_LIST__START_NUMBER:
				return getStartNumber();
			case MarkdownPackage.ORDERED_LIST__DELIMITER:
				return getDelimiter();
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
			case MarkdownPackage.ORDERED_LIST__START_NUMBER:
				setStartNumber((Integer)newValue);
				return;
			case MarkdownPackage.ORDERED_LIST__DELIMITER:
				setDelimiter((String)newValue);
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
			case MarkdownPackage.ORDERED_LIST__START_NUMBER:
				setStartNumber(START_NUMBER_EDEFAULT);
				return;
			case MarkdownPackage.ORDERED_LIST__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
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
			case MarkdownPackage.ORDERED_LIST__START_NUMBER:
				return getStartNumber() != START_NUMBER_EDEFAULT;
			case MarkdownPackage.ORDERED_LIST__DELIMITER:
				return DELIMITER_EDEFAULT == null ? getDelimiter() != null : !DELIMITER_EDEFAULT.equals(getDelimiter());
		}
		return super.eIsSet(featureID);
	}

} //OrderedListImpl
