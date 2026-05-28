/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;
import org.nasdanika.models.markdown.Inline;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.HeadingImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.HeadingImpl#getInlines <em>Inlines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadingImpl extends BlockImpl implements Heading {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HeadingLevel LEVEL_EDEFAULT = HeadingLevel.H1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.HEADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadingLevel getLevel() {
		return (HeadingLevel)eDynamicGet(MarkdownPackage.HEADING__LEVEL, MarkdownPackage.Literals.HEADING__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(HeadingLevel newLevel) {
		eDynamicSet(MarkdownPackage.HEADING__LEVEL, MarkdownPackage.Literals.HEADING__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Inline> getInlines() {
		return (EList<Inline>)eDynamicGet(MarkdownPackage.HEADING__INLINES, MarkdownPackage.Literals.HEADING__INLINES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.HEADING__INLINES:
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
			case MarkdownPackage.HEADING__LEVEL:
				return getLevel();
			case MarkdownPackage.HEADING__INLINES:
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
			case MarkdownPackage.HEADING__LEVEL:
				setLevel((HeadingLevel)newValue);
				return;
			case MarkdownPackage.HEADING__INLINES:
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
			case MarkdownPackage.HEADING__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case MarkdownPackage.HEADING__INLINES:
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
			case MarkdownPackage.HEADING__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case MarkdownPackage.HEADING__INLINES:
				return !getInlines().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HeadingImpl
