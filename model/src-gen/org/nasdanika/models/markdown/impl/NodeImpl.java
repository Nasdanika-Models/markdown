/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.NodeImpl#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.NodeImpl#getStartLineNumber <em>Start Line Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.NodeImpl#getEndOffset <em>End Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.NodeImpl#getEndLineNumber <em>End Line Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int START_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartLineNumber() <em>Start Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LINE_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndOffset() <em>End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int END_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndLineNumber() <em>End Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int END_LINE_NUMBER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.NODE;
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
	@Override
	public int getStartOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.NODE__START_OFFSET, MarkdownPackage.Literals.NODE__START_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartOffset(int newStartOffset) {
		eDynamicSet(MarkdownPackage.NODE__START_OFFSET, MarkdownPackage.Literals.NODE__START_OFFSET, newStartOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartLineNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.NODE__START_LINE_NUMBER, MarkdownPackage.Literals.NODE__START_LINE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartLineNumber(int newStartLineNumber) {
		eDynamicSet(MarkdownPackage.NODE__START_LINE_NUMBER, MarkdownPackage.Literals.NODE__START_LINE_NUMBER, newStartLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.NODE__END_OFFSET, MarkdownPackage.Literals.NODE__END_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndOffset(int newEndOffset) {
		eDynamicSet(MarkdownPackage.NODE__END_OFFSET, MarkdownPackage.Literals.NODE__END_OFFSET, newEndOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndLineNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.NODE__END_LINE_NUMBER, MarkdownPackage.Literals.NODE__END_LINE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndLineNumber(int newEndLineNumber) {
		eDynamicSet(MarkdownPackage.NODE__END_LINE_NUMBER, MarkdownPackage.Literals.NODE__END_LINE_NUMBER, newEndLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.NODE__START_OFFSET:
				return getStartOffset();
			case MarkdownPackage.NODE__START_LINE_NUMBER:
				return getStartLineNumber();
			case MarkdownPackage.NODE__END_OFFSET:
				return getEndOffset();
			case MarkdownPackage.NODE__END_LINE_NUMBER:
				return getEndLineNumber();
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
			case MarkdownPackage.NODE__START_OFFSET:
				setStartOffset((Integer)newValue);
				return;
			case MarkdownPackage.NODE__START_LINE_NUMBER:
				setStartLineNumber((Integer)newValue);
				return;
			case MarkdownPackage.NODE__END_OFFSET:
				setEndOffset((Integer)newValue);
				return;
			case MarkdownPackage.NODE__END_LINE_NUMBER:
				setEndLineNumber((Integer)newValue);
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
			case MarkdownPackage.NODE__START_OFFSET:
				setStartOffset(START_OFFSET_EDEFAULT);
				return;
			case MarkdownPackage.NODE__START_LINE_NUMBER:
				setStartLineNumber(START_LINE_NUMBER_EDEFAULT);
				return;
			case MarkdownPackage.NODE__END_OFFSET:
				setEndOffset(END_OFFSET_EDEFAULT);
				return;
			case MarkdownPackage.NODE__END_LINE_NUMBER:
				setEndLineNumber(END_LINE_NUMBER_EDEFAULT);
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
			case MarkdownPackage.NODE__START_OFFSET:
				return getStartOffset() != START_OFFSET_EDEFAULT;
			case MarkdownPackage.NODE__START_LINE_NUMBER:
				return getStartLineNumber() != START_LINE_NUMBER_EDEFAULT;
			case MarkdownPackage.NODE__END_OFFSET:
				return getEndOffset() != END_OFFSET_EDEFAULT;
			case MarkdownPackage.NODE__END_LINE_NUMBER:
				return getEndLineNumber() != END_LINE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
