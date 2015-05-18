/**
 */
package linroad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Line</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see linroad.LinroadPackage#getLine()
 * @model
 * @generated
 */
public enum Line implements Enumerator {
	/**
	 * The '<em><b>Up Ramp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	UP_RAMP(0, "UpRamp", "UpRamp"),

	/**
	 * The '<em><b>Line1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE1_VALUE
	 * @generated
	 * @ordered
	 */
	LINE1(1, "Line1", "Line1"),

	/**
	 * The '<em><b>Line2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE2_VALUE
	 * @generated
	 * @ordered
	 */
	LINE2(2, "Line2", "Line2"),

	/**
	 * The '<em><b>Line3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE3_VALUE
	 * @generated
	 * @ordered
	 */
	LINE3(3, "Line3", "Line3"),

	/**
	 * The '<em><b>Down Ramp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN_RAMP(4, "DownRamp", "DownRamp");

	/**
	 * The '<em><b>Up Ramp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Up Ramp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP_RAMP
	 * @model name="UpRamp"
	 * @generated
	 * @ordered
	 */
	public static final int UP_RAMP_VALUE = 0;

	/**
	 * The '<em><b>Line1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE1
	 * @model name="Line1"
	 * @generated
	 * @ordered
	 */
	public static final int LINE1_VALUE = 1;

	/**
	 * The '<em><b>Line2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE2
	 * @model name="Line2"
	 * @generated
	 * @ordered
	 */
	public static final int LINE2_VALUE = 2;

	/**
	 * The '<em><b>Line3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE3
	 * @model name="Line3"
	 * @generated
	 * @ordered
	 */
	public static final int LINE3_VALUE = 3;

	/**
	 * The '<em><b>Down Ramp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Down Ramp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN_RAMP
	 * @model name="DownRamp"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_RAMP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Line</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Line[] VALUES_ARRAY =
		new Line[] {
			UP_RAMP,
			LINE1,
			LINE2,
			LINE3,
			DOWN_RAMP,
		};

	/**
	 * A public read-only list of all the '<em><b>Line</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Line> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Line</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Line get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Line result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Line getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Line result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Line get(int value) {
		switch (value) {
			case UP_RAMP_VALUE: return UP_RAMP;
			case LINE1_VALUE: return LINE1;
			case LINE2_VALUE: return LINE2;
			case LINE3_VALUE: return LINE3;
			case DOWN_RAMP_VALUE: return DOWN_RAMP;
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
	private Line(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Line
