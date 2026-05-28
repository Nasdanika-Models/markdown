/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.markdown.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownFactoryImpl extends EFactoryImpl implements MarkdownFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarkdownFactory init() {
		try {
			MarkdownFactory theMarkdownFactory = (MarkdownFactory)EPackage.Registry.INSTANCE.getEFactory(MarkdownPackage.eNS_URI);
			if (theMarkdownFactory != null) {
				return theMarkdownFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkdownFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MarkdownPackage.NODE: return createNode();
			case MarkdownPackage.ATTRIBUTE: return createAttribute();
			case MarkdownPackage.TEXT: return createText();
			case MarkdownPackage.EMPHASIS: return createEmphasis();
			case MarkdownPackage.INLINE_CODE: return createInlineCode();
			case MarkdownPackage.LINK: return createLink();
			case MarkdownPackage.IMAGE: return createImage();
			case MarkdownPackage.HARD_BREAK: return createHardBreak();
			case MarkdownPackage.RAW_INLINE: return createRawInline();
			case MarkdownPackage.HEADING: return createHeading();
			case MarkdownPackage.PARAGRAPH: return createParagraph();
			case MarkdownPackage.THEMATIC_BREAK: return createThematicBreak();
			case MarkdownPackage.CODE_BLOCK: return createCodeBlock();
			case MarkdownPackage.HTML_BLOCK: return createHtmlBlock();
			case MarkdownPackage.BLOCK_QUOTE: return createBlockQuote();
			case MarkdownPackage.LIST_ITEM: return createListItem();
			case MarkdownPackage.LIST: return createList();
			case MarkdownPackage.TABLE: return createTable();
			case MarkdownPackage.TABLE_ROW: return createTableRow();
			case MarkdownPackage.TABLE_CELL: return createTableCell();
			case MarkdownPackage.DEFINITION_TERM: return createDefinitionTerm();
			case MarkdownPackage.DEFINITION_ITEM: return createDefinitionItem();
			case MarkdownPackage.DOCUMENT: return createDocument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MarkdownPackage.HEADING_LEVEL:
				return createHeadingLevelFromString(eDataType, initialValue);
			case MarkdownPackage.LIST_TYPE:
				return createListTypeFromString(eDataType, initialValue);
			case MarkdownPackage.EMPHASIS_KIND:
				return createEmphasisKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MarkdownPackage.HEADING_LEVEL:
				return convertHeadingLevelToString(eDataType, instanceValue);
			case MarkdownPackage.LIST_TYPE:
				return convertListTypeToString(eDataType, instanceValue);
			case MarkdownPackage.EMPHASIS_KIND:
				return convertEmphasisKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emphasis createEmphasis() {
		EmphasisImpl emphasis = new EmphasisImpl();
		return emphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineCode createInlineCode() {
		InlineCodeImpl inlineCode = new InlineCodeImpl();
		return inlineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardBreak createHardBreak() {
		HardBreakImpl hardBreak = new HardBreakImpl();
		return hardBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawInline createRawInline() {
		RawInlineImpl rawInline = new RawInlineImpl();
		return rawInline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heading createHeading() {
		HeadingImpl heading = new HeadingImpl();
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThematicBreak createThematicBreak() {
		ThematicBreakImpl thematicBreak = new ThematicBreakImpl();
		return thematicBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtmlBlock createHtmlBlock() {
		HtmlBlockImpl htmlBlock = new HtmlBlockImpl();
		return htmlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockQuote createBlockQuote() {
		BlockQuoteImpl blockQuote = new BlockQuoteImpl();
		return blockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionTerm createDefinitionTerm() {
		DefinitionTermImpl definitionTerm = new DefinitionTermImpl();
		return definitionTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionItem createDefinitionItem() {
		DefinitionItemImpl definitionItem = new DefinitionItemImpl();
		return definitionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadingLevel createHeadingLevelFromString(EDataType eDataType, String initialValue) {
		HeadingLevel result = HeadingLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeadingLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListTypeFromString(EDataType eDataType, String initialValue) {
		ListType result = ListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisKind createEmphasisKindFromString(EDataType eDataType, String initialValue) {
		EmphasisKind result = EmphasisKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmphasisKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkdownPackage getMarkdownPackage() {
		return (MarkdownPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkdownPackage getPackage() {
		return MarkdownPackage.eINSTANCE;
	}

} //MarkdownFactoryImpl
