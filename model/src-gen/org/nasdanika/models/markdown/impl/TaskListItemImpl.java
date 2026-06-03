/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.TaskListItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskListItemImpl extends ListItemImpl implements TaskListItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TASK_LIST_ITEM;
	}

} //TaskListItemImpl
