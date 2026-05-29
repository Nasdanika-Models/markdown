/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.Attributable;
import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Block;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.BlockImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.BlockImpl#getAttributesStartOffset <em>Attributes Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.BlockImpl#getAttributesEndOffset <em>Attributes End Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockImpl extends ContentNodeImpl implements Block {
	/**
	 * The default value of the '{@link #getAttributesStartOffset() <em>Attributes Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTRIBUTES_START_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAttributesEndOffset() <em>Attributes End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesEndOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTRIBUTES_END_OFFSET_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eDynamicGet(MarkdownPackage.BLOCK__ATTRIBUTES, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttributesStartOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES_START_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributesStartOffset(int newAttributesStartOffset) {
		eDynamicSet(MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES_START_OFFSET, newAttributesStartOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttributesEndOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES_END_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributesEndOffset(int newAttributesEndOffset) {
		eDynamicSet(MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES_END_OFFSET, newAttributesEndOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.BLOCK__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case MarkdownPackage.BLOCK__ATTRIBUTES:
				return getAttributes();
			case MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET:
				return getAttributesStartOffset();
			case MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET:
				return getAttributesEndOffset();
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
			case MarkdownPackage.BLOCK__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET:
				setAttributesStartOffset((Integer)newValue);
				return;
			case MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET:
				setAttributesEndOffset((Integer)newValue);
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
			case MarkdownPackage.BLOCK__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET:
				setAttributesStartOffset(ATTRIBUTES_START_OFFSET_EDEFAULT);
				return;
			case MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET:
				setAttributesEndOffset(ATTRIBUTES_END_OFFSET_EDEFAULT);
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
			case MarkdownPackage.BLOCK__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET:
				return getAttributesStartOffset() != ATTRIBUTES_START_OFFSET_EDEFAULT;
			case MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET:
				return getAttributesEndOffset() != ATTRIBUTES_END_OFFSET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Attributable.class) {
			switch (derivedFeatureID) {
				case MarkdownPackage.BLOCK__ATTRIBUTES: return MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES;
				case MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET: return MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES_START_OFFSET;
				case MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET: return MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES_END_OFFSET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Attributable.class) {
			switch (baseFeatureID) {
				case MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES: return MarkdownPackage.BLOCK__ATTRIBUTES;
				case MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES_START_OFFSET: return MarkdownPackage.BLOCK__ATTRIBUTES_START_OFFSET;
				case MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES_END_OFFSET: return MarkdownPackage.BLOCK__ATTRIBUTES_END_OFFSET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BlockImpl
