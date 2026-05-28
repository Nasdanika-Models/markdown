/**
 */
package org.nasdanika.models.markdown.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.markdown.Attributable;
import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Block;
import org.nasdanika.models.markdown.BlockQuote;
import org.nasdanika.models.markdown.CodeBlock;
import org.nasdanika.models.markdown.DefinitionItem;
import org.nasdanika.models.markdown.DefinitionTerm;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.Emphasis;
import org.nasdanika.models.markdown.EmphasisKind;
import org.nasdanika.models.markdown.HardBreak;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;
import org.nasdanika.models.markdown.HtmlBlock;
import org.nasdanika.models.markdown.Image;
import org.nasdanika.models.markdown.Inline;
import org.nasdanika.models.markdown.InlineCode;
import org.nasdanika.models.markdown.Link;
import org.nasdanika.models.markdown.List;
import org.nasdanika.models.markdown.ListItem;
import org.nasdanika.models.markdown.ListType;
import org.nasdanika.models.markdown.MarkdownFactory;
import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.Node;
import org.nasdanika.models.markdown.Paragraph;
import org.nasdanika.models.markdown.RawInline;
import org.nasdanika.models.markdown.Table;
import org.nasdanika.models.markdown.TableCell;
import org.nasdanika.models.markdown.TableRow;
import org.nasdanika.models.markdown.Text;
import org.nasdanika.models.markdown.ThematicBreak;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownPackageImpl extends EPackageImpl implements MarkdownPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawInlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thematicBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockQuoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum headingLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emphasisKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.markdown.MarkdownPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkdownPackageImpl() {
		super(eNS_URI, MarkdownFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MarkdownPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkdownPackage init() {
		if (isInited) return (MarkdownPackage)EPackage.Registry.INSTANCE.getEPackage(MarkdownPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMarkdownPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MarkdownPackageImpl theMarkdownPackage = registeredMarkdownPackage instanceof MarkdownPackageImpl ? (MarkdownPackageImpl)registeredMarkdownPackage : new MarkdownPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMarkdownPackage.createPackageContents();

		// Initialize created meta-data
		theMarkdownPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkdownPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkdownPackage.eNS_URI, theMarkdownPackage);
		return theMarkdownPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_StartOffset() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_StartLineNumber() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_EndOffset() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_EndLineNumber() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Key() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributable() {
		return attributableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributable_Attributes() {
		return (EReference)attributableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInline() {
		return inlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmphasis() {
		return emphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmphasis_Kind() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmphasis_Children() {
		return (EReference)emphasisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInlineCode() {
		return inlineCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInlineCode_Value() {
		return (EAttribute)inlineCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Title() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Label() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Src() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Alt() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Title() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHardBreak() {
		return hardBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRawInline() {
		return rawInlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRawInline_Html() {
		return (EAttribute)rawInlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Text() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeading() {
		return headingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeading_Level() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeading_Inlines() {
		return (EReference)headingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParagraph_Inlines() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThematicBreak() {
		return thematicBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeBlock() {
		return codeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeBlock_Language() {
		return (EAttribute)codeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeBlock_Content() {
		return (EAttribute)codeBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHtmlBlock() {
		return htmlBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHtmlBlock_Html() {
		return (EAttribute)htmlBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockQuote() {
		return blockQuoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockQuote_Children() {
		return (EReference)blockQuoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItem_Checked() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListItem_Children() {
		return (EReference)listItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_ListType() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_StartNumber() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_Loose() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getList_Items() {
		return (EReference)listEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Header() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Body() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Cells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Alignment() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_IsHeader() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableCell_Inlines() {
		return (EReference)tableCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionTerm() {
		return definitionTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionTerm_Inlines() {
		return (EReference)definitionTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionItem() {
		return definitionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionItem_Children() {
		return (EReference)definitionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_Blocks() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_SourceUri() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHeadingLevel() {
		return headingLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getListType() {
		return listTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEmphasisKind() {
		return emphasisKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkdownFactory getMarkdownFactory() {
		return (MarkdownFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__START_OFFSET);
		createEAttribute(nodeEClass, NODE__START_LINE_NUMBER);
		createEAttribute(nodeEClass, NODE__END_OFFSET);
		createEAttribute(nodeEClass, NODE__END_LINE_NUMBER);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		attributableEClass = createEClass(ATTRIBUTABLE);
		createEReference(attributableEClass, ATTRIBUTABLE__ATTRIBUTES);

		inlineEClass = createEClass(INLINE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		emphasisEClass = createEClass(EMPHASIS);
		createEAttribute(emphasisEClass, EMPHASIS__KIND);
		createEReference(emphasisEClass, EMPHASIS__CHILDREN);

		inlineCodeEClass = createEClass(INLINE_CODE);
		createEAttribute(inlineCodeEClass, INLINE_CODE__VALUE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__TITLE);
		createEReference(linkEClass, LINK__LABEL);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SRC);
		createEAttribute(imageEClass, IMAGE__ALT);
		createEAttribute(imageEClass, IMAGE__TITLE);

		hardBreakEClass = createEClass(HARD_BREAK);

		rawInlineEClass = createEClass(RAW_INLINE);
		createEAttribute(rawInlineEClass, RAW_INLINE__HTML);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__TEXT);

		headingEClass = createEClass(HEADING);
		createEAttribute(headingEClass, HEADING__LEVEL);
		createEReference(headingEClass, HEADING__INLINES);

		paragraphEClass = createEClass(PARAGRAPH);
		createEReference(paragraphEClass, PARAGRAPH__INLINES);

		thematicBreakEClass = createEClass(THEMATIC_BREAK);

		codeBlockEClass = createEClass(CODE_BLOCK);
		createEAttribute(codeBlockEClass, CODE_BLOCK__LANGUAGE);
		createEAttribute(codeBlockEClass, CODE_BLOCK__CONTENT);

		htmlBlockEClass = createEClass(HTML_BLOCK);
		createEAttribute(htmlBlockEClass, HTML_BLOCK__HTML);

		blockQuoteEClass = createEClass(BLOCK_QUOTE);
		createEReference(blockQuoteEClass, BLOCK_QUOTE__CHILDREN);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__CHECKED);
		createEReference(listItemEClass, LIST_ITEM__CHILDREN);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__LIST_TYPE);
		createEAttribute(listEClass, LIST__START_NUMBER);
		createEAttribute(listEClass, LIST__LOOSE);
		createEReference(listEClass, LIST__ITEMS);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__HEADER);
		createEReference(tableEClass, TABLE__BODY);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__ALIGNMENT);
		createEAttribute(tableCellEClass, TABLE_CELL__IS_HEADER);
		createEReference(tableCellEClass, TABLE_CELL__INLINES);

		definitionTermEClass = createEClass(DEFINITION_TERM);
		createEReference(definitionTermEClass, DEFINITION_TERM__INLINES);

		definitionItemEClass = createEClass(DEFINITION_ITEM);
		createEReference(definitionItemEClass, DEFINITION_ITEM__CHILDREN);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__BLOCKS);
		createEAttribute(documentEClass, DOCUMENT__SOURCE_URI);

		// Create enums
		headingLevelEEnum = createEEnum(HEADING_LEVEL);
		listTypeEEnum = createEEnum(LIST_TYPE);
		emphasisKindEEnum = createEEnum(EMPHASIS_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textEClass.getESuperTypes().add(this.getInline());
		emphasisEClass.getESuperTypes().add(this.getInline());
		inlineCodeEClass.getESuperTypes().add(this.getInline());
		linkEClass.getESuperTypes().add(this.getInline());
		linkEClass.getESuperTypes().add(this.getAttributable());
		imageEClass.getESuperTypes().add(this.getInline());
		imageEClass.getESuperTypes().add(this.getAttributable());
		hardBreakEClass.getESuperTypes().add(this.getInline());
		rawInlineEClass.getESuperTypes().add(this.getInline());
		blockEClass.getESuperTypes().add(this.getNode());
		blockEClass.getESuperTypes().add(this.getAttributable());
		headingEClass.getESuperTypes().add(this.getBlock());
		paragraphEClass.getESuperTypes().add(this.getBlock());
		thematicBreakEClass.getESuperTypes().add(this.getBlock());
		codeBlockEClass.getESuperTypes().add(this.getBlock());
		htmlBlockEClass.getESuperTypes().add(this.getBlock());
		blockQuoteEClass.getESuperTypes().add(this.getBlock());
		listItemEClass.getESuperTypes().add(this.getBlock());
		listEClass.getESuperTypes().add(this.getBlock());
		tableEClass.getESuperTypes().add(this.getBlock());
		tableRowEClass.getESuperTypes().add(this.getAttributable());
		tableCellEClass.getESuperTypes().add(this.getAttributable());
		definitionTermEClass.getESuperTypes().add(this.getBlock());
		definitionItemEClass.getESuperTypes().add(this.getBlock());
		documentEClass.getESuperTypes().add(this.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_StartOffset(), theEcorePackage.getEInt(), "startOffset", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_StartLineNumber(), theEcorePackage.getEInt(), "startLineNumber", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_EndOffset(), theEcorePackage.getEInt(), "endOffset", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_EndLineNumber(), theEcorePackage.getEInt(), "endLineNumber", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributableEClass, Attributable.class, "Attributable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributable_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Attributable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineEClass, Inline.class, "Inline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), theEcorePackage.getEString(), "value", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emphasisEClass, Emphasis.class, "Emphasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmphasis_Kind(), this.getEmphasisKind(), "kind", "ITALIC", 1, 1, Emphasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmphasis_Children(), this.getInline(), null, "children", null, 0, -1, Emphasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineCodeEClass, InlineCode.class, "InlineCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInlineCode_Value(), theEcorePackage.getEString(), "value", null, 1, 1, InlineCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Href(), theEcorePackage.getEString(), "href", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Label(), this.getInline(), null, "label", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Src(), theEcorePackage.getEString(), "src", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Alt(), theEcorePackage.getEString(), "alt", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardBreakEClass, HardBreak.class, "HardBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rawInlineEClass, RawInline.class, "RawInline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawInline_Html(), theEcorePackage.getEString(), "html", null, 1, 1, RawInline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headingEClass, Heading.class, "Heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeading_Level(), this.getHeadingLevel(), "level", "H1", 1, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeading_Inlines(), this.getInline(), null, "inlines", null, 0, -1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParagraph_Inlines(), this.getInline(), null, "inlines", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thematicBreakEClass, ThematicBreak.class, "ThematicBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeBlockEClass, CodeBlock.class, "CodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeBlock_Language(), theEcorePackage.getEString(), "language", null, 0, 1, CodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeBlock_Content(), theEcorePackage.getEString(), "content", null, 1, 1, CodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlBlockEClass, HtmlBlock.class, "HtmlBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlBlock_Html(), theEcorePackage.getEString(), "html", null, 1, 1, HtmlBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockQuoteEClass, BlockQuote.class, "BlockQuote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockQuote_Children(), this.getBlock(), null, "children", null, 0, -1, BlockQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Checked(), theEcorePackage.getEBooleanObject(), "checked", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListItem_Children(), this.getBlock(), null, "children", null, 0, -1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_ListType(), this.getListType(), "listType", "BULLET", 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_StartNumber(), theEcorePackage.getEInt(), "startNumber", "1", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_Loose(), theEcorePackage.getEBoolean(), "loose", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_Items(), this.getListItem(), null, "items", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Header(), this.getTableRow(), null, "header", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Body(), this.getTableRow(), null, "body", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Cells(), this.getTableCell(), null, "cells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Alignment(), theEcorePackage.getEString(), "alignment", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_IsHeader(), theEcorePackage.getEBoolean(), "isHeader", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCell_Inlines(), this.getInline(), null, "inlines", null, 0, -1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionTermEClass, DefinitionTerm.class, "DefinitionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionTerm_Inlines(), this.getInline(), null, "inlines", null, 0, -1, DefinitionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionItemEClass, DefinitionItem.class, "DefinitionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionItem_Children(), this.getBlock(), null, "children", null, 0, -1, DefinitionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Blocks(), this.getBlock(), null, "blocks", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_SourceUri(), theEcorePackage.getEString(), "sourceUri", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(headingLevelEEnum, HeadingLevel.class, "HeadingLevel");
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H1);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H2);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H3);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H4);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H5);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H6);

		initEEnum(listTypeEEnum, ListType.class, "ListType");
		addEEnumLiteral(listTypeEEnum, ListType.BULLET);
		addEEnumLiteral(listTypeEEnum, ListType.ORDERED);

		initEEnum(emphasisKindEEnum, EmphasisKind.class, "EmphasisKind");
		addEEnumLiteral(emphasisKindEEnum, EmphasisKind.ITALIC);
		addEEnumLiteral(emphasisKindEEnum, EmphasisKind.BOLD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (headingLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nHeading levels 1\u20136, matching ATX / Setext heading syntax."
		   });
		addAnnotation
		  (listTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nThe delimiter used for a list \u2014 bullet (unordered) or ordered."
		   });
		addAnnotation
		  (emphasisKindEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nEmphasis weight for inline spans."
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA single key/value pair produced by { attr=\"value\" }, { #id }, { .class }.\nInstances are owned by any MAttributable node."
		   });
		addAnnotation
		  (getAttribute_Key(),
		   source,
		   new String[] {
			   "documentation", "*\nAttribute name as written \u2014 e.g. \"id\", \"class\", \"lang\", \"data-foo\"."
		   });
		addAnnotation
		  (getAttribute_Value(),
		   source,
		   new String[] {
			   "documentation", "*\nRaw attribute value string (may be empty for bare class/id short-hands)."
		   });
		addAnnotation
		  (attributableEClass,
		   source,
		   new String[] {
			   "documentation", "*\nMixin interface \u2014 any node that can carry Flexmark attribute blocks."
		   });
		addAnnotation
		  (getAttributable_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nAll attributes parsed from the { ... } block that follows this node."
		   });
		addAnnotation
		  (inlineEClass,
		   source,
		   new String[] {
			   "documentation", "*\nBase class for all inline-level content (runs of text, spans, links, \u2026)."
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA run of plain, unformatted text."
		   });
		addAnnotation
		  (emphasisEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn emphasis span (* / ** / _ / __)."
		   });
		addAnnotation
		  (inlineCodeEClass,
		   source,
		   new String[] {
			   "documentation", "*\nInline code  (`code`)."
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA hyperlink  [label](href \"title\")."
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn image  ![alt](src \"title\")."
		   });
		addAnnotation
		  (hardBreakEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA hard line-break (two trailing spaces or backslash before newline)."
		   });
		addAnnotation
		  (rawInlineEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRaw HTML inline fragment."
		   });
		addAnnotation
		  (blockEClass,
		   source,
		   new String[] {
			   "documentation", "*\nBase class for all block-level elements.\nEvery block may carry Flexmark attributes."
		   });
		addAnnotation
		  (headingEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA heading (# \u2026 ######)."
		   });
		addAnnotation
		  (getHeading_Inlines(),
		   source,
		   new String[] {
			   "documentation", "*\nInline content of the heading (may contain emphasis, links, \u2026)."
		   });
		addAnnotation
		  (paragraphEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA paragraph \u2014 one or more lines of inline content."
		   });
		addAnnotation
		  (thematicBreakEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA thematic break (---, ***, ___)."
		   });
		addAnnotation
		  (codeBlockEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA fenced or indented code block."
		   });
		addAnnotation
		  (getCodeBlock_Language(),
		   source,
		   new String[] {
			   "documentation", "*\nInfo string after the opening fence \u2014 typically a language identifier.\nEmpty for indented code blocks."
		   });
		addAnnotation
		  (getCodeBlock_Content(),
		   source,
		   new String[] {
			   "documentation", "*\nRaw source text of the code, preserving newlines."
		   });
		addAnnotation
		  (htmlBlockEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA block-level raw HTML section."
		   });
		addAnnotation
		  (blockQuoteEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA block quote  (> \u2026)."
		   });
		addAnnotation
		  (listItemEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA single item inside a list (bullet or ordered).\nItems may themselves contain block-level children (nested lists, paragraphs)."
		   });
		addAnnotation
		  (getListItem_Checked(),
		   source,
		   new String[] {
			   "documentation", "*\nChecked state for task-list items; null means not a task-list item."
		   });
		addAnnotation
		  (listEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA bullet (unordered) or ordered list."
		   });
		addAnnotation
		  (getList_StartNumber(),
		   source,
		   new String[] {
			   "documentation", "*\nStarting number for ordered lists (ignored for bullet lists)."
		   });
		addAnnotation
		  (getList_Loose(),
		   source,
		   new String[] {
			   "documentation", "*\nWhether list items are separated by blank lines (loose) or not (tight)."
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA GFM-style table."
		   });
		addAnnotation
		  (getTableCell_Alignment(),
		   source,
		   new String[] {
			   "documentation", "*\nAlignment hint from the separator row (null = unspecified)."
		   });
		addAnnotation
		  (definitionTermEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA definition-list term (used with some extensions)."
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRoot of the Markdown AST.  Corresponds to a single parsed file or string."
		   });
		addAnnotation
		  (getDocument_Blocks(),
		   source,
		   new String[] {
			   "documentation", "*\nTop-level block children, in document order."
		   });
		addAnnotation
		  (getDocument_SourceUri(),
		   source,
		   new String[] {
			   "documentation", "*\nOptional: source file path stored for traceability."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //MarkdownPackageImpl
