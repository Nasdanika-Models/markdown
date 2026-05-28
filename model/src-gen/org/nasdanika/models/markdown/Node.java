/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Node#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Node#getStartLineNumber <em>Start Line Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Node#getEndOffset <em>End Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Node#getEndLineNumber <em>End Line Number</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset</em>' attribute.
	 * @see #setStartOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getNode_StartOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getStartOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Node#getStartOffset <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset</em>' attribute.
	 * @see #getStartOffset()
	 * @generated
	 */
	void setStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line Number</em>' attribute.
	 * @see #setStartLineNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getNode_StartLineNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getStartLineNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Node#getStartLineNumber <em>Start Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line Number</em>' attribute.
	 * @see #getStartLineNumber()
	 * @generated
	 */
	void setStartLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Offset</em>' attribute.
	 * @see #setEndOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getNode_EndOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getEndOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Node#getEndOffset <em>End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Offset</em>' attribute.
	 * @see #getEndOffset()
	 * @generated
	 */
	void setEndOffset(int value);

	/**
	 * Returns the value of the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line Number</em>' attribute.
	 * @see #setEndLineNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getNode_EndLineNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getEndLineNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Node#getEndLineNumber <em>End Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line Number</em>' attribute.
	 * @see #getEndLineNumber()
	 * @generated
	 */
	void setEndLineNumber(int value);

} // Node
