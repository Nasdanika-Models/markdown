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
import org.nasdanika.models.markdown.Image;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.ImageImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ImageImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ImageImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.ImageImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends InlineImpl implements Image {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eDynamicGet(MarkdownPackage.IMAGE__ATTRIBUTES, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrc() {
		return (String)eDynamicGet(MarkdownPackage.IMAGE__SRC, MarkdownPackage.Literals.IMAGE__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(String newSrc) {
		eDynamicSet(MarkdownPackage.IMAGE__SRC, MarkdownPackage.Literals.IMAGE__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlt() {
		return (String)eDynamicGet(MarkdownPackage.IMAGE__ALT, MarkdownPackage.Literals.IMAGE__ALT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(String newAlt) {
		eDynamicSet(MarkdownPackage.IMAGE__ALT, MarkdownPackage.Literals.IMAGE__ALT, newAlt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(MarkdownPackage.IMAGE__TITLE, MarkdownPackage.Literals.IMAGE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(MarkdownPackage.IMAGE__TITLE, MarkdownPackage.Literals.IMAGE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.IMAGE__ATTRIBUTES:
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
			case MarkdownPackage.IMAGE__ATTRIBUTES:
				return getAttributes();
			case MarkdownPackage.IMAGE__SRC:
				return getSrc();
			case MarkdownPackage.IMAGE__ALT:
				return getAlt();
			case MarkdownPackage.IMAGE__TITLE:
				return getTitle();
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
			case MarkdownPackage.IMAGE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MarkdownPackage.IMAGE__SRC:
				setSrc((String)newValue);
				return;
			case MarkdownPackage.IMAGE__ALT:
				setAlt((String)newValue);
				return;
			case MarkdownPackage.IMAGE__TITLE:
				setTitle((String)newValue);
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
			case MarkdownPackage.IMAGE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MarkdownPackage.IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case MarkdownPackage.IMAGE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case MarkdownPackage.IMAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case MarkdownPackage.IMAGE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case MarkdownPackage.IMAGE__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case MarkdownPackage.IMAGE__ALT:
				return ALT_EDEFAULT == null ? getAlt() != null : !ALT_EDEFAULT.equals(getAlt());
			case MarkdownPackage.IMAGE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
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
				case MarkdownPackage.IMAGE__ATTRIBUTES: return MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES;
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
				case MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES: return MarkdownPackage.IMAGE__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ImageImpl
