/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.CodeBlock;
import org.nasdanika.models.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.impl.CodeBlockImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.impl.CodeBlockImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeBlockImpl extends BlockImpl implements CodeBlock {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(MarkdownPackage.CODE_BLOCK__LANGUAGE, MarkdownPackage.Literals.CODE_BLOCK__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(MarkdownPackage.CODE_BLOCK__LANGUAGE, MarkdownPackage.Literals.CODE_BLOCK__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return (String)eDynamicGet(MarkdownPackage.CODE_BLOCK__CONTENT, MarkdownPackage.Literals.CODE_BLOCK__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		eDynamicSet(MarkdownPackage.CODE_BLOCK__CONTENT, MarkdownPackage.Literals.CODE_BLOCK__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkdownPackage.CODE_BLOCK__LANGUAGE:
				return getLanguage();
			case MarkdownPackage.CODE_BLOCK__CONTENT:
				return getContent();
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
			case MarkdownPackage.CODE_BLOCK__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case MarkdownPackage.CODE_BLOCK__CONTENT:
				setContent((String)newValue);
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
			case MarkdownPackage.CODE_BLOCK__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case MarkdownPackage.CODE_BLOCK__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case MarkdownPackage.CODE_BLOCK__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case MarkdownPackage.CODE_BLOCK__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
		}
		return super.eIsSet(featureID);
	}

} //CodeBlockImpl
