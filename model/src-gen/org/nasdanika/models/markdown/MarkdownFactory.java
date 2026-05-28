/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.markdown.MarkdownPackage
 * @generated
 */
public interface MarkdownFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkdownFactory eINSTANCE = org.nasdanika.models.markdown.impl.MarkdownFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emphasis</em>'.
	 * @generated
	 */
	Emphasis createEmphasis();

	/**
	 * Returns a new object of class '<em>Inline Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Code</em>'.
	 * @generated
	 */
	InlineCode createInlineCode();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Hard Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hard Break</em>'.
	 * @generated
	 */
	HardBreak createHardBreak();

	/**
	 * Returns a new object of class '<em>Raw Inline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Inline</em>'.
	 * @generated
	 */
	RawInline createRawInline();

	/**
	 * Returns a new object of class '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading</em>'.
	 * @generated
	 */
	Heading createHeading();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Thematic Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thematic Break</em>'.
	 * @generated
	 */
	ThematicBreak createThematicBreak();

	/**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
	CodeBlock createCodeBlock();

	/**
	 * Returns a new object of class '<em>Html Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html Block</em>'.
	 * @generated
	 */
	HtmlBlock createHtmlBlock();

	/**
	 * Returns a new object of class '<em>Block Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Quote</em>'.
	 * @generated
	 */
	BlockQuote createBlockQuote();

	/**
	 * Returns a new object of class '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item</em>'.
	 * @generated
	 */
	ListItem createListItem();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns a new object of class '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Cell</em>'.
	 * @generated
	 */
	TableCell createTableCell();

	/**
	 * Returns a new object of class '<em>Definition Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Term</em>'.
	 * @generated
	 */
	DefinitionTerm createDefinitionTerm();

	/**
	 * Returns a new object of class '<em>Definition Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Item</em>'.
	 * @generated
	 */
	DefinitionItem createDefinitionItem();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkdownPackage getMarkdownPackage();

} //MarkdownFactory
