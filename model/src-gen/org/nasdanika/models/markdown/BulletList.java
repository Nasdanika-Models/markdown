/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bullet List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.BulletList#getOpeningMarker <em>Opening Marker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getBulletList()
 * @model
 * @generated
 */
public interface BulletList extends ListBlock {
	/**
	 * Returns the value of the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Marker</em>' attribute.
	 * @see #setOpeningMarker(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getBulletList_OpeningMarker()
	 * @model unique="false"
	 * @generated
	 */
	String getOpeningMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.BulletList#getOpeningMarker <em>Opening Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Marker</em>' attribute.
	 * @see #getOpeningMarker()
	 * @generated
	 */
	void setOpeningMarker(String value);

} // BulletList
