/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.FencedCodeBlock;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fenced Code Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getClosingFence <em>Closing Fence</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getClosingMarker <em>Closing Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getFenceIndent <em>Fence Indent</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getFenceLength <em>Fence Length</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getOpeningFence <em>Opening Fence</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl#getOpeningMarker <em>Opening Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FencedCodeBlockImpl extends BlockImpl implements FencedCodeBlock {
	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClosingFence() <em>Closing Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingFence()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSING_FENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClosingMarker() <em>Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSING_MARKER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFenceIndent() <em>Fence Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFenceIndent()
	 * @generated
	 * @ordered
	 */
	protected static final int FENCE_INDENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getFenceLength() <em>Fence Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFenceLength()
	 * @generated
	 * @ordered
	 */
	protected static final int FENCE_LENGTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getOpeningFence() <em>Opening Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningFence()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_FENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpeningMarker() <em>Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_MARKER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FencedCodeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.FENCED_CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfo() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__INFO, MarkdownPackage.Literals.FENCED_CODE_BLOCK__INFO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(String newInfo) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__INFO, MarkdownPackage.Literals.FENCED_CODE_BLOCK__INFO, newInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClosingFence() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE, MarkdownPackage.Literals.FENCED_CODE_BLOCK__CLOSING_FENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingFence(String newClosingFence) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE, MarkdownPackage.Literals.FENCED_CODE_BLOCK__CLOSING_FENCE, newClosingFence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClosingMarker() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER, MarkdownPackage.Literals.FENCED_CODE_BLOCK__CLOSING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingMarker(String newClosingMarker) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER, MarkdownPackage.Literals.FENCED_CODE_BLOCK__CLOSING_MARKER, newClosingMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFenceIndent() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT, MarkdownPackage.Literals.FENCED_CODE_BLOCK__FENCE_INDENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFenceIndent(int newFenceIndent) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT, MarkdownPackage.Literals.FENCED_CODE_BLOCK__FENCE_INDENT, newFenceIndent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFenceLength() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH, MarkdownPackage.Literals.FENCED_CODE_BLOCK__FENCE_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFenceLength(int newFenceLength) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH, MarkdownPackage.Literals.FENCED_CODE_BLOCK__FENCE_LENGTH, newFenceLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningFence() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE, MarkdownPackage.Literals.FENCED_CODE_BLOCK__OPENING_FENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningFence(String newOpeningFence) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE, MarkdownPackage.Literals.FENCED_CODE_BLOCK__OPENING_FENCE, newOpeningFence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningMarker() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER, MarkdownPackage.Literals.FENCED_CODE_BLOCK__OPENING_MARKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningMarker(String newOpeningMarker) {
		eDynamicSet(MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER, MarkdownPackage.Literals.FENCED_CODE_BLOCK__OPENING_MARKER, newOpeningMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.FENCED_CODE_BLOCK__INFO:
				return getInfo();
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE:
				return getClosingFence();
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER:
				return getClosingMarker();
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT:
				return getFenceIndent();
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH:
				return getFenceLength();
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE:
				return getOpeningFence();
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER:
				return getOpeningMarker();
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
			case MarkdownPackage.FENCED_CODE_BLOCK__INFO:
				setInfo((String)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE:
				setClosingFence((String)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER:
				setClosingMarker((String)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT:
				setFenceIndent((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH:
				setFenceLength((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE:
				setOpeningFence((String)newValue);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER:
				setOpeningMarker((String)newValue);
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
			case MarkdownPackage.FENCED_CODE_BLOCK__INFO:
				setInfo(INFO_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE:
				setClosingFence(CLOSING_FENCE_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER:
				setClosingMarker(CLOSING_MARKER_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT:
				setFenceIndent(FENCE_INDENT_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH:
				setFenceLength(FENCE_LENGTH_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE:
				setOpeningFence(OPENING_FENCE_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER:
				setOpeningMarker(OPENING_MARKER_EDEFAULT);
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
			case MarkdownPackage.FENCED_CODE_BLOCK__INFO:
				return INFO_EDEFAULT == null ? getInfo() != null : !INFO_EDEFAULT.equals(getInfo());
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_FENCE:
				return CLOSING_FENCE_EDEFAULT == null ? getClosingFence() != null : !CLOSING_FENCE_EDEFAULT.equals(getClosingFence());
			case MarkdownPackage.FENCED_CODE_BLOCK__CLOSING_MARKER:
				return CLOSING_MARKER_EDEFAULT == null ? getClosingMarker() != null : !CLOSING_MARKER_EDEFAULT.equals(getClosingMarker());
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_INDENT:
				return getFenceIndent() != FENCE_INDENT_EDEFAULT;
			case MarkdownPackage.FENCED_CODE_BLOCK__FENCE_LENGTH:
				return getFenceLength() != FENCE_LENGTH_EDEFAULT;
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_FENCE:
				return OPENING_FENCE_EDEFAULT == null ? getOpeningFence() != null : !OPENING_FENCE_EDEFAULT.equals(getOpeningFence());
			case MarkdownPackage.FENCED_CODE_BLOCK__OPENING_MARKER:
				return OPENING_MARKER_EDEFAULT == null ? getOpeningMarker() != null : !OPENING_MARKER_EDEFAULT.equals(getOpeningMarker());
		}
		return super.eIsSet(featureID);
	}

} //FencedCodeBlockImpl
