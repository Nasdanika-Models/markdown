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
import org.nasdanika.models.markdown.ContentNode;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.FencedCodeBlock;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;
import org.nasdanika.models.markdown.MarkdownFactory;
import org.nasdanika.models.markdown.MarkdownPackage;
import org.nasdanika.models.markdown.Node;
import org.nasdanika.models.markdown.Paragraph;

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
	private EClass contentNodeEClass = null;

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
	private EClass fencedCodeBlockEClass = null;

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
	public EAttribute getNode_Chars() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Content() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_ContentEndOffset() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Children() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentNode() {
		return contentNodeEClass;
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
	public EAttribute getAttributable_AttributesStartOffset() {
		return (EAttribute)attributableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributable_AttributesEndOffset() {
		return (EAttribute)attributableEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getHeading_Text() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(1);
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
	public EClass getFencedCodeBlock() {
		return fencedCodeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_Info() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_ClosingFence() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_ClosingMarker() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_FenceIndent() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_FenceLength() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_OpeningFence() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFencedCodeBlock_OpeningMarker() {
		return (EAttribute)fencedCodeBlockEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getDocument_SourceUri() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
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
		createEAttribute(nodeEClass, NODE__CHARS);
		createEAttribute(nodeEClass, NODE__CONTENT);
		createEAttribute(nodeEClass, NODE__CONTENT_END_OFFSET);
		createEReference(nodeEClass, NODE__CHILDREN);

		contentNodeEClass = createEClass(CONTENT_NODE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		attributableEClass = createEClass(ATTRIBUTABLE);
		createEReference(attributableEClass, ATTRIBUTABLE__ATTRIBUTES);
		createEAttribute(attributableEClass, ATTRIBUTABLE__ATTRIBUTES_START_OFFSET);
		createEAttribute(attributableEClass, ATTRIBUTABLE__ATTRIBUTES_END_OFFSET);

		blockEClass = createEClass(BLOCK);

		headingEClass = createEClass(HEADING);
		createEAttribute(headingEClass, HEADING__LEVEL);
		createEAttribute(headingEClass, HEADING__TEXT);

		paragraphEClass = createEClass(PARAGRAPH);

		fencedCodeBlockEClass = createEClass(FENCED_CODE_BLOCK);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__INFO);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__CLOSING_FENCE);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__CLOSING_MARKER);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__FENCE_INDENT);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__FENCE_LENGTH);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__OPENING_FENCE);
		createEAttribute(fencedCodeBlockEClass, FENCED_CODE_BLOCK__OPENING_MARKER);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__SOURCE_URI);

		// Create enums
		headingLevelEEnum = createEEnum(HEADING_LEVEL);
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
		contentNodeEClass.getESuperTypes().add(this.getNode());
		blockEClass.getESuperTypes().add(this.getContentNode());
		blockEClass.getESuperTypes().add(this.getAttributable());
		headingEClass.getESuperTypes().add(this.getBlock());
		paragraphEClass.getESuperTypes().add(this.getBlock());
		fencedCodeBlockEClass.getESuperTypes().add(this.getBlock());
		documentEClass.getESuperTypes().add(this.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_StartOffset(), theEcorePackage.getEInt(), "startOffset", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_StartLineNumber(), theEcorePackage.getEInt(), "startLineNumber", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_EndOffset(), theEcorePackage.getEInt(), "endOffset", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_EndLineNumber(), theEcorePackage.getEInt(), "endLineNumber", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Chars(), theEcorePackage.getEString(), "chars", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ContentEndOffset(), theEcorePackage.getEInt(), "contentEndOffset", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Children(), this.getNode(), null, "children", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentNodeEClass, ContentNode.class, "ContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributableEClass, Attributable.class, "Attributable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributable_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Attributable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributable_AttributesStartOffset(), theEcorePackage.getEInt(), "attributesStartOffset", null, 0, 1, Attributable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributable_AttributesEndOffset(), theEcorePackage.getEInt(), "attributesEndOffset", null, 0, 1, Attributable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headingEClass, Heading.class, "Heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeading_Level(), this.getHeadingLevel(), "level", "H1", 1, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeading_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fencedCodeBlockEClass, FencedCodeBlock.class, "FencedCodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFencedCodeBlock_Info(), theEcorePackage.getEString(), "info", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_ClosingFence(), theEcorePackage.getEString(), "closingFence", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_ClosingMarker(), theEcorePackage.getEString(), "closingMarker", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_FenceIndent(), theEcorePackage.getEInt(), "fenceIndent", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_FenceLength(), theEcorePackage.getEInt(), "fenceLength", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_OpeningFence(), theEcorePackage.getEString(), "openingFence", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFencedCodeBlock_OpeningMarker(), theEcorePackage.getEString(), "openingMarker", null, 0, 1, FencedCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_SourceUri(), theEcorePackage.getEString(), "sourceUri", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(headingLevelEEnum, HeadingLevel.class, "HeadingLevel");
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H1);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H2);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H3);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H4);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H5);
		addEEnumLiteral(headingLevelEEnum, HeadingLevel.H6);

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
		  (getNode_Content(),
		   source,
		   new String[] {
			   "documentation", "*\nComputed as a text between this node start and the next sibling start or parent end."
		   });
		addAnnotation
		  (getNode_ContentEndOffset(),
		   source,
		   new String[] {
			   "documentation", "*\nComputed as the next sibling start offset or parent end offset"
		   });
		addAnnotation
		  (headingLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nHeading levels 1\u20136, matching ATX / Setext heading syntax."
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
		  (paragraphEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA paragraph \u2014 one or more lines of inline content."
		   });
		addAnnotation
		  (fencedCodeBlockEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA fenced or indented code block."
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRoot of the Markdown AST.  Corresponds to a single parsed file or string."
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
