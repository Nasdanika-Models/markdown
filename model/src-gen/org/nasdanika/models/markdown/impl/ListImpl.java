/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.List;
import org.nasdanika.models.markdown.ListItem;
import org.nasdanika.models.markdown.ListType;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListImpl#getListType <em>List Type</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListImpl#getStartNumber <em>Start Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListImpl#isLoose <em>Loose</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends BlockImpl implements List {
	/**
	 * The default value of the '{@link #getListType() <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListType()
	 * @generated
	 * @ordered
	 */
	protected static final ListType LIST_TYPE_EDEFAULT = ListType.BULLET;

	/**
	 * The default value of the '{@link #getStartNumber() <em>Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int START_NUMBER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #isLoose() <em>Loose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOSE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType getListType() {
		return (ListType)eDynamicGet(MarkdownPackage.LIST__LIST_TYPE, MarkdownPackage.Literals.LIST__LIST_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListType(ListType newListType) {
		eDynamicSet(MarkdownPackage.LIST__LIST_TYPE, MarkdownPackage.Literals.LIST__LIST_TYPE, newListType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.LIST__START_NUMBER, MarkdownPackage.Literals.LIST__START_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartNumber(int newStartNumber) {
		eDynamicSet(MarkdownPackage.LIST__START_NUMBER, MarkdownPackage.Literals.LIST__START_NUMBER, newStartNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLoose() {
		return (Boolean)eDynamicGet(MarkdownPackage.LIST__LOOSE, MarkdownPackage.Literals.LIST__LOOSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoose(boolean newLoose) {
		eDynamicSet(MarkdownPackage.LIST__LOOSE, MarkdownPackage.Literals.LIST__LOOSE, newLoose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ListItem> getItems() {
		return (EList<ListItem>)eDynamicGet(MarkdownPackage.LIST__ITEMS, MarkdownPackage.Literals.LIST__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.LIST__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.LIST__LIST_TYPE:
				return getListType();
			case MarkdownPackage.LIST__START_NUMBER:
				return getStartNumber();
			case MarkdownPackage.LIST__LOOSE:
				return isLoose();
			case MarkdownPackage.LIST__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MarkdownPackage.LIST__LIST_TYPE:
				setListType((ListType)newValue);
				return;
			case MarkdownPackage.LIST__START_NUMBER:
				setStartNumber((Integer)newValue);
				return;
			case MarkdownPackage.LIST__LOOSE:
				setLoose((Boolean)newValue);
				return;
			case MarkdownPackage.LIST__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ListItem>)newValue);
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
			case MarkdownPackage.LIST__LIST_TYPE:
				setListType(LIST_TYPE_EDEFAULT);
				return;
			case MarkdownPackage.LIST__START_NUMBER:
				setStartNumber(START_NUMBER_EDEFAULT);
				return;
			case MarkdownPackage.LIST__LOOSE:
				setLoose(LOOSE_EDEFAULT);
				return;
			case MarkdownPackage.LIST__ITEMS:
				getItems().clear();
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
			case MarkdownPackage.LIST__LIST_TYPE:
				return getListType() != LIST_TYPE_EDEFAULT;
			case MarkdownPackage.LIST__START_NUMBER:
				return getStartNumber() != START_NUMBER_EDEFAULT;
			case MarkdownPackage.LIST__LOOSE:
				return isLoose() != LOOSE_EDEFAULT;
			case MarkdownPackage.LIST__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
