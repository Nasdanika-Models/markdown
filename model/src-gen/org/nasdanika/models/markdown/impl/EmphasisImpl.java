/**
 */
package org.nasdanika.models.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.markdown.Emphasis;
import org.nasdanika.models.markdown.EmphasisKind;
import org.nasdanika.models.markdown.Inline;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emphasis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.EmphasisImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.EmphasisImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmphasisImpl extends InlineImpl implements Emphasis {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EmphasisKind KIND_EDEFAULT = EmphasisKind.ITALIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmphasisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.EMPHASIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmphasisKind getKind() {
		return (EmphasisKind)eDynamicGet(MarkdownPackage.EMPHASIS__KIND, MarkdownPackage.Literals.EMPHASIS__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(EmphasisKind newKind) {
		eDynamicSet(MarkdownPackage.EMPHASIS__KIND, MarkdownPackage.Literals.EMPHASIS__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Inline> getChildren() {
		return (EList<Inline>)eDynamicGet(MarkdownPackage.EMPHASIS__CHILDREN, MarkdownPackage.Literals.EMPHASIS__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.EMPHASIS__CHILDREN:
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
			case MarkdownPackage.EMPHASIS__KIND:
				return getKind();
			case MarkdownPackage.EMPHASIS__CHILDREN:
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
			case MarkdownPackage.EMPHASIS__KIND:
				setKind((EmphasisKind)newValue);
				return;
			case MarkdownPackage.EMPHASIS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Inline>)newValue);
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
			case MarkdownPackage.EMPHASIS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MarkdownPackage.EMPHASIS__CHILDREN:
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
			case MarkdownPackage.EMPHASIS__KIND:
				return getKind() != KIND_EDEFAULT;
			case MarkdownPackage.EMPHASIS__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmphasisImpl
