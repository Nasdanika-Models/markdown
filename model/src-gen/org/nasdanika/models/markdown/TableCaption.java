/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Caption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.TableCaption#getOpeningMarker <em>Opening Marker</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.TableCaption#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.TableCaption#getClosingMarker <em>Closing Marker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCaption()
 * @model
 * @generated
 */
public interface TableCaption extends Node {
	/**
	 * Returns the value of the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Marker</em>' attribute.
	 * @see #setOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCaption_OpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.TableCaption#getOpeningMarker <em>Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Marker</em>' attribute.
	 * @see #getOpeningMarker()
	 * @generated
	 */
	void setOpeningMarker(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCaption_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.TableCaption#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Marker</em>' attribute.
	 * @see #setClosingMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getTableCaption_ClosingMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getClosingMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.TableCaption#getClosingMarker <em>Closing Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Marker</em>' attribute.
	 * @see #getClosingMarker()
	 * @generated
	 */
	void setClosingMarker(String value);

} // TableCaption
