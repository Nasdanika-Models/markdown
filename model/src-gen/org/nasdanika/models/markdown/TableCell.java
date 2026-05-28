/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.TableCell#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.TableCell#isIsHeader <em>Is Header</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.TableCell#getInlines <em>Inlines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends Attributable {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Alignment hint from the separator row (null = unspecified).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCell_Alignment()
	 * @model unique="false"
	 * @generated
	 */
	String getAlignment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.TableCell#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(String value);

	/**
	 * Returns the value of the '<em><b>Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Header</em>' attribute.
	 * @see #setIsHeader(boolean)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCell_IsHeader()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.TableCell#isIsHeader <em>Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Header</em>' attribute.
	 * @see #isIsHeader()
	 * @generated
	 */
	void setIsHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Inlines</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Inline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlines</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCell_Inlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inline> getInlines();

} // TableCell
