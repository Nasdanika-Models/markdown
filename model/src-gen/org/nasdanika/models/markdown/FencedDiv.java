/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fenced Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A paragraph starting with 3 or more colons.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.FencedDiv#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedDiv#getClosingStartOffset <em>Closing Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedDiv#getClosingStartLineNumber <em>Closing Start Line Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedDiv#getClosingEndOffset <em>Closing End Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.FencedDiv#getClosingEndLineNumber <em>Closing End Line Number</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv()
 * @model
 * @generated
 */
public interface FencedDiv extends Paragraph, Container {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Number of colons minus 2. E.g. 1 for :::, 2 for ::::
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv_Level()
	 * @model unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedDiv#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Closing Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Start Offset</em>' attribute.
	 * @see #setClosingStartOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv_ClosingStartOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getClosingStartOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedDiv#getClosingStartOffset <em>Closing Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Start Offset</em>' attribute.
	 * @see #getClosingStartOffset()
	 * @generated
	 */
	void setClosingStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>Closing Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Start Line Number</em>' attribute.
	 * @see #setClosingStartLineNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv_ClosingStartLineNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getClosingStartLineNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedDiv#getClosingStartLineNumber <em>Closing Start Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Start Line Number</em>' attribute.
	 * @see #getClosingStartLineNumber()
	 * @generated
	 */
	void setClosingStartLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>Closing End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing End Offset</em>' attribute.
	 * @see #setClosingEndOffset(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv_ClosingEndOffset()
	 * @model unique="false"
	 * @generated
	 */
	int getClosingEndOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedDiv#getClosingEndOffset <em>Closing End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing End Offset</em>' attribute.
	 * @see #getClosingEndOffset()
	 * @generated
	 */
	void setClosingEndOffset(int value);

	/**
	 * Returns the value of the '<em><b>Closing End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing End Line Number</em>' attribute.
	 * @see #setClosingEndLineNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getFencedDiv_ClosingEndLineNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getClosingEndLineNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.FencedDiv#getClosingEndLineNumber <em>Closing End Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing End Line Number</em>' attribute.
	 * @see #getClosingEndLineNumber()
	 * @generated
	 */
	void setClosingEndLineNumber(int value);

} // FencedDiv
