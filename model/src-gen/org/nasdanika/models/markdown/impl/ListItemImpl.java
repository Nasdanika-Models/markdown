/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.Block;
import org.nasdanika.models.markdown.ListItem;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListItemImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ListItemImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListItemImpl extends BlockImpl implements ListItem {
	/**
	 * The default value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHECKED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.LIST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getChecked() {
		return (Boolean)eDynamicGet(MarkdownPackage.LIST_ITEM__CHECKED, MarkdownPackage.Literals.LIST_ITEM__CHECKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChecked(Boolean newChecked) {
		eDynamicSet(MarkdownPackage.LIST_ITEM__CHECKED, MarkdownPackage.Literals.LIST_ITEM__CHECKED, newChecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Block> getChildren() {
		return (EList<Block>)eDynamicGet(MarkdownPackage.LIST_ITEM__CHILDREN, MarkdownPackage.Literals.LIST_ITEM__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.LIST_ITEM__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case MarkdownPackage.LIST_ITEM__CHECKED:
				return getChecked();
			case MarkdownPackage.LIST_ITEM__CHILDREN:
				return getChildren();
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
			case MarkdownPackage.LIST_ITEM__CHECKED:
				setChecked((Boolean)newValue);
				return;
			case MarkdownPackage.LIST_ITEM__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Block>)newValue);
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
			case MarkdownPackage.LIST_ITEM__CHECKED:
				setChecked(CHECKED_EDEFAULT);
				return;
			case MarkdownPackage.LIST_ITEM__CHILDREN:
				getChildren().clear();
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
			case MarkdownPackage.LIST_ITEM__CHECKED:
				return CHECKED_EDEFAULT == null ? getChecked() != null : !CHECKED_EDEFAULT.equals(getChecked());
			case MarkdownPackage.LIST_ITEM__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListItemImpl
