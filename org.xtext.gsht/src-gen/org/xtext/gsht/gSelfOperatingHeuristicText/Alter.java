/**
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.gSelfOperatingHeuristicText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.gsht.gSelfOperatingHeuristicText.Alter#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.gsht.gSelfOperatingHeuristicText.Alter#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.xtext.gsht.gSelfOperatingHeuristicText.Alter#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage#getAlter()
 * @model
 * @generated
 */
public interface Alter extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage#getAlter_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.xtext.gsht.gSelfOperatingHeuristicText.Alter#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.gsht.gSelfOperatingHeuristicText.Local}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locals</em>' containment reference list.
   * @see org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage#getAlter_Locals()
   * @model containment="true"
   * @generated
   */
  EList<Local> getLocals();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.gsht.gSelfOperatingHeuristicText.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage#getAlter_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Alter
