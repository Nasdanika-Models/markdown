/**
 */
package org.nasdanika.models.markdown;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An image  ![alt](src "title").
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Image#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Image#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Image#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends Inline, Attributable {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getImage_Src()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Image#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getImage_Alt()
	 * @model unique="false"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Image#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getImage_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Image#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Image
