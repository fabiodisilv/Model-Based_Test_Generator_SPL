/**
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.testSuite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.mdh.dva501.testsuite.testSuite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestSuiteFactoryImpl extends EFactoryImpl implements TestSuiteFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TestSuiteFactory init()
  {
    try
    {
      TestSuiteFactory theTestSuiteFactory = (TestSuiteFactory)EPackage.Registry.INSTANCE.getEFactory(TestSuitePackage.eNS_URI);
      if (theTestSuiteFactory != null)
      {
        return theTestSuiteFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TestSuiteFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSuiteFactoryImpl()
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
      case TestSuitePackage.TEST_SUITE: return createTestSuite();
      case TestSuitePackage.TEST_CASE: return createTestCase();
      case TestSuitePackage.PRODUCT_EXCEPTION: return createProductException();
      case TestSuitePackage.STEP: return createStep();
      case TestSuitePackage.SET: return createSet();
      case TestSuitePackage.FORCE: return createForce();
      case TestSuitePackage.UNFORCE: return createUnforce();
      case TestSuitePackage.CHECK: return createCheck();
      case TestSuitePackage.PRODUCT_VALUE_EXCEPTION: return createProductValueException();
      case TestSuitePackage.SIGNAL: return createSignal();
      case TestSuitePackage.VALUE: return createValue();
      case TestSuitePackage.TIMEOUT: return createTimeout();
      case TestSuitePackage.PRODUCT_TEST_CASE: return createProductTestCase();
      case TestSuitePackage.PRODUCT_STEP: return createProductStep();
      case TestSuitePackage.PRODUCT_SET: return createProductSet();
      case TestSuitePackage.PRODUCT_FORCE: return createProductForce();
      case TestSuitePackage.PRODUCT_UNFORCE: return createProductUnforce();
      case TestSuitePackage.PRODUCT_CHECK: return createProductCheck();
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
  public TestSuite createTestSuite()
  {
    TestSuiteImpl testSuite = new TestSuiteImpl();
    return testSuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestCase createTestCase()
  {
    TestCaseImpl testCase = new TestCaseImpl();
    return testCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductException createProductException()
  {
    ProductExceptionImpl productException = new ProductExceptionImpl();
    return productException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Force createForce()
  {
    ForceImpl force = new ForceImpl();
    return force;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unforce createUnforce()
  {
    UnforceImpl unforce = new UnforceImpl();
    return unforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductValueException createProductValueException()
  {
    ProductValueExceptionImpl productValueException = new ProductValueExceptionImpl();
    return productValueException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Timeout createTimeout()
  {
    TimeoutImpl timeout = new TimeoutImpl();
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductTestCase createProductTestCase()
  {
    ProductTestCaseImpl productTestCase = new ProductTestCaseImpl();
    return productTestCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductStep createProductStep()
  {
    ProductStepImpl productStep = new ProductStepImpl();
    return productStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductSet createProductSet()
  {
    ProductSetImpl productSet = new ProductSetImpl();
    return productSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductForce createProductForce()
  {
    ProductForceImpl productForce = new ProductForceImpl();
    return productForce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductUnforce createProductUnforce()
  {
    ProductUnforceImpl productUnforce = new ProductUnforceImpl();
    return productUnforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProductCheck createProductCheck()
  {
    ProductCheckImpl productCheck = new ProductCheckImpl();
    return productCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSuitePackage getTestSuitePackage()
  {
    return (TestSuitePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TestSuitePackage getPackage()
  {
    return TestSuitePackage.eINSTANCE;
  }

} //TestSuiteFactoryImpl