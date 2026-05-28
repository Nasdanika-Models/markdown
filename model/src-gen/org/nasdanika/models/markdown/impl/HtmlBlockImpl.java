/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.HtmlBlock;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Html Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.HtmlBlockImpl#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtmlBlockImpl extends BlockImpl implements HtmlBlock {
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
	protected HtmlBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.HTML_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtml() {
		return (String)eDynamicGet(MarkdownPackage.HTML_BLOCK__HTML, MarkdownPackage.Literals.HTML_BLOCK__HTML, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtml(String newHtml) {
		eDynamicSet(MarkdownPackage.HTML_BLOCK__HTML, MarkdownPackage.Literals.HTML_BLOCK__HTML, newHtml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.HTML_BLOCK__HTML:
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
			case MarkdownPackage.HTML_BLOCK__HTML:
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
			case MarkdownPackage.HTML_BLOCK__HTML:
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
			case MarkdownPackage.HTML_BLOCK__HTML:
				return HTML_EDEFAULT == null ? getHtml() != null : !HTML_EDEFAULT.equals(getHtml());
		}
		return super.eIsSet(featureID);
	}

} //HtmlBlockImpl
