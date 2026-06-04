/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.FencedDiv;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fenced Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getClosingStartOffset <em>Closing Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getClosingStartLineNumber <em>Closing Start Line Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getClosingEndOffset <em>Closing End Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.FencedDivImpl#getClosingEndLineNumber <em>Closing End Line Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FencedDivImpl extends ParagraphImpl implements FencedDiv {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClosingStartOffset() <em>Closing Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSING_START_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClosingStartLineNumber() <em>Closing Start Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingStartLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSING_START_LINE_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClosingEndOffset() <em>Closing End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingEndOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSING_END_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClosingEndLineNumber() <em>Closing End Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingEndLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSING_END_LINE_NUMBER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FencedDivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.FENCED_DIV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(MarkdownPackage.FENCED_DIV__TEXT, MarkdownPackage.Literals.CONTAINER__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__TEXT, MarkdownPackage.Literals.CONTAINER__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_DIV__LEVEL, MarkdownPackage.Literals.FENCED_DIV__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__LEVEL, MarkdownPackage.Literals.FENCED_DIV__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClosingStartOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET, MarkdownPackage.Literals.FENCED_DIV__CLOSING_START_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingStartOffset(int newClosingStartOffset) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET, MarkdownPackage.Literals.FENCED_DIV__CLOSING_START_OFFSET, newClosingStartOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClosingStartLineNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER, MarkdownPackage.Literals.FENCED_DIV__CLOSING_START_LINE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingStartLineNumber(int newClosingStartLineNumber) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER, MarkdownPackage.Literals.FENCED_DIV__CLOSING_START_LINE_NUMBER, newClosingStartLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClosingEndOffset() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET, MarkdownPackage.Literals.FENCED_DIV__CLOSING_END_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingEndOffset(int newClosingEndOffset) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET, MarkdownPackage.Literals.FENCED_DIV__CLOSING_END_OFFSET, newClosingEndOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClosingEndLineNumber() {
		return (Integer)eDynamicGet(MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER, MarkdownPackage.Literals.FENCED_DIV__CLOSING_END_LINE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingEndLineNumber(int newClosingEndLineNumber) {
		eDynamicSet(MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER, MarkdownPackage.Literals.FENCED_DIV__CLOSING_END_LINE_NUMBER, newClosingEndLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.FENCED_DIV__TEXT:
				return getText();
			case MarkdownPackage.FENCED_DIV__LEVEL:
				return getLevel();
			case MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET:
				return getClosingStartOffset();
			case MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER:
				return getClosingStartLineNumber();
			case MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET:
				return getClosingEndOffset();
			case MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER:
				return getClosingEndLineNumber();
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
			case MarkdownPackage.FENCED_DIV__TEXT:
				setText((String)newValue);
				return;
			case MarkdownPackage.FENCED_DIV__LEVEL:
				setLevel((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET:
				setClosingStartOffset((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER:
				setClosingStartLineNumber((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET:
				setClosingEndOffset((Integer)newValue);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER:
				setClosingEndLineNumber((Integer)newValue);
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
			case MarkdownPackage.FENCED_DIV__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_DIV__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET:
				setClosingStartOffset(CLOSING_START_OFFSET_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER:
				setClosingStartLineNumber(CLOSING_START_LINE_NUMBER_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET:
				setClosingEndOffset(CLOSING_END_OFFSET_EDEFAULT);
				return;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER:
				setClosingEndLineNumber(CLOSING_END_LINE_NUMBER_EDEFAULT);
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
			case MarkdownPackage.FENCED_DIV__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case MarkdownPackage.FENCED_DIV__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_OFFSET:
				return getClosingStartOffset() != CLOSING_START_OFFSET_EDEFAULT;
			case MarkdownPackage.FENCED_DIV__CLOSING_START_LINE_NUMBER:
				return getClosingStartLineNumber() != CLOSING_START_LINE_NUMBER_EDEFAULT;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_OFFSET:
				return getClosingEndOffset() != CLOSING_END_OFFSET_EDEFAULT;
			case MarkdownPackage.FENCED_DIV__CLOSING_END_LINE_NUMBER:
				return getClosingEndLineNumber() != CLOSING_END_LINE_NUMBER_EDEFAULT;
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
		if (baseClass == org.nasdanika.models.markdown.Container.class) {
			switch (derivedFeatureID) {
				case MarkdownPackage.FENCED_DIV__TEXT: return MarkdownPackage.CONTAINER__TEXT;
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
		if (baseClass == org.nasdanika.models.markdown.Container.class) {
			switch (baseFeatureID) {
				case MarkdownPackage.CONTAINER__TEXT: return MarkdownPackage.FENCED_DIV__TEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FencedDivImpl
