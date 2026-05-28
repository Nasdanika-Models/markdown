/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A single item inside a list (bullet or ordered).
 * Items may themselves contain block-level children (nested lists, paragraphs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.ListItem#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.ListItem#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends Block {
	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checked state for task-list items; null means not a task-list item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see #setChecked(Boolean)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getListItem_Checked()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getChecked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.ListItem#getChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #getChecked()
	 * @generated
	 */
	void setChecked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getListItem_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getChildren();

} // ListItem
