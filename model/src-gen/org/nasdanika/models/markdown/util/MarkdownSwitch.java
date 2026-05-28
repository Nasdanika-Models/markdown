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
			case MarkdownPackage.INLINE: {
				Inline inline = (Inline)theEObject;
				T result = caseInline(inline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseInline(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.EMPHASIS: {
				Emphasis emphasis = (Emphasis)theEObject;
				T result = caseEmphasis(emphasis);
				if (result == null) result = caseInline(emphasis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.INLINE_CODE: {
				InlineCode inlineCode = (InlineCode)theEObject;
				T result = caseInlineCode(inlineCode);
				if (result == null) result = caseInline(inlineCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseInline(link);
				if (result == null) result = caseAttributable(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseInline(image);
				if (result == null) result = caseAttributable(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.HARD_BREAK: {
				HardBreak hardBreak = (HardBreak)theEObject;
				T result = caseHardBreak(hardBreak);
				if (result == null) result = caseInline(hardBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.RAW_INLINE: {
				RawInline rawInline = (RawInline)theEObject;
				T result = caseRawInline(rawInline);
				if (result == null) result = caseInline(rawInline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseNode(block);
				if (result == null) result = caseAttributable(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseBlock(heading);
				if (result == null) result = caseNode(heading);
				if (result == null) result = caseAttributable(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseBlock(paragraph);
				if (result == null) result = caseNode(paragraph);
				if (result == null) result = caseAttributable(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.THEMATIC_BREAK: {
				ThematicBreak thematicBreak = (ThematicBreak)theEObject;
				T result = caseThematicBreak(thematicBreak);
				if (result == null) result = caseBlock(thematicBreak);
				if (result == null) result = caseNode(thematicBreak);
				if (result == null) result = caseAttributable(thematicBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.CODE_BLOCK: {
				CodeBlock codeBlock = (CodeBlock)theEObject;
				T result = caseCodeBlock(codeBlock);
				if (result == null) result = caseBlock(codeBlock);
				if (result == null) result = caseNode(codeBlock);
				if (result == null) result = caseAttributable(codeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.HTML_BLOCK: {
				HtmlBlock htmlBlock = (HtmlBlock)theEObject;
				T result = caseHtmlBlock(htmlBlock);
				if (result == null) result = caseBlock(htmlBlock);
				if (result == null) result = caseNode(htmlBlock);
				if (result == null) result = caseAttributable(htmlBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.BLOCK_QUOTE: {
				BlockQuote blockQuote = (BlockQuote)theEObject;
				T result = caseBlockQuote(blockQuote);
				if (result == null) result = caseBlock(blockQuote);
				if (result == null) result = caseNode(blockQuote);
				if (result == null) result = caseAttributable(blockQuote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseBlock(listItem);
				if (result == null) result = caseNode(listItem);
				if (result == null) result = caseAttributable(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseBlock(list);
				if (result == null) result = caseNode(list);
				if (result == null) result = caseAttributable(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseBlock(table);
				if (result == null) result = caseNode(table);
				if (result == null) result = caseAttributable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = caseAttributable(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.TABLE_CELL: {
				TableCell tableCell = (TableCell)theEObject;
				T result = caseTableCell(tableCell);
				if (result == null) result = caseAttributable(tableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DEFINITION_TERM: {
				DefinitionTerm definitionTerm = (DefinitionTerm)theEObject;
				T result = caseDefinitionTerm(definitionTerm);
				if (result == null) result = caseBlock(definitionTerm);
				if (result == null) result = caseNode(definitionTerm);
				if (result == null) result = caseAttributable(definitionTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DEFINITION_ITEM: {
				DefinitionItem definitionItem = (DefinitionItem)theEObject;
				T result = caseDefinitionItem(definitionItem);
				if (result == null) result = caseBlock(definitionItem);
				if (result == null) result = caseNode(definitionItem);
				if (result == null) result = caseAttributable(definitionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkdownPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseBlock(document);
				if (result == null) result = caseNode(document);
				if (result == null) result = caseAttributable(document);
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
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasis(Emphasis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineCode(InlineCode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardBreak(HardBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawInline(RawInline object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Thematic Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thematic Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThematicBreak(ThematicBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlBlock(HtmlBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockQuote(BlockQuote object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
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
