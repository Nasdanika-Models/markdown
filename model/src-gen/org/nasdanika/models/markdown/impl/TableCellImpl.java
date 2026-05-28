/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Inline;
import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.TableCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCellImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCellImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCellImpl#isIsHeader <em>Is Header</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.TableCellImpl#getInlines <em>Inlines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends MinimalEObjectImpl.Container implements TableCell {
	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsHeader() <em>Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEADER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eDynamicGet(MarkdownPackage.TABLE_CELL__ATTRIBUTES, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlignment() {
		return (String)eDynamicGet(MarkdownPackage.TABLE_CELL__ALIGNMENT, MarkdownPackage.Literals.TABLE_CELL__ALIGNMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignment(String newAlignment) {
		eDynamicSet(MarkdownPackage.TABLE_CELL__ALIGNMENT, MarkdownPackage.Literals.TABLE_CELL__ALIGNMENT, newAlignment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsHeader() {
		return (Boolean)eDynamicGet(MarkdownPackage.TABLE_CELL__IS_HEADER, MarkdownPackage.Literals.TABLE_CELL__IS_HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsHeader(boolean newIsHeader) {
		eDynamicSet(MarkdownPackage.TABLE_CELL__IS_HEADER, MarkdownPackage.Literals.TABLE_CELL__IS_HEADER, newIsHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Inline> getInlines() {
		return (EList<Inline>)eDynamicGet(MarkdownPackage.TABLE_CELL__INLINES, MarkdownPackage.Literals.TABLE_CELL__INLINES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.TABLE_CELL__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MarkdownPackage.TABLE_CELL__INLINES:
				return ((InternalEList<?>)getInlines()).basicRemove(otherEnd, msgs);
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
			case MarkdownPackage.TABLE_CELL__ATTRIBUTES:
				return getAttributes();
			case MarkdownPackage.TABLE_CELL__ALIGNMENT:
				return getAlignment();
			case MarkdownPackage.TABLE_CELL__IS_HEADER:
				return isIsHeader();
			case MarkdownPackage.TABLE_CELL__INLINES:
				return getInlines();
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
			case MarkdownPackage.TABLE_CELL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MarkdownPackage.TABLE_CELL__ALIGNMENT:
				setAlignment((String)newValue);
				return;
			case MarkdownPackage.TABLE_CELL__IS_HEADER:
				setIsHeader((Boolean)newValue);
				return;
			case MarkdownPackage.TABLE_CELL__INLINES:
				getInlines().clear();
				getInlines().addAll((Collection<? extends Inline>)newValue);
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
			case MarkdownPackage.TABLE_CELL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MarkdownPackage.TABLE_CELL__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case MarkdownPackage.TABLE_CELL__IS_HEADER:
				setIsHeader(IS_HEADER_EDEFAULT);
				return;
			case MarkdownPackage.TABLE_CELL__INLINES:
				getInlines().clear();
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
			case MarkdownPackage.TABLE_CELL__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case MarkdownPackage.TABLE_CELL__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? getAlignment() != null : !ALIGNMENT_EDEFAULT.equals(getAlignment());
			case MarkdownPackage.TABLE_CELL__IS_HEADER:
				return isIsHeader() != IS_HEADER_EDEFAULT;
			case MarkdownPackage.TABLE_CELL__INLINES:
				return !getInlines().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableCellImpl
