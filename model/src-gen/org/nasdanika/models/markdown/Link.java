/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A hyperlink  [label](href "title").
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.markdown.Link#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Link#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.markdown.Link#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.markdown.MarkdownPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Inline, Attributable {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLink_Href()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLink_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.markdown.Link#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.markdown.Inline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.nasdanika.models.markdown.MarkdownPackage#getLink_Label()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inline> getLabel();

} // Link
