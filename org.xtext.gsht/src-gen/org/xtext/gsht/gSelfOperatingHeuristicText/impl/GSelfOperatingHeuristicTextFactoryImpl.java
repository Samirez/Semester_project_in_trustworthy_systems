/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.gSelfOperatingHeuristicText.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.gsht.gSelfOperatingHeuristicText.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSelfOperatingHeuristicTextFactoryImpl extends EFactoryImpl implements GSelfOperatingHeuristicTextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GSelfOperatingHeuristicTextFactory init()
  {
    try
    {
      GSelfOperatingHeuristicTextFactory theGSelfOperatingHeuristicTextFactory = (GSelfOperatingHeuristicTextFactory)EPackage.Registry.INSTANCE.getEFactory(GSelfOperatingHeuristicTextPackage.eNS_URI);
      if (theGSelfOperatingHeuristicTextFactory != null)
      {
        return theGSelfOperatingHeuristicTextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GSelfOperatingHeuristicTextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GSelfOperatingHeuristicTextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GSelfOperatingHeuristicTextPackage.MODEL: return createModel();
      case GSelfOperatingHeuristicTextPackage.GLOBAL: return createGlobal();
      case GSelfOperatingHeuristicTextPackage.LOCAL: return createLocal();
      case GSelfOperatingHeuristicTextPackage.STATE: return createState();
      case GSelfOperatingHeuristicTextPackage.ALTER: return createAlter();
      case GSelfOperatingHeuristicTextPackage.TRANSITION: return createTransition();
      case GSelfOperatingHeuristicTextPackage.EVENT: return createEvent();
      case GSelfOperatingHeuristicTextPackage.CONDITION: return createCondition();
      case GSelfOperatingHeuristicTextPackage.ASSIGNMENT: return createAssignment();
      case GSelfOperatingHeuristicTextPackage.VARIABLE_REFERENCE: return createVariableReference();
      case GSelfOperatingHeuristicTextPackage.VARIABLE: return createVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GSelfOperatingHeuristicTextPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      case GSelfOperatingHeuristicTextPackage.COMPARISON_OPERATOR:
        return createComparisonOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GSelfOperatingHeuristicTextPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      case GSelfOperatingHeuristicTextPackage.COMPARISON_OPERATOR:
        return convertComparisonOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Global createGlobal()
  {
    GlobalImpl global = new GlobalImpl();
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Local createLocal()
  {
    LocalImpl local = new LocalImpl();
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Alter createAlter()
  {
    AlterImpl alter = new AlterImpl();
    return alter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue)
  {
    ComparisonOperator result = ComparisonOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GSelfOperatingHeuristicTextPackage getGSelfOperatingHeuristicTextPackage()
  {
    return (GSelfOperatingHeuristicTextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GSelfOperatingHeuristicTextPackage getPackage()
  {
    return GSelfOperatingHeuristicTextPackage.eINSTANCE;
  }

} //GSelfOperatingHeuristicTextFactoryImpl
