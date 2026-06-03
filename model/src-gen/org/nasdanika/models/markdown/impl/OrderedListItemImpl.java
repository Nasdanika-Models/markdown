/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.OrderedListItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrderedListItemImpl extends ListItemImpl implements OrderedListItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.ORDERED_LIST_ITEM;
	}

} //OrderedListItemImpl
