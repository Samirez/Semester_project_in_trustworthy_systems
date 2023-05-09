/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.gSelfOperatingHeuristicText.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage;
import org.xtext.gsht.gSelfOperatingHeuristicText.Verifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.gsht.gSelfOperatingHeuristicText.impl.VerifiersImpl#getVerifier <em>Verifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerifiersImpl extends MinimalEObjectImpl.Container implements Verifiers
{
  /**
   * The cached value of the '{@link #getVerifier() <em>Verifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifier()
   * @generated
   * @ordered
   */
  protected EList<String> verifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerifiersImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GSelfOperatingHeuristicTextPackage.Literals.VERIFIERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVerifier()
  {
    if (verifier == null)
    {
      verifier = new EDataTypeEList<String>(String.class, this, GSelfOperatingHeuristicTextPackage.VERIFIERS__VERIFIER);
    }
    return verifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GSelfOperatingHeuristicTextPackage.VERIFIERS__VERIFIER:
        return getVerifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GSelfOperatingHeuristicTextPackage.VERIFIERS__VERIFIER:
        getVerifier().clear();
        getVerifier().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GSelfOperatingHeuristicTextPackage.VERIFIERS__VERIFIER:
        getVerifier().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GSelfOperatingHeuristicTextPackage.VERIFIERS__VERIFIER:
        return verifier != null && !verifier.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (verifier: ");
    result.append(verifier);
    result.append(')');
    return result.toString();
  }

} //VerifiersImpl
