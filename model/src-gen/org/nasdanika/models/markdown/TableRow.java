/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.TableRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends Attributable {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableCell> getCells();

} // TableRow
