/**
 */
package org.nasdanika.models.markdown;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Heading Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Heading levels 1–6, matching ATX / Setext heading syntax.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.markdown.MarkdownPackage#getHeadingLevel()
 * @model
 * @generated
 */
public enum HeadingLevel implements Enumerator {
	/**
	 * The '<em><b>H1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1_VALUE
	 * @generated
	 * @ordered
	 */
	H1(1, "H1", "H1"),

	/**
	 * The '<em><b>H2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2_VALUE
	 * @generated
	 * @ordered
	 */
	H2(2, "H2", "H2"),

	/**
	 * The '<em><b>H3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H3_VALUE
	 * @generated
	 * @ordered
	 */
	H3(3, "H3", "H3"),

	/**
	 * The '<em><b>H4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H4_VALUE
	 * @generated
	 * @ordered
	 */
	H4(4, "H4", "H4"),

	/**
	 * The '<em><b>H5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H5_VALUE
	 * @generated
	 * @ordered
	 */
	H5(5, "H5", "H5"),

	/**
	 * The '<em><b>H6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H6_VALUE
	 * @generated
	 * @ordered
	 */
	H6(6, "H6", "H6");

	/**
	 * The '<em><b>H1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H1_VALUE = 1;

	/**
	 * The '<em><b>H2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H2_VALUE = 2;

	/**
	 * The '<em><b>H3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H3_VALUE = 3;

	/**
	 * The '<em><b>H4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H4_VALUE = 4;

	/**
	 * The '<em><b>H5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H5_VALUE = 5;

	/**
	 * The '<em><b>H6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H6_VALUE = 6;

	/**
	 * An array of all the '<em><b>Heading Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HeadingLevel[] VALUES_ARRAY =
		new HeadingLevel[] {
			H1,
			H2,
			H3,
			H4,
			H5,
			H6,
		};

	/**
	 * A public read-only list of all the '<em><b>Heading Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HeadingLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Heading Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HeadingLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeadingLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Heading Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HeadingLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeadingLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Heading Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HeadingLevel get(int value) {
		switch (value) {
			case H1_VALUE: return H1;
			case H2_VALUE: return H2;
			case H3_VALUE: return H3;
			case H4_VALUE: return H4;
			case H5_VALUE: return H5;
			case H6_VALUE: return H6;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HeadingLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HeadingLevel
