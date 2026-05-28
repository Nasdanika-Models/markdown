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
import org.nasdanika.models.markdown.Inline;
import org.nasdanika.models.markdown.Link;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.LinkImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends InlineImpl implements Link {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

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
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eDynamicGet(MarkdownPackage.LINK__ATTRIBUTES, MarkdownPackage.Literals.ATTRIBUTABLE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return (String)eDynamicGet(MarkdownPackage.LINK__HREF, MarkdownPackage.Literals.LINK__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		eDynamicSet(MarkdownPackage.LINK__HREF, MarkdownPackage.Literals.LINK__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(MarkdownPackage.LINK__TITLE, MarkdownPackage.Literals.LINK__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(MarkdownPackage.LINK__TITLE, MarkdownPackage.Literals.LINK__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Inline> getLabel() {
		return (EList<Inline>)eDynamicGet(MarkdownPackage.LINK__LABEL, MarkdownPackage.Literals.LINK__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.LINK__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MarkdownPackage.LINK__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case MarkdownPackage.LINK__ATTRIBUTES:
				return getAttributes();
			case MarkdownPackage.LINK__HREF:
				return getHref();
			case MarkdownPackage.LINK__TITLE:
				return getTitle();
			case MarkdownPackage.LINK__LABEL:
				return getLabel();
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
			case MarkdownPackage.LINK__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MarkdownPackage.LINK__HREF:
				setHref((String)newValue);
				return;
			case MarkdownPackage.LINK__TITLE:
				setTitle((String)newValue);
				return;
			case MarkdownPackage.LINK__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends Inline>)newValue);
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
			case MarkdownPackage.LINK__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MarkdownPackage.LINK__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MarkdownPackage.LINK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MarkdownPackage.LINK__LABEL:
				getLabel().clear();
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
			case MarkdownPackage.LINK__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case MarkdownPackage.LINK__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case MarkdownPackage.LINK__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case MarkdownPackage.LINK__LABEL:
				return !getLabel().isEmpty();
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
				case MarkdownPackage.LINK__ATTRIBUTES: return MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES;
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
				case MarkdownPackage.ATTRIBUTABLE__ATTRIBUTES: return MarkdownPackage.LINK__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LinkImpl
