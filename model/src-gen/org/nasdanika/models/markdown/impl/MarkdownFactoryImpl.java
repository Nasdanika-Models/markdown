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
			case MarkdownPackage.CONTENT_NODE: return createContentNode();
			case MarkdownPackage.ATTRIBUTE: return createAttribute();
			case MarkdownPackage.HEADING: return createHeading();
			case MarkdownPackage.PARAGRAPH: return createParagraph();
			case MarkdownPackage.FENCED_CODE_BLOCK: return createFencedCodeBlock();
			case MarkdownPackage.ORDERED_LIST: return createOrderedList();
			case MarkdownPackage.BULLET_LIST: return createBulletList();
			case MarkdownPackage.DEFINITION_LIST: return createDefinitionList();
			case MarkdownPackage.BULLET_LIST_ITEM: return createBulletListItem();
			case MarkdownPackage.DEFINITION_ITEM: return createDefinitionItem();
			case MarkdownPackage.DEFINITION_TERM: return createDefinitionTerm();
			case MarkdownPackage.ORDERED_LIST_ITEM: return createOrderedListItem();
			case MarkdownPackage.TASK_LIST_ITEM: return createTaskListItem();
			case MarkdownPackage.LINK: return createLink();
			case MarkdownPackage.TABLE_BLOCK: return createTableBlock();
			case MarkdownPackage.TABLE_BODY: return createTableBody();
			case MarkdownPackage.TABLE_CAPTION: return createTableCaption();
			case MarkdownPackage.TABLE_CELL: return createTableCell();
			case MarkdownPackage.TABLE_HEAD: return createTableHead();
			case MarkdownPackage.TABLE_ROW: return createTableRow();
			case MarkdownPackage.TABLE_SEPARATOR: return createTableSeparator();
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
			case MarkdownPackage.TABLE_CELL_ALIGNMENT:
				return createTableCellAlignmentFromString(eDataType, initialValue);
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
			case MarkdownPackage.TABLE_CELL_ALIGNMENT:
				return convertTableCellAlignmentToString(eDataType, instanceValue);
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
	public ContentNode createContentNode() {
		ContentNodeImpl contentNode = new ContentNodeImpl();
		return contentNode;
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
	public FencedCodeBlock createFencedCodeBlock() {
		FencedCodeBlockImpl fencedCodeBlock = new FencedCodeBlockImpl();
		return fencedCodeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedList createOrderedList() {
		OrderedListImpl orderedList = new OrderedListImpl();
		return orderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletList createBulletList() {
		BulletListImpl bulletList = new BulletListImpl();
		return bulletList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionList createDefinitionList() {
		DefinitionListImpl definitionList = new DefinitionListImpl();
		return definitionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletListItem createBulletListItem() {
		BulletListItemImpl bulletListItem = new BulletListItemImpl();
		return bulletListItem;
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
	public OrderedListItem createOrderedListItem() {
		OrderedListItemImpl orderedListItem = new OrderedListItemImpl();
		return orderedListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskListItem createTaskListItem() {
		TaskListItemImpl taskListItem = new TaskListItemImpl();
		return taskListItem;
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
	public TableBlock createTableBlock() {
		TableBlockImpl tableBlock = new TableBlockImpl();
		return tableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody createTableBody() {
		TableBodyImpl tableBody = new TableBodyImpl();
		return tableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCaption createTableCaption() {
		TableCaptionImpl tableCaption = new TableCaptionImpl();
		return tableCaption;
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
	public TableHead createTableHead() {
		TableHeadImpl tableHead = new TableHeadImpl();
		return tableHead;
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
	public TableSeparator createTableSeparator() {
		TableSeparatorImpl tableSeparator = new TableSeparatorImpl();
		return tableSeparator;
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
	public TableCellAlignment createTableCellAlignmentFromString(EDataType eDataType, String initialValue) {
		TableCellAlignment result = TableCellAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableCellAlignmentToString(EDataType eDataType, Object instanceValue) {
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
