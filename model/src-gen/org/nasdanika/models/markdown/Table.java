/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A GFM-style table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Table#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Block {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(TableRow)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTable_Header()
	 * @model containment="true"
	 * @generated
	 */
	TableRow getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Table#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(TableRow value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTable_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getBody();

} // Table
