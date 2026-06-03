/**
 */
package org.nasdanika.models.markdown.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.markdown.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.markdown.MarkdownPackage
 * @generated
 */
public class MarkdownSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarkdownPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownSwitch() {
		if (modelPackage == null) {
			modelPackage = MarkdownPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MarkdownPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.CONTENT_NODE: {
				ContentNode contentNode = (ContentNode)theEObject;
				T result = caseContentNode(contentNode);
				if (result == null) result = caseNode(contentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.ATTRIBUTABLE: {
				Attributable attributable = (Attributable)theEObject;
				T result = caseAttributable(attributable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseContentNode(block);
				if (result == null) result = caseAttributable(block);
				if (result == null) result = caseNode(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseBlock(heading);
				if (result == null) result = caseContentNode(heading);
				if (result == null) result = caseAttributable(heading);
				if (result == null) result = caseNode(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseBlock(paragraph);
				if (result == null) result = caseContentNode(paragraph);
				if (result == null) result = caseAttributable(paragraph);
				if (result == null) result = caseNode(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.FENCED_CODE_BLOCK: {
				FencedCodeBlock fencedCodeBlock = (FencedCodeBlock)theEObject;
				T result = caseFencedCodeBlock(fencedCodeBlock);
				if (result == null) result = caseBlock(fencedCodeBlock);
				if (result == null) result = caseContentNode(fencedCodeBlock);
				if (result == null) result = caseAttributable(fencedCodeBlock);
				if (result == null) result = caseNode(fencedCodeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LIST_BLOCK: {
				ListBlock listBlock = (ListBlock)theEObject;
				T result = caseListBlock(listBlock);
				if (result == null) result = caseBlock(listBlock);
				if (result == null) result = caseContentNode(listBlock);
				if (result == null) result = caseAttributable(listBlock);
				if (result == null) result = caseNode(listBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.ORDERED_LIST: {
				OrderedList orderedList = (OrderedList)theEObject;
				T result = caseOrderedList(orderedList);
				if (result == null) result = caseListBlock(orderedList);
				if (result == null) result = caseBlock(orderedList);
				if (result == null) result = caseContentNode(orderedList);
				if (result == null) result = caseAttributable(orderedList);
				if (result == null) result = caseNode(orderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.BULLET_LIST: {
				BulletList bulletList = (BulletList)theEObject;
				T result = caseBulletList(bulletList);
				if (result == null) result = caseListBlock(bulletList);
				if (result == null) result = caseBlock(bulletList);
				if (result == null) result = caseContentNode(bulletList);
				if (result == null) result = caseAttributable(bulletList);
				if (result == null) result = caseNode(bulletList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DEFINITION_LIST: {
				DefinitionList definitionList = (DefinitionList)theEObject;
				T result = caseDefinitionList(definitionList);
				if (result == null) result = caseListBlock(definitionList);
				if (result == null) result = caseBlock(definitionList);
				if (result == null) result = caseContentNode(definitionList);
				if (result == null) result = caseAttributable(definitionList);
				if (result == null) result = caseNode(definitionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseBlock(listItem);
				if (result == null) result = caseContentNode(listItem);
				if (result == null) result = caseAttributable(listItem);
				if (result == null) result = caseNode(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.BULLET_LIST_ITEM: {
				BulletListItem bulletListItem = (BulletListItem)theEObject;
				T result = caseBulletListItem(bulletListItem);
				if (result == null) result = caseListItem(bulletListItem);
				if (result == null) result = caseBlock(bulletListItem);
				if (result == null) result = caseContentNode(bulletListItem);
				if (result == null) result = caseAttributable(bulletListItem);
				if (result == null) result = caseNode(bulletListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DEFINITION_ITEM: {
				DefinitionItem definitionItem = (DefinitionItem)theEObject;
				T result = caseDefinitionItem(definitionItem);
				if (result == null) result = caseListItem(definitionItem);
				if (result == null) result = caseBlock(definitionItem);
				if (result == null) result = caseContentNode(definitionItem);
				if (result == null) result = caseAttributable(definitionItem);
				if (result == null) result = caseNode(definitionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DEFINITION_TERM: {
				DefinitionTerm definitionTerm = (DefinitionTerm)theEObject;
				T result = caseDefinitionTerm(definitionTerm);
				if (result == null) result = caseListItem(definitionTerm);
				if (result == null) result = caseBlock(definitionTerm);
				if (result == null) result = caseContentNode(definitionTerm);
				if (result == null) result = caseAttributable(definitionTerm);
				if (result == null) result = caseNode(definitionTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.ORDERED_LIST_ITEM: {
				OrderedListItem orderedListItem = (OrderedListItem)theEObject;
				T result = caseOrderedListItem(orderedListItem);
				if (result == null) result = caseListItem(orderedListItem);
				if (result == null) result = caseBlock(orderedListItem);
				if (result == null) result = caseContentNode(orderedListItem);
				if (result == null) result = caseAttributable(orderedListItem);
				if (result == null) result = caseNode(orderedListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TASK_LIST_ITEM: {
				TaskListItem taskListItem = (TaskListItem)theEObject;
				T result = caseTaskListItem(taskListItem);
				if (result == null) result = caseListItem(taskListItem);
				if (result == null) result = caseBlock(taskListItem);
				if (result == null) result = caseContentNode(taskListItem);
				if (result == null) result = caseAttributable(taskListItem);
				if (result == null) result = caseNode(taskListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LINK_NODE_BASE: {
				LinkNodeBase linkNodeBase = (LinkNodeBase)theEObject;
				T result = caseLinkNodeBase(linkNodeBase);
				if (result == null) result = caseNode(linkNodeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LINK_NODE: {
				LinkNode linkNode = (LinkNode)theEObject;
				T result = caseLinkNode(linkNode);
				if (result == null) result = caseLinkNodeBase(linkNode);
				if (result == null) result = caseNode(linkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.INLINE_LINK_NODE: {
				InlineLinkNode inlineLinkNode = (InlineLinkNode)theEObject;
				T result = caseInlineLinkNode(inlineLinkNode);
				if (result == null) result = caseLinkNode(inlineLinkNode);
				if (result == null) result = caseLinkNodeBase(inlineLinkNode);
				if (result == null) result = caseNode(inlineLinkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseInlineLinkNode(link);
				if (result == null) result = caseLinkNode(link);
				if (result == null) result = caseLinkNodeBase(link);
				if (result == null) result = caseNode(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_BLOCK: {
				TableBlock tableBlock = (TableBlock)theEObject;
				T result = caseTableBlock(tableBlock);
				if (result == null) result = caseBlock(tableBlock);
				if (result == null) result = caseContentNode(tableBlock);
				if (result == null) result = caseAttributable(tableBlock);
				if (result == null) result = caseNode(tableBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_BODY: {
				TableBody tableBody = (TableBody)theEObject;
				T result = caseTableBody(tableBody);
				if (result == null) result = caseNode(tableBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_CAPTION: {
				TableCaption tableCaption = (TableCaption)theEObject;
				T result = caseTableCaption(tableCaption);
				if (result == null) result = caseNode(tableCaption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_CELL: {
				TableCell tableCell = (TableCell)theEObject;
				T result = caseTableCell(tableCell);
				if (result == null) result = caseNode(tableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_HEAD: {
				TableHead tableHead = (TableHead)theEObject;
				T result = caseTableHead(tableHead);
				if (result == null) result = caseNode(tableHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = caseNode(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_SEPARATOR: {
				TableSeparator tableSeparator = (TableSeparator)theEObject;
				T result = caseTableSeparator(tableSeparator);
				if (result == null) result = caseNode(tableSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseBlock(document);
				if (result == null) result = caseContentNode(document);
				if (result == null) result = caseAttributable(document);
				if (result == null) result = caseNode(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentNode(ContentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributable(Attributable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeading(Heading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fenced Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fenced Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFencedCodeBlock(FencedCodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListBlock(ListBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedList(OrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bullet List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bullet List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBulletList(BulletList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionList(DefinitionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bullet List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bullet List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBulletListItem(BulletListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionItem(DefinitionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionTerm(DefinitionTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedListItem(OrderedListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskListItem(TaskListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Node Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Node Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkNodeBase(LinkNodeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkNode(LinkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Link Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Link Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineLinkNode(InlineLinkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBlock(TableBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBody(TableBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCaption(TableCaption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCell(TableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHead(TableHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSeparator(TableSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MarkdownSwitch
