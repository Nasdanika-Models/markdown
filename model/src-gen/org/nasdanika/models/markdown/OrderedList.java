/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.OrderedList#getStartNumber <em>Start Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.OrderedList#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getOrderedList()
 * @model
 * @generated
 */
public interface OrderedList extends ListBlock {
	/**
	 * Returns the value of the '<em><b>Start Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Number</em>' attribute.
	 * @see #setStartNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getOrderedList_StartNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getStartNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.OrderedList#getStartNumber <em>Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Number</em>' attribute.
	 * @see #getStartNumber()
	 * @generated
	 */
	void setStartNumber(int value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getOrderedList_Delimiter()
	 * @model unique="false"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.OrderedList#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

} // OrderedList
