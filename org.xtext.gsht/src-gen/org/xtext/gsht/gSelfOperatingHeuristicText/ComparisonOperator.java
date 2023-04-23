/**
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.gSelfOperatingHeuristicText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage#getComparisonOperator()
 * @model
 * @generated
 */
public enum ComparisonOperator implements Enumerator
{
  /**
   * The '<em><b>NOT BOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_BOOL_VALUE
   * @generated
   * @ordered
   */
  NOT_BOOL(0, "NOT_BOOL", "\u00a4\u00a4"),

  /**
   * The '<em><b>NOT EQUALS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_EQUALS_VALUE
   * @generated
   * @ordered
   */
  NOT_EQUALS(1, "NOT_EQUALS", "!="),

  /**
   * The '<em><b>EQUALS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUALS_VALUE
   * @generated
   * @ordered
   */
  EQUALS(2, "EQUALS", "=="),

  /**
   * The '<em><b>GREATER THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN(3, "GREATER_THAN", ">"),

  /**
   * The '<em><b>LESS THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN(4, "LESS_THAN", "<"),

  /**
   * The '<em><b>GREATER THAN OR EQUALS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_OR_EQUALS_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN_OR_EQUALS(5, "GREATER_THAN_OR_EQUALS", ">="),

  /**
   * The '<em><b>LESS THAN OR EQUALS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_OR_EQUALS_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN_OR_EQUALS(6, "LESS_THAN_OR_EQUALS", "<=");

  /**
   * The '<em><b>NOT BOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_BOOL
   * @model literal="\244\244"
   * @generated
   * @ordered
   */
  public static final int NOT_BOOL_VALUE = 0;

  /**
   * The '<em><b>NOT EQUALS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_EQUALS
   * @model literal="!="
   * @generated
   * @ordered
   */
  public static final int NOT_EQUALS_VALUE = 1;

  /**
   * The '<em><b>EQUALS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUALS
   * @model literal="=="
   * @generated
   * @ordered
   */
  public static final int EQUALS_VALUE = 2;

  /**
   * The '<em><b>GREATER THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN
   * @model literal="&gt;"
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_VALUE = 3;

  /**
   * The '<em><b>LESS THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN
   * @model literal="&lt;"
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_VALUE = 4;

  /**
   * The '<em><b>GREATER THAN OR EQUALS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_OR_EQUALS
   * @model literal="&gt;="
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_OR_EQUALS_VALUE = 5;

  /**
   * The '<em><b>LESS THAN OR EQUALS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_OR_EQUALS
   * @model literal="&lt;="
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_OR_EQUALS_VALUE = 6;

  /**
   * An array of all the '<em><b>Comparison Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ComparisonOperator[] VALUES_ARRAY =
    new ComparisonOperator[]
    {
      NOT_BOOL,
      NOT_EQUALS,
      EQUALS,
      GREATER_THAN,
      LESS_THAN,
      GREATER_THAN_OR_EQUALS,
      LESS_THAN_OR_EQUALS,
    };

  /**
   * A public read-only list of all the '<em><b>Comparison Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ComparisonOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComparisonOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComparisonOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator get(int value)
  {
    switch (value)
    {
      case NOT_BOOL_VALUE: return NOT_BOOL;
      case NOT_EQUALS_VALUE: return NOT_EQUALS;
      case EQUALS_VALUE: return EQUALS;
      case GREATER_THAN_VALUE: return GREATER_THAN;
      case LESS_THAN_VALUE: return LESS_THAN;
      case GREATER_THAN_OR_EQUALS_VALUE: return GREATER_THAN_OR_EQUALS;
      case LESS_THAN_OR_EQUALS_VALUE: return LESS_THAN_OR_EQUALS;
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
  private ComparisonOperator(int value, String name, String literal)
  {
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
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ComparisonOperator
