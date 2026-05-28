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
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.DocumentImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.DocumentImpl#getSourceUri <em>Source Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends BlockImpl implements Document {
	/**
	 * The default value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Block> getBlocks() {
		return (EList<Block>)eDynamicGet(MarkdownPackage.DOCUMENT__BLOCKS, MarkdownPackage.Literals.DOCUMENT__BLOCKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceUri() {
		return (String)eDynamicGet(MarkdownPackage.DOCUMENT__SOURCE_URI, MarkdownPackage.Literals.DOCUMENT__SOURCE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceUri(String newSourceUri) {
		eDynamicSet(MarkdownPackage.DOCUMENT__SOURCE_URI, MarkdownPackage.Literals.DOCUMENT__SOURCE_URI, newSourceUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkdownPackage.DOCUMENT__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
			case MarkdownPackage.DOCUMENT__BLOCKS:
				return getBlocks();
			case MarkdownPackage.DOCUMENT__SOURCE_URI:
				return getSourceUri();
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
			case MarkdownPackage.DOCUMENT__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case MarkdownPackage.DOCUMENT__SOURCE_URI:
				setSourceUri((String)newValue);
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
			case MarkdownPackage.DOCUMENT__BLOCKS:
				getBlocks().clear();
				return;
			case MarkdownPackage.DOCUMENT__SOURCE_URI:
				setSourceUri(SOURCE_URI_EDEFAULT);
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
			case MarkdownPackage.DOCUMENT__BLOCKS:
				return !getBlocks().isEmpty();
			case MarkdownPackage.DOCUMENT__SOURCE_URI:
				return SOURCE_URI_EDEFAULT == null ? getSourceUri() != null : !SOURCE_URI_EDEFAULT.equals(getSourceUri());
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
