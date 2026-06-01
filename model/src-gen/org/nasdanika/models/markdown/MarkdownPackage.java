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
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHARS = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTENT_END_OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ContentNodeImpl <em>Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ContentNodeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getContentNode()
	 * @generated
	 */
	int CONTENT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__CHILDREN = NODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.AttributeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

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
	int ATTRIBUTABLE = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE__ATTRIBUTES_START_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE__ATTRIBUTES_END_OFFSET = 2;

	/**
	 * The number of structural features of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.BlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_OFFSET = CONTENT_NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_LINE_NUMBER = CONTENT_NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_OFFSET = CONTENT_NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_LINE_NUMBER = CONTENT_NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHARS = CONTENT_NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT = CONTENT_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT_END_OFFSET = CONTENT_NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHILDREN = CONTENT_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES_START_OFFSET = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATTRIBUTES_END_OFFSET = CONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = CONTENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.HeadingImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 5;

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
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__LEVEL = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__TEXT = BLOCK_FEATURE_COUNT + 1;

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
	int PARAGRAPH = 6;

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
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl <em>Fenced Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.FencedCodeBlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getFencedCodeBlock()
	 * @generated
	 */
	int FENCED_CODE_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__INFO = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closing Fence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CLOSING_FENCE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__CLOSING_MARKER = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fence Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__FENCE_INDENT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fence Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__FENCE_LENGTH = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Opening Fence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__OPENING_FENCE = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK__OPENING_MARKER = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fenced Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Fenced Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCED_CODE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DocumentImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 8;

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
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SOURCE_URI = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

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
	int HEADING_LEVEL = 9;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getChars <em>Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chars</em>'.
	 * @see org.nasdanika.models.markdown.Node#getChars()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Chars();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.models.markdown.Node#getContent()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Node#getContentEndOffset <em>Content End Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content End Offset</em>'.
	 * @see org.nasdanika.models.markdown.Node#getContentEndOffset()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ContentEndOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.markdown.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.markdown.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.ContentNode <em>Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Node</em>'.
	 * @see org.nasdanika.models.markdown.ContentNode
	 * @generated
	 */
	EClass getContentNode();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Attributable#getAttributesStartOffset <em>Attributes Start Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes Start Offset</em>'.
	 * @see org.nasdanika.models.markdown.Attributable#getAttributesStartOffset()
	 * @see #getAttributable()
	 * @generated
	 */
	EAttribute getAttributable_AttributesStartOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Attributable#getAttributesEndOffset <em>Attributes End Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes End Offset</em>'.
	 * @see org.nasdanika.models.markdown.Attributable#getAttributesEndOffset()
	 * @see #getAttributable()
	 * @generated
	 */
	EAttribute getAttributable_AttributesEndOffset();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.Heading#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.Heading#getText()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Text();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.FencedCodeBlock <em>Fenced Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fenced Code Block</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock
	 * @generated
	 */
	EClass getFencedCodeBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getInfo()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_Info();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingFence <em>Closing Fence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Fence</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getClosingFence()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_ClosingFence();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getClosingMarker <em>Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getClosingMarker()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_ClosingMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceIndent <em>Fence Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fence Indent</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getFenceIndent()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_FenceIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getFenceLength <em>Fence Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fence Length</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getFenceLength()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_FenceLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningFence <em>Opening Fence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Fence</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getOpeningFence()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_OpeningFence();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.FencedCodeBlock#getOpeningMarker <em>Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.FencedCodeBlock#getOpeningMarker()
	 * @see #getFencedCodeBlock()
	 * @generated
	 */
	EAttribute getFencedCodeBlock_OpeningMarker();

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
		 * The meta object literal for the '<em><b>Chars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CHARS = eINSTANCE.getNode_Chars();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONTENT = eINSTANCE.getNode_Content();

		/**
		 * The meta object literal for the '<em><b>Content End Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONTENT_END_OFFSET = eINSTANCE.getNode_ContentEndOffset();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ContentNodeImpl <em>Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ContentNodeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getContentNode()
		 * @generated
		 */
		EClass CONTENT_NODE = eINSTANCE.getContentNode();

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
		 * The meta object literal for the '<em><b>Attributes Start Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTABLE__ATTRIBUTES_START_OFFSET = eINSTANCE.getAttributable_AttributesStartOffset();

		/**
		 * The meta object literal for the '<em><b>Attributes End Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTABLE__ATTRIBUTES_END_OFFSET = eINSTANCE.getAttributable_AttributesEndOffset();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__TEXT = eINSTANCE.getHeading_Text();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.FencedCodeBlockImpl <em>Fenced Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.FencedCodeBlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getFencedCodeBlock()
		 * @generated
		 */
		EClass FENCED_CODE_BLOCK = eINSTANCE.getFencedCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__INFO = eINSTANCE.getFencedCodeBlock_Info();

		/**
		 * The meta object literal for the '<em><b>Closing Fence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__CLOSING_FENCE = eINSTANCE.getFencedCodeBlock_ClosingFence();

		/**
		 * The meta object literal for the '<em><b>Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__CLOSING_MARKER = eINSTANCE.getFencedCodeBlock_ClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Fence Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__FENCE_INDENT = eINSTANCE.getFencedCodeBlock_FenceIndent();

		/**
		 * The meta object literal for the '<em><b>Fence Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__FENCE_LENGTH = eINSTANCE.getFencedCodeBlock_FenceLength();

		/**
		 * The meta object literal for the '<em><b>Opening Fence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__OPENING_FENCE = eINSTANCE.getFencedCodeBlock_OpeningFence();

		/**
		 * The meta object literal for the '<em><b>Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCED_CODE_BLOCK__OPENING_MARKER = eINSTANCE.getFencedCodeBlock_OpeningMarker();

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

	}

} //MarkdownPackage
