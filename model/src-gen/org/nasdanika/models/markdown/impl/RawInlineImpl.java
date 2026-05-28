/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.RawInline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raw Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.RawInlineImpl#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RawInlineImpl extends InlineImpl implements RawInline {
	/**
	 * The default value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RawInlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.RAW_INLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtml() {
		return (String)eDynamicGet(MarkdownPackage.RAW_INLINE__HTML, MarkdownPackage.Literals.RAW_INLINE__HTML, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtml(String newHtml) {
		eDynamicSet(MarkdownPackage.RAW_INLINE__HTML, MarkdownPackage.Literals.RAW_INLINE__HTML, newHtml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.RAW_INLINE__HTML:
				return getHtml();
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
			case MarkdownPackage.RAW_INLINE__HTML:
				setHtml((String)newValue);
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
			case MarkdownPackage.RAW_INLINE__HTML:
				setHtml(HTML_EDEFAULT);
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
			case MarkdownPackage.RAW_INLINE__HTML:
				return HTML_EDEFAULT == null ? getHtml() != null : !HTML_EDEFAULT.equals(getHtml());
		}
		return super.eIsSet(featureID);
	}

} //RawInlineImpl
