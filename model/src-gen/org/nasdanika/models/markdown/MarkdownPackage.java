/**
 */
package org.nasdanika.models.markdown;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.markdown.MarkdownFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface MarkdownPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "markdown";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://markdown.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.markdown";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkdownPackage eINSTANCE = org.nasdanika.models.markdown.impl.MarkdownPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.NodeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__START_OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__START_LINE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__END_OFFSET = 2;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__END_LINE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.AttributeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.Attributable <em>Attributable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.Attributable
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getAttributable()
	 * @generated
	 */
	int ATTRIBUTABLE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.InlineImpl <em>Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.InlineImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInline()
	 * @generated
	 */
	int INLINE = 3;

	/**
	 * The number of structural features of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TextImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = INLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = INLINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.EmphasisImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__KIND = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__CHILDREN = INLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.InlineCodeImpl <em>Inline Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.InlineCodeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInlineCode()
	 * @generated
	 */
	int INLINE_CODE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE__VALUE = INLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inline Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.LinkImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ImageImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.HardBreakImpl <em>Hard Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.HardBreakImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHardBreak()
	 * @generated
	 */
	int HARD_BREAK = 9;

	/**
	 * The number of structural features of the '<em>Hard Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_BREAK_FEATURE_COUNT = INLINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hard Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_BREAK_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.RawInlineImpl <em>Raw Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.RawInlineImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getRawInline()
	 * @generated
	 */
	int RAW_INLINE = 10;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_INLINE__HTML = INLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_INLINE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raw Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_INLINE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.BlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TEXT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.HeadingImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 12;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__LEVEL = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__INLINES = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ParagraphImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 13;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Inlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__INLINES = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ThematicBreakImpl <em>Thematic Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ThematicBreakImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getThematicBreak()
	 * @generated
	 */
	int THEMATIC_BREAK = 14;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK__TEXT = BLOCK__TEXT;

	/**
	 * The number of structural features of the '<em>Thematic Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thematic Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMATIC_BREAK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.CodeBlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 15;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__LANGUAGE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CONTENT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.HtmlBlockImpl <em>Html Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.HtmlBlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHtmlBlock()
	 * @generated
	 */
	int HTML_BLOCK = 16;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK__HTML = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Html Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Html Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.BlockQuoteImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 17;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__CHILDREN = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ListItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CHECKED = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CHILDREN = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ListImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getList()
	 * @generated
	 */
	int LIST = 19;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__START_NUMBER = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LOOSE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 20;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODY = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableRowImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ATTRIBUTES = ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = ATTRIBUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableCellImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 22;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ATTRIBUTES = ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNMENT = ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__IS_HEADER = ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__INLINES = ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = ATTRIBUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = ATTRIBUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DefinitionTermImpl <em>Definition Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DefinitionTermImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionTerm()
	 * @generated
	 */
	int DEFINITION_TERM = 23;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Inlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__INLINES = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DefinitionItemImpl <em>Definition Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DefinitionItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionItem()
	 * @generated
	 */
	int DEFINITION_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__CHILDREN = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DocumentImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 25;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEXT = BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BLOCKS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SOURCE_URI = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.HeadingLevel <em>Heading Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.HeadingLevel
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHeadingLevel()
	 * @generated
	 */
	int HEADING_LEVEL = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.ListType <em>List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.ListType
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.EmphasisKind <em>Emphasis Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.EmphasisKind
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getEmphasisKind()
	 * @generated
	 */
	int EMPHASIS_KIND = 28;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.markdown.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getStartOffset <em>Start Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Offset</em>'.
	 * @see org.nasdanika.models.markdown.Node#getStartOffset()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StartOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getStartLineNumber <em>Start Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line Number</em>'.
	 * @see org.nasdanika.models.markdown.Node#getStartLineNumber()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StartLineNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getEndOffset <em>End Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Offset</em>'.
	 * @see org.nasdanika.models.markdown.Node#getEndOffset()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EndOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getEndLineNumber <em>End Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line Number</em>'.
	 * @see org.nasdanika.models.markdown.Node#getEndLineNumber()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EndLineNumber();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.nasdanika.models.markdown.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Attribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.markdown.Attribute#getKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.markdown.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributable</em>'.
	 * @see org.nasdanika.models.markdown.Attributable
	 * @generated
	 */
	EClass getAttributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Attributable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.models.markdown.Attributable#getAttributes()
	 * @see #getAttributable()
	 * @generated
	 */
	EReference getAttributable_Attributes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline</em>'.
	 * @see org.nasdanika.models.markdown.Inline
	 * @generated
	 */
	EClass getInline();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.markdown.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see org.nasdanika.models.markdown.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Emphasis#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.markdown.Emphasis#getKind()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Emphasis#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.markdown.Emphasis#getChildren()
	 * @see #getEmphasis()
	 * @generated
	 */
	EReference getEmphasis_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.InlineCode <em>Inline Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Code</em>'.
	 * @see org.nasdanika.models.markdown.InlineCode
	 * @generated
	 */
	EClass getInlineCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineCode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.markdown.InlineCode#getValue()
	 * @see #getInlineCode()
	 * @generated
	 */
	EAttribute getInlineCode_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.nasdanika.models.markdown.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.models.markdown.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Link#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.markdown.Link#getTitle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.nasdanika.models.markdown.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Label();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.nasdanika.models.markdown.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.models.markdown.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.nasdanika.models.markdown.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Image#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.markdown.Image#getTitle()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Title();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.HardBreak <em>Hard Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Break</em>'.
	 * @see org.nasdanika.models.markdown.HardBreak
	 * @generated
	 */
	EClass getHardBreak();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.RawInline <em>Raw Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Inline</em>'.
	 * @see org.nasdanika.models.markdown.RawInline
	 * @generated
	 */
	EClass getRawInline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.RawInline#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.nasdanika.models.markdown.RawInline#getHtml()
	 * @see #getRawInline()
	 * @generated
	 */
	EAttribute getRawInline_Html();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.nasdanika.models.markdown.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Block#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.Block#getText()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see org.nasdanika.models.markdown.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Heading#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.nasdanika.models.markdown.Heading#getLevel()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Heading#getInlines <em>Inlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inlines</em>'.
	 * @see org.nasdanika.models.markdown.Heading#getInlines()
	 * @see #getHeading()
	 * @generated
	 */
	EReference getHeading_Inlines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.nasdanika.models.markdown.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Paragraph#getInlines <em>Inlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inlines</em>'.
	 * @see org.nasdanika.models.markdown.Paragraph#getInlines()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Inlines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.ThematicBreak <em>Thematic Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thematic Break</em>'.
	 * @see org.nasdanika.models.markdown.ThematicBreak
	 * @generated
	 */
	EClass getThematicBreak();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see org.nasdanika.models.markdown.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.CodeBlock#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.models.markdown.CodeBlock#getLanguage()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.CodeBlock#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.models.markdown.CodeBlock#getContent()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.HtmlBlock <em>Html Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Block</em>'.
	 * @see org.nasdanika.models.markdown.HtmlBlock
	 * @generated
	 */
	EClass getHtmlBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.HtmlBlock#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.nasdanika.models.markdown.HtmlBlock#getHtml()
	 * @see #getHtmlBlock()
	 * @generated
	 */
	EAttribute getHtmlBlock_Html();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see org.nasdanika.models.markdown.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.BlockQuote#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.markdown.BlockQuote#getChildren()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see org.nasdanika.models.markdown.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.ListItem#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see org.nasdanika.models.markdown.ListItem#getChecked()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Checked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.ListItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.markdown.ListItem#getChildren()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.nasdanika.models.markdown.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.List#getListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Type</em>'.
	 * @see org.nasdanika.models.markdown.List#getListType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ListType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.List#getStartNumber <em>Start Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Number</em>'.
	 * @see org.nasdanika.models.markdown.List#getStartNumber()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_StartNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.List#isLoose <em>Loose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loose</em>'.
	 * @see org.nasdanika.models.markdown.List#isLoose()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Loose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.markdown.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.nasdanika.models.markdown.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.markdown.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.models.markdown.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Table#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.nasdanika.models.markdown.Table#getBody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.nasdanika.models.markdown.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.models.markdown.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see org.nasdanika.models.markdown.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCell#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#getAlignment()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCell#isIsHeader <em>Is Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Header</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#isIsHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_IsHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.TableCell#getInlines <em>Inlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inlines</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#getInlines()
	 * @see #getTableCell()
	 * @generated
	 */
	EReference getTableCell_Inlines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.DefinitionTerm <em>Definition Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Term</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionTerm
	 * @generated
	 */
	EClass getDefinitionTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.DefinitionTerm#getInlines <em>Inlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inlines</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionTerm#getInlines()
	 * @see #getDefinitionTerm()
	 * @generated
	 */
	EReference getDefinitionTerm_Inlines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.DefinitionItem <em>Definition Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Item</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionItem
	 * @generated
	 */
	EClass getDefinitionItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.DefinitionItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionItem#getChildren()
	 * @see #getDefinitionItem()
	 * @generated
	 */
	EReference getDefinitionItem_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.nasdanika.models.markdown.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Document#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.nasdanika.models.markdown.Document#getBlocks()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Document#getSourceUri <em>Source Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Uri</em>'.
	 * @see org.nasdanika.models.markdown.Document#getSourceUri()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_SourceUri();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.markdown.HeadingLevel <em>Heading Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Heading Level</em>'.
	 * @see org.nasdanika.models.markdown.HeadingLevel
	 * @generated
	 */
	EEnum getHeadingLevel();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.markdown.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Type</em>'.
	 * @see org.nasdanika.models.markdown.ListType
	 * @generated
	 */
	EEnum getListType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.markdown.EmphasisKind <em>Emphasis Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emphasis Kind</em>'.
	 * @see org.nasdanika.models.markdown.EmphasisKind
	 * @generated
	 */
	EEnum getEmphasisKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkdownFactory getMarkdownFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.NodeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Start Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__START_OFFSET = eINSTANCE.getNode_StartOffset();

		/**
		 * The meta object literal for the '<em><b>Start Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__START_LINE_NUMBER = eINSTANCE.getNode_StartLineNumber();

		/**
		 * The meta object literal for the '<em><b>End Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__END_OFFSET = eINSTANCE.getNode_EndOffset();

		/**
		 * The meta object literal for the '<em><b>End Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__END_LINE_NUMBER = eINSTANCE.getNode_EndLineNumber();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.AttributeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.Attributable <em>Attributable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.Attributable
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getAttributable()
		 * @generated
		 */
		EClass ATTRIBUTABLE = eINSTANCE.getAttributable();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTABLE__ATTRIBUTES = eINSTANCE.getAttributable_Attributes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.InlineImpl <em>Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.InlineImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInline()
		 * @generated
		 */
		EClass INLINE = eINSTANCE.getInline();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TextImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.EmphasisImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__KIND = eINSTANCE.getEmphasis_Kind();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIS__CHILDREN = eINSTANCE.getEmphasis_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.InlineCodeImpl <em>Inline Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.InlineCodeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInlineCode()
		 * @generated
		 */
		EClass INLINE_CODE = eINSTANCE.getInlineCode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE__VALUE = eINSTANCE.getInlineCode_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.LinkImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TITLE = eINSTANCE.getLink_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ImageImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TITLE = eINSTANCE.getImage_Title();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.HardBreakImpl <em>Hard Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.HardBreakImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHardBreak()
		 * @generated
		 */
		EClass HARD_BREAK = eINSTANCE.getHardBreak();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.RawInlineImpl <em>Raw Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.RawInlineImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getRawInline()
		 * @generated
		 */
		EClass RAW_INLINE = eINSTANCE.getRawInline();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_INLINE__HTML = eINSTANCE.getRawInline_Html();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.BlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__TEXT = eINSTANCE.getBlock_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.HeadingImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__LEVEL = eINSTANCE.getHeading_Level();

		/**
		 * The meta object literal for the '<em><b>Inlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING__INLINES = eINSTANCE.getHeading_Inlines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ParagraphImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Inlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__INLINES = eINSTANCE.getParagraph_Inlines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ThematicBreakImpl <em>Thematic Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ThematicBreakImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getThematicBreak()
		 * @generated
		 */
		EClass THEMATIC_BREAK = eINSTANCE.getThematicBreak();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.CodeBlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__LANGUAGE = eINSTANCE.getCodeBlock_Language();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__CONTENT = eINSTANCE.getCodeBlock_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.HtmlBlockImpl <em>Html Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.HtmlBlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHtmlBlock()
		 * @generated
		 */
		EClass HTML_BLOCK = eINSTANCE.getHtmlBlock();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_BLOCK__HTML = eINSTANCE.getHtmlBlock_Html();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.BlockQuoteImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__CHILDREN = eINSTANCE.getBlockQuote_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ListItemImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__CHECKED = eINSTANCE.getListItem_Checked();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__CHILDREN = eINSTANCE.getListItem_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ListImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>List Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__LIST_TYPE = eINSTANCE.getList_ListType();

		/**
		 * The meta object literal for the '<em><b>Start Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__START_NUMBER = eINSTANCE.getList_StartNumber();

		/**
		 * The meta object literal for the '<em><b>Loose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__LOOSE = eINSTANCE.getList_Loose();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEADER = eINSTANCE.getTable_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BODY = eINSTANCE.getTable_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableRowImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableCellImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNMENT = eINSTANCE.getTableCell_Alignment();

		/**
		 * The meta object literal for the '<em><b>Is Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__IS_HEADER = eINSTANCE.getTableCell_IsHeader();

		/**
		 * The meta object literal for the '<em><b>Inlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL__INLINES = eINSTANCE.getTableCell_Inlines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.DefinitionTermImpl <em>Definition Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.DefinitionTermImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionTerm()
		 * @generated
		 */
		EClass DEFINITION_TERM = eINSTANCE.getDefinitionTerm();

		/**
		 * The meta object literal for the '<em><b>Inlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TERM__INLINES = eINSTANCE.getDefinitionTerm_Inlines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.DefinitionItemImpl <em>Definition Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.DefinitionItemImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionItem()
		 * @generated
		 */
		EClass DEFINITION_ITEM = eINSTANCE.getDefinitionItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ITEM__CHILDREN = eINSTANCE.getDefinitionItem_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.DocumentImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__BLOCKS = eINSTANCE.getDocument_Blocks();

		/**
		 * The meta object literal for the '<em><b>Source Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__SOURCE_URI = eINSTANCE.getDocument_SourceUri();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.HeadingLevel <em>Heading Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.HeadingLevel
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHeadingLevel()
		 * @generated
		 */
		EEnum HEADING_LEVEL = eINSTANCE.getHeadingLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.ListType <em>List Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.ListType
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListType()
		 * @generated
		 */
		EEnum LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.EmphasisKind <em>Emphasis Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.EmphasisKind
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getEmphasisKind()
		 * @generated
		 */
		EEnum EMPHASIS_KIND = eINSTANCE.getEmphasisKind();

	}

} //MarkdownPackage
