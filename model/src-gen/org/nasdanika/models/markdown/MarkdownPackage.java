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
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ListBlockImpl <em>List Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ListBlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListBlock()
	 * @generated
	 */
	int LIST_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Tight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__TIGHT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.OrderedListImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 9;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__START_OFFSET = LIST_BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__START_LINE_NUMBER = LIST_BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__END_OFFSET = LIST_BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__END_LINE_NUMBER = LIST_BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CHARS = LIST_BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CONTENT = LIST_BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CONTENT_END_OFFSET = LIST_BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CHILDREN = LIST_BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ATTRIBUTES = LIST_BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ATTRIBUTES_START_OFFSET = LIST_BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ATTRIBUTES_END_OFFSET = LIST_BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Tight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__TIGHT = LIST_BLOCK__TIGHT;

	/**
	 * The feature id for the '<em><b>Start Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__START_NUMBER = LIST_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__DELIMITER = LIST_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = LIST_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = LIST_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.BulletListImpl <em>Bullet List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.BulletListImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBulletList()
	 * @generated
	 */
	int BULLET_LIST = 10;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__START_OFFSET = LIST_BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__START_LINE_NUMBER = LIST_BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__END_OFFSET = LIST_BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__END_LINE_NUMBER = LIST_BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__CHARS = LIST_BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__CONTENT = LIST_BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__CONTENT_END_OFFSET = LIST_BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__CHILDREN = LIST_BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__ATTRIBUTES = LIST_BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__ATTRIBUTES_START_OFFSET = LIST_BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__ATTRIBUTES_END_OFFSET = LIST_BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Tight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__TIGHT = LIST_BLOCK__TIGHT;

	/**
	 * The feature id for the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__OPENING_MARKER = LIST_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_FEATURE_COUNT = LIST_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_OPERATION_COUNT = LIST_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DefinitionListImpl <em>Definition List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DefinitionListImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionList()
	 * @generated
	 */
	int DEFINITION_LIST = 11;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__START_OFFSET = LIST_BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__START_LINE_NUMBER = LIST_BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__END_OFFSET = LIST_BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__END_LINE_NUMBER = LIST_BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__CHARS = LIST_BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__CONTENT = LIST_BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__CONTENT_END_OFFSET = LIST_BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__CHILDREN = LIST_BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__ATTRIBUTES = LIST_BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__ATTRIBUTES_START_OFFSET = LIST_BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__ATTRIBUTES_END_OFFSET = LIST_BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Tight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST__TIGHT = LIST_BLOCK__TIGHT;

	/**
	 * The number of structural features of the '<em>Definition List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST_FEATURE_COUNT = LIST_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_LIST_OPERATION_COUNT = LIST_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.ListItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 12;

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
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.BulletListItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBulletListItem()
	 * @generated
	 */
	int BULLET_LIST_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__START_OFFSET = LIST_ITEM__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__START_LINE_NUMBER = LIST_ITEM__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__END_OFFSET = LIST_ITEM__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__END_LINE_NUMBER = LIST_ITEM__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__CHARS = LIST_ITEM__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__CONTENT = LIST_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__CONTENT_END_OFFSET = LIST_ITEM__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__CHILDREN = LIST_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__ATTRIBUTES = LIST_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__ATTRIBUTES_START_OFFSET = LIST_ITEM__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__ATTRIBUTES_END_OFFSET = LIST_ITEM__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DefinitionItemImpl <em>Definition Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DefinitionItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionItem()
	 * @generated
	 */
	int DEFINITION_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__START_OFFSET = LIST_ITEM__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__START_LINE_NUMBER = LIST_ITEM__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__END_OFFSET = LIST_ITEM__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__END_LINE_NUMBER = LIST_ITEM__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__CHARS = LIST_ITEM__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__CONTENT = LIST_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__CONTENT_END_OFFSET = LIST_ITEM__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__CHILDREN = LIST_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__ATTRIBUTES = LIST_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__ATTRIBUTES_START_OFFSET = LIST_ITEM__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM__ATTRIBUTES_END_OFFSET = LIST_ITEM__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Definition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DefinitionTermImpl <em>Definition Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DefinitionTermImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionTerm()
	 * @generated
	 */
	int DEFINITION_TERM = 15;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__START_OFFSET = LIST_ITEM__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__START_LINE_NUMBER = LIST_ITEM__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__END_OFFSET = LIST_ITEM__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__END_LINE_NUMBER = LIST_ITEM__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__CHARS = LIST_ITEM__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__CONTENT = LIST_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__CONTENT_END_OFFSET = LIST_ITEM__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__CHILDREN = LIST_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__ATTRIBUTES = LIST_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__ATTRIBUTES_START_OFFSET = LIST_ITEM__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM__ATTRIBUTES_END_OFFSET = LIST_ITEM__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TERM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.OrderedListItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getOrderedListItem()
	 * @generated
	 */
	int ORDERED_LIST_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__START_OFFSET = LIST_ITEM__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__START_LINE_NUMBER = LIST_ITEM__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__END_OFFSET = LIST_ITEM__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__END_LINE_NUMBER = LIST_ITEM__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__CHARS = LIST_ITEM__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__CONTENT = LIST_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__CONTENT_END_OFFSET = LIST_ITEM__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__CHILDREN = LIST_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__ATTRIBUTES = LIST_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__ATTRIBUTES_START_OFFSET = LIST_ITEM__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__ATTRIBUTES_END_OFFSET = LIST_ITEM__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TaskListItemImpl <em>Task List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TaskListItemImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTaskListItem()
	 * @generated
	 */
	int TASK_LIST_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__START_OFFSET = LIST_ITEM__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__START_LINE_NUMBER = LIST_ITEM__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__END_OFFSET = LIST_ITEM__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__END_LINE_NUMBER = LIST_ITEM__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__CHARS = LIST_ITEM__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__CONTENT = LIST_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__CONTENT_END_OFFSET = LIST_ITEM__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__CHILDREN = LIST_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__ATTRIBUTES = LIST_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__ATTRIBUTES_START_OFFSET = LIST_ITEM__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM__ATTRIBUTES_END_OFFSET = LIST_ITEM__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Task List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl <em>Link Node Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.LinkNodeBaseImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLinkNodeBase()
	 * @generated
	 */
	int LINK_NODE_BASE = 18;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Anchor Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__ANCHOR_MARKER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anchor Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__ANCHOR_REF = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__PAGE_REF = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__TITLE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__TITLE_CLOSING_MARKER = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__TITLE_OPENING_MARKER = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__URL = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__URL_CLOSING_MARKER = NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Url Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE__URL_OPENING_MARKER = NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Link Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE_FEATURE_COUNT = NODE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Link Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_BASE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.LinkNodeImpl <em>Link Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.LinkNodeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLinkNode()
	 * @generated
	 */
	int LINK_NODE = 19;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__START_OFFSET = LINK_NODE_BASE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__START_LINE_NUMBER = LINK_NODE_BASE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__END_OFFSET = LINK_NODE_BASE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__END_LINE_NUMBER = LINK_NODE_BASE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__CHARS = LINK_NODE_BASE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__CONTENT = LINK_NODE_BASE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__CONTENT_END_OFFSET = LINK_NODE_BASE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__CHILDREN = LINK_NODE_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Anchor Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__ANCHOR_MARKER = LINK_NODE_BASE__ANCHOR_MARKER;

	/**
	 * The feature id for the '<em><b>Anchor Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__ANCHOR_REF = LINK_NODE_BASE__ANCHOR_REF;

	/**
	 * The feature id for the '<em><b>Page Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__PAGE_REF = LINK_NODE_BASE__PAGE_REF;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__TITLE = LINK_NODE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Title Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__TITLE_CLOSING_MARKER = LINK_NODE_BASE__TITLE_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Title Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__TITLE_OPENING_MARKER = LINK_NODE_BASE__TITLE_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__URL = LINK_NODE_BASE__URL;

	/**
	 * The feature id for the '<em><b>Url Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__URL_CLOSING_MARKER = LINK_NODE_BASE__URL_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Url Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE__URL_OPENING_MARKER = LINK_NODE_BASE__URL_OPENING_MARKER;

	/**
	 * The number of structural features of the '<em>Link Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_FEATURE_COUNT = LINK_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_OPERATION_COUNT = LINK_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl <em>Inline Link Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.InlineLinkNodeImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInlineLinkNode()
	 * @generated
	 */
	int INLINE_LINK_NODE = 20;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__START_OFFSET = LINK_NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__START_LINE_NUMBER = LINK_NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__END_OFFSET = LINK_NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__END_LINE_NUMBER = LINK_NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__CHARS = LINK_NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__CONTENT = LINK_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__CONTENT_END_OFFSET = LINK_NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__CHILDREN = LINK_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Anchor Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__ANCHOR_MARKER = LINK_NODE__ANCHOR_MARKER;

	/**
	 * The feature id for the '<em><b>Anchor Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__ANCHOR_REF = LINK_NODE__ANCHOR_REF;

	/**
	 * The feature id for the '<em><b>Page Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__PAGE_REF = LINK_NODE__PAGE_REF;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TITLE = LINK_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Title Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TITLE_CLOSING_MARKER = LINK_NODE__TITLE_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Title Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TITLE_OPENING_MARKER = LINK_NODE__TITLE_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__URL = LINK_NODE__URL;

	/**
	 * The feature id for the '<em><b>Url Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__URL_CLOSING_MARKER = LINK_NODE__URL_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Url Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__URL_OPENING_MARKER = LINK_NODE__URL_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Link Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__LINK_CLOSING_MARKER = LINK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__LINK_OPENING_MARKER = LINK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TEXT = LINK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TEXT_CLOSING_MARKER = LINK_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE__TEXT_OPENING_MARKER = LINK_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Inline Link Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE_FEATURE_COUNT = LINK_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Inline Link Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_LINK_NODE_OPERATION_COUNT = LINK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.LinkImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 21;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__START_OFFSET = INLINE_LINK_NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__START_LINE_NUMBER = INLINE_LINK_NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__END_OFFSET = INLINE_LINK_NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__END_LINE_NUMBER = INLINE_LINK_NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CHARS = INLINE_LINK_NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTENT = INLINE_LINK_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTENT_END_OFFSET = INLINE_LINK_NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CHILDREN = INLINE_LINK_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Anchor Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR_MARKER = INLINE_LINK_NODE__ANCHOR_MARKER;

	/**
	 * The feature id for the '<em><b>Anchor Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR_REF = INLINE_LINK_NODE__ANCHOR_REF;

	/**
	 * The feature id for the '<em><b>Page Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PAGE_REF = INLINE_LINK_NODE__PAGE_REF;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = INLINE_LINK_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Title Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE_CLOSING_MARKER = INLINE_LINK_NODE__TITLE_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Title Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE_OPENING_MARKER = INLINE_LINK_NODE__TITLE_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = INLINE_LINK_NODE__URL;

	/**
	 * The feature id for the '<em><b>Url Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL_CLOSING_MARKER = INLINE_LINK_NODE__URL_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Url Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL_OPENING_MARKER = INLINE_LINK_NODE__URL_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Link Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_CLOSING_MARKER = INLINE_LINK_NODE__LINK_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Link Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_OPENING_MARKER = INLINE_LINK_NODE__LINK_OPENING_MARKER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = INLINE_LINK_NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Text Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT_CLOSING_MARKER = INLINE_LINK_NODE__TEXT_CLOSING_MARKER;

	/**
	 * The feature id for the '<em><b>Text Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT_OPENING_MARKER = INLINE_LINK_NODE__TEXT_OPENING_MARKER;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = INLINE_LINK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = INLINE_LINK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableBlockImpl <em>Table Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableBlockImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableBlock()
	 * @generated
	 */
	int TABLE_BLOCK = 22;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__START_OFFSET = BLOCK__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__START_LINE_NUMBER = BLOCK__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__END_OFFSET = BLOCK__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__END_LINE_NUMBER = BLOCK__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__CHARS = BLOCK__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__CONTENT = BLOCK__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__CONTENT_END_OFFSET = BLOCK__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__CHILDREN = BLOCK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__ATTRIBUTES = BLOCK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__ATTRIBUTES_START_OFFSET = BLOCK__ATTRIBUTES_START_OFFSET;

	/**
	 * The feature id for the '<em><b>Attributes End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__ATTRIBUTES_END_OFFSET = BLOCK__ATTRIBUTES_END_OFFSET;

	/**
	 * The number of structural features of the '<em>Table Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableBodyImpl <em>Table Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableBodyImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableBody()
	 * @generated
	 */
	int TABLE_BODY = 23;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__CHILDREN = NODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableCaptionImpl <em>Table Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableCaptionImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCaption()
	 * @generated
	 */
	int TABLE_CAPTION = 24;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__OPENING_MARKER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__TEXT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION__CLOSING_MARKER = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CAPTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableCellImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 25;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Opening Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__OPENING_MARKER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TEXT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closing Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CLOSING_MARKER = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNMENT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableHeadImpl <em>Table Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableHeadImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableHead()
	 * @generated
	 */
	int TABLE_HEAD = 26;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__CHILDREN = NODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableRowImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 27;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CHILDREN = NODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.TableSeparatorImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableSeparator()
	 * @generated
	 */
	int TABLE_SEPARATOR = 28;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__START_OFFSET = NODE__START_OFFSET;

	/**
	 * The feature id for the '<em><b>Start Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__START_LINE_NUMBER = NODE__START_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__END_OFFSET = NODE__END_OFFSET;

	/**
	 * The feature id for the '<em><b>End Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__END_LINE_NUMBER = NODE__END_LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__CHARS = NODE__CHARS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__CONTENT = NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__CONTENT_END_OFFSET = NODE__CONTENT_END_OFFSET;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__CHILDREN = NODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.impl.DocumentImpl
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 29;

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
	int HEADING_LEVEL = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.markdown.TableCellAlignment <em>Table Cell Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.markdown.TableCellAlignment
	 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCellAlignment()
	 * @generated
	 */
	int TABLE_CELL_ALIGNMENT = 31;


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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.ListBlock <em>List Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Block</em>'.
	 * @see org.nasdanika.models.markdown.ListBlock
	 * @generated
	 */
	EClass getListBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.ListBlock#isTight <em>Tight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tight</em>'.
	 * @see org.nasdanika.models.markdown.ListBlock#isTight()
	 * @see #getListBlock()
	 * @generated
	 */
	EAttribute getListBlock_Tight();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see org.nasdanika.models.markdown.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.OrderedList#getStartNumber <em>Start Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Number</em>'.
	 * @see org.nasdanika.models.markdown.OrderedList#getStartNumber()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_StartNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.OrderedList#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see org.nasdanika.models.markdown.OrderedList#getDelimiter()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_Delimiter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.BulletList <em>Bullet List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List</em>'.
	 * @see org.nasdanika.models.markdown.BulletList
	 * @generated
	 */
	EClass getBulletList();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.BulletList#getOpeningMarker <em>Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.BulletList#getOpeningMarker()
	 * @see #getBulletList()
	 * @generated
	 */
	EAttribute getBulletList_OpeningMarker();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.DefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition List</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionList
	 * @generated
	 */
	EClass getDefinitionList();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.BulletListItem <em>Bullet List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List Item</em>'.
	 * @see org.nasdanika.models.markdown.BulletListItem
	 * @generated
	 */
	EClass getBulletListItem();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.DefinitionTerm <em>Definition Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Term</em>'.
	 * @see org.nasdanika.models.markdown.DefinitionTerm
	 * @generated
	 */
	EClass getDefinitionTerm();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.OrderedListItem <em>Ordered List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Item</em>'.
	 * @see org.nasdanika.models.markdown.OrderedListItem
	 * @generated
	 */
	EClass getOrderedListItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TaskListItem <em>Task List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task List Item</em>'.
	 * @see org.nasdanika.models.markdown.TaskListItem
	 * @generated
	 */
	EClass getTaskListItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.LinkNodeBase <em>Link Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Node Base</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase
	 * @generated
	 */
	EClass getLinkNodeBase();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorMarker <em>Anchor Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Marker</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getAnchorMarker()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_AnchorMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getAnchorRef <em>Anchor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Ref</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getAnchorRef()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_AnchorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getPageRef <em>Page Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Ref</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getPageRef()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_PageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getTitle()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleClosingMarker <em>Title Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getTitleClosingMarker()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_TitleClosingMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getTitleOpeningMarker <em>Title Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getTitleOpeningMarker()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_TitleOpeningMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getUrl()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlClosingMarker <em>Url Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getUrlClosingMarker()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_UrlClosingMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.LinkNodeBase#getUrlOpeningMarker <em>Url Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.LinkNodeBase#getUrlOpeningMarker()
	 * @see #getLinkNodeBase()
	 * @generated
	 */
	EAttribute getLinkNodeBase_UrlOpeningMarker();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.LinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Node</em>'.
	 * @see org.nasdanika.models.markdown.LinkNode
	 * @generated
	 */
	EClass getLinkNode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.InlineLinkNode <em>Inline Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Link Node</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode
	 * @generated
	 */
	EClass getInlineLinkNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkClosingMarker <em>Link Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode#getLinkClosingMarker()
	 * @see #getInlineLinkNode()
	 * @generated
	 */
	EAttribute getInlineLinkNode_LinkClosingMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineLinkNode#getLinkOpeningMarker <em>Link Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode#getLinkOpeningMarker()
	 * @see #getInlineLinkNode()
	 * @generated
	 */
	EAttribute getInlineLinkNode_LinkOpeningMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineLinkNode#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode#getText()
	 * @see #getInlineLinkNode()
	 * @generated
	 */
	EAttribute getInlineLinkNode_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineLinkNode#getTextClosingMarker <em>Text Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode#getTextClosingMarker()
	 * @see #getInlineLinkNode()
	 * @generated
	 */
	EAttribute getInlineLinkNode_TextClosingMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.InlineLinkNode#getTextOpeningMarker <em>Text Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.InlineLinkNode#getTextOpeningMarker()
	 * @see #getInlineLinkNode()
	 * @generated
	 */
	EAttribute getInlineLinkNode_TextOpeningMarker();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableBlock <em>Table Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Block</em>'.
	 * @see org.nasdanika.models.markdown.TableBlock
	 * @generated
	 */
	EClass getTableBlock();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Body</em>'.
	 * @see org.nasdanika.models.markdown.TableBody
	 * @generated
	 */
	EClass getTableBody();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableCaption <em>Table Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Caption</em>'.
	 * @see org.nasdanika.models.markdown.TableCaption
	 * @generated
	 */
	EClass getTableCaption();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCaption#getOpeningMarker <em>Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.TableCaption#getOpeningMarker()
	 * @see #getTableCaption()
	 * @generated
	 */
	EAttribute getTableCaption_OpeningMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCaption#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.TableCaption#getText()
	 * @see #getTableCaption()
	 * @generated
	 */
	EAttribute getTableCaption_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCaption#getClosingMarker <em>Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.TableCaption#getClosingMarker()
	 * @see #getTableCaption()
	 * @generated
	 */
	EAttribute getTableCaption_ClosingMarker();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCell#getOpeningMarker <em>Opening Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Marker</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#getOpeningMarker()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_OpeningMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCell#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#getText()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.markdown.TableCell#getClosingMarker <em>Closing Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Marker</em>'.
	 * @see org.nasdanika.models.markdown.TableCell#getClosingMarker()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_ClosingMarker();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Head</em>'.
	 * @see org.nasdanika.models.markdown.TableHead
	 * @generated
	 */
	EClass getTableHead();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.markdown.TableSeparator <em>Table Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Separator</em>'.
	 * @see org.nasdanika.models.markdown.TableSeparator
	 * @generated
	 */
	EClass getTableSeparator();

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
	 * Returns the meta object for enum '{@link org.nasdanika.models.markdown.TableCellAlignment <em>Table Cell Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Cell Alignment</em>'.
	 * @see org.nasdanika.models.markdown.TableCellAlignment
	 * @generated
	 */
	EEnum getTableCellAlignment();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.ListBlockImpl <em>List Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.ListBlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getListBlock()
		 * @generated
		 */
		EClass LIST_BLOCK = eINSTANCE.getListBlock();

		/**
		 * The meta object literal for the '<em><b>Tight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_BLOCK__TIGHT = eINSTANCE.getListBlock_Tight();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.OrderedListImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '<em><b>Start Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__START_NUMBER = eINSTANCE.getOrderedList_StartNumber();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__DELIMITER = eINSTANCE.getOrderedList_Delimiter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.BulletListImpl <em>Bullet List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.BulletListImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBulletList()
		 * @generated
		 */
		EClass BULLET_LIST = eINSTANCE.getBulletList();

		/**
		 * The meta object literal for the '<em><b>Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULLET_LIST__OPENING_MARKER = eINSTANCE.getBulletList_OpeningMarker();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.DefinitionListImpl <em>Definition List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.DefinitionListImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionList()
		 * @generated
		 */
		EClass DEFINITION_LIST = eINSTANCE.getDefinitionList();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.BulletListItemImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getBulletListItem()
		 * @generated
		 */
		EClass BULLET_LIST_ITEM = eINSTANCE.getBulletListItem();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.DefinitionTermImpl <em>Definition Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.DefinitionTermImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getDefinitionTerm()
		 * @generated
		 */
		EClass DEFINITION_TERM = eINSTANCE.getDefinitionTerm();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.OrderedListItemImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getOrderedListItem()
		 * @generated
		 */
		EClass ORDERED_LIST_ITEM = eINSTANCE.getOrderedListItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TaskListItemImpl <em>Task List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TaskListItemImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTaskListItem()
		 * @generated
		 */
		EClass TASK_LIST_ITEM = eINSTANCE.getTaskListItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.LinkNodeBaseImpl <em>Link Node Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.LinkNodeBaseImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLinkNodeBase()
		 * @generated
		 */
		EClass LINK_NODE_BASE = eINSTANCE.getLinkNodeBase();

		/**
		 * The meta object literal for the '<em><b>Anchor Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__ANCHOR_MARKER = eINSTANCE.getLinkNodeBase_AnchorMarker();

		/**
		 * The meta object literal for the '<em><b>Anchor Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__ANCHOR_REF = eINSTANCE.getLinkNodeBase_AnchorRef();

		/**
		 * The meta object literal for the '<em><b>Page Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__PAGE_REF = eINSTANCE.getLinkNodeBase_PageRef();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__TITLE = eINSTANCE.getLinkNodeBase_Title();

		/**
		 * The meta object literal for the '<em><b>Title Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__TITLE_CLOSING_MARKER = eINSTANCE.getLinkNodeBase_TitleClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Title Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__TITLE_OPENING_MARKER = eINSTANCE.getLinkNodeBase_TitleOpeningMarker();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__URL = eINSTANCE.getLinkNodeBase_Url();

		/**
		 * The meta object literal for the '<em><b>Url Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__URL_CLOSING_MARKER = eINSTANCE.getLinkNodeBase_UrlClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Url Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_BASE__URL_OPENING_MARKER = eINSTANCE.getLinkNodeBase_UrlOpeningMarker();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.LinkNodeImpl <em>Link Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.LinkNodeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getLinkNode()
		 * @generated
		 */
		EClass LINK_NODE = eINSTANCE.getLinkNode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.InlineLinkNodeImpl <em>Inline Link Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.InlineLinkNodeImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getInlineLinkNode()
		 * @generated
		 */
		EClass INLINE_LINK_NODE = eINSTANCE.getInlineLinkNode();

		/**
		 * The meta object literal for the '<em><b>Link Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_LINK_NODE__LINK_CLOSING_MARKER = eINSTANCE.getInlineLinkNode_LinkClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Link Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_LINK_NODE__LINK_OPENING_MARKER = eINSTANCE.getInlineLinkNode_LinkOpeningMarker();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_LINK_NODE__TEXT = eINSTANCE.getInlineLinkNode_Text();

		/**
		 * The meta object literal for the '<em><b>Text Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_LINK_NODE__TEXT_CLOSING_MARKER = eINSTANCE.getInlineLinkNode_TextClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Text Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_LINK_NODE__TEXT_OPENING_MARKER = eINSTANCE.getInlineLinkNode_TextOpeningMarker();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableBlockImpl <em>Table Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableBlockImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableBlock()
		 * @generated
		 */
		EClass TABLE_BLOCK = eINSTANCE.getTableBlock();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableBodyImpl <em>Table Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableBodyImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableBody()
		 * @generated
		 */
		EClass TABLE_BODY = eINSTANCE.getTableBody();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableCaptionImpl <em>Table Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableCaptionImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCaption()
		 * @generated
		 */
		EClass TABLE_CAPTION = eINSTANCE.getTableCaption();

		/**
		 * The meta object literal for the '<em><b>Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CAPTION__OPENING_MARKER = eINSTANCE.getTableCaption_OpeningMarker();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CAPTION__TEXT = eINSTANCE.getTableCaption_Text();

		/**
		 * The meta object literal for the '<em><b>Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CAPTION__CLOSING_MARKER = eINSTANCE.getTableCaption_ClosingMarker();

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
		 * The meta object literal for the '<em><b>Opening Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__OPENING_MARKER = eINSTANCE.getTableCell_OpeningMarker();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__TEXT = eINSTANCE.getTableCell_Text();

		/**
		 * The meta object literal for the '<em><b>Closing Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__CLOSING_MARKER = eINSTANCE.getTableCell_ClosingMarker();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNMENT = eINSTANCE.getTableCell_Alignment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableHeadImpl <em>Table Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableHeadImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableHead()
		 * @generated
		 */
		EClass TABLE_HEAD = eINSTANCE.getTableHead();

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
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.impl.TableSeparatorImpl
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableSeparator()
		 * @generated
		 */
		EClass TABLE_SEPARATOR = eINSTANCE.getTableSeparator();

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

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.markdown.TableCellAlignment <em>Table Cell Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.markdown.TableCellAlignment
		 * @see org.nasdanika.models.markdown.impl.MarkdownPackageImpl#getTableCellAlignment()
		 * @generated
		 */
		EEnum TABLE_CELL_ALIGNMENT = eINSTANCE.getTableCellAlignment();

	}

} //MarkdownPackage
