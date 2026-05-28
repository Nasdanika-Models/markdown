/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A bullet (unordered) or ordered list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.List#getListType <em>List Type</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.List#getStartNumber <em>Start Number</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.List#isLoose <em>Loose</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.List#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getList()
 * @model
 * @generated
 */
public interface List extends Block {
	/**
	 * Returns the value of the '<em><b>List Type</b></em>' attribute.
	 * The default value is <code>"BULLET"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.markdown.ListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Type</em>' attribute.
	 * @see org.nasdanika.models.markdown.ListType
	 * @see #setListType(ListType)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getList_ListType()
	 * @model default="BULLET" unique="false" required="true"
	 * @generated
	 */
	ListType getListType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.List#getListType <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Type</em>' attribute.
	 * @see org.nasdanika.models.markdown.ListType
	 * @see #getListType()
	 * @generated
	 */
	void setListType(ListType value);

	/**
	 * Returns the value of the '<em><b>Start Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Starting number for ordered lists (ignored for bullet lists).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Number</em>' attribute.
	 * @see #setStartNumber(int)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getList_StartNumber()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getStartNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.List#getStartNumber <em>Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Number</em>' attribute.
	 * @see #getStartNumber()
	 * @generated
	 */
	void setStartNumber(int value);

	/**
	 * Returns the value of the '<em><b>Loose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether list items are separated by blank lines (loose) or not (tight).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loose</em>' attribute.
	 * @see #setLoose(boolean)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getList_Loose()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLoose();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.List#isLoose <em>Loose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loose</em>' attribute.
	 * @see #isLoose()
	 * @generated
	 */
	void setLoose(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

} // List
