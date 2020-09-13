/**
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.testSuite.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.mdh.dva501.testsuite.testSuite.Check;
import se.mdh.dva501.testsuite.testSuite.Force;
import se.mdh.dva501.testsuite.testSuite.ProductCheck;
import se.mdh.dva501.testsuite.testSuite.ProductException;
import se.mdh.dva501.testsuite.testSuite.ProductForce;
import se.mdh.dva501.testsuite.testSuite.ProductSet;
import se.mdh.dva501.testsuite.testSuite.ProductStep;
import se.mdh.dva501.testsuite.testSuite.ProductTestCase;
import se.mdh.dva501.testsuite.testSuite.ProductUnforce;
import se.mdh.dva501.testsuite.testSuite.ProductValueException;
import se.mdh.dva501.testsuite.testSuite.Set;
import se.mdh.dva501.testsuite.testSuite.Signal;
import se.mdh.dva501.testsuite.testSuite.Step;
import se.mdh.dva501.testsuite.testSuite.TestCase;
import se.mdh.dva501.testsuite.testSuite.TestSuite;
import se.mdh.dva501.testsuite.testSuite.TestSuiteFactory;
import se.mdh.dva501.testsuite.testSuite.TestSuitePackage;
import se.mdh.dva501.testsuite.testSuite.Timeout;
import se.mdh.dva501.testsuite.testSuite.Unforce;
import se.mdh.dva501.testsuite.testSuite.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestSuitePackageImpl extends EPackageImpl implements TestSuitePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testSuiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unforceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productValueExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productTestCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productForceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productUnforceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productCheckEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TestSuitePackageImpl()
  {
    super(eNS_URI, TestSuiteFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TestSuitePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TestSuitePackage init()
  {
    if (isInited) return (TestSuitePackage)EPackage.Registry.INSTANCE.getEPackage(TestSuitePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTestSuitePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TestSuitePackageImpl theTestSuitePackage = registeredTestSuitePackage instanceof TestSuitePackageImpl ? (TestSuitePackageImpl)registeredTestSuitePackage : new TestSuitePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTestSuitePackage.createPackageContents();

    // Initialize created meta-data
    theTestSuitePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTestSuitePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TestSuitePackage.eNS_URI, theTestSuitePackage);
    return theTestSuitePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTestSuite()
  {
    return testSuiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTestSuite_TestCases()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTestSuite_ProductTestCases()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTestCase()
  {
    return testCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTestCase_Name()
  {
    return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTestCase_GenericFunction()
  {
    return (EAttribute)testCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTestCase_ProductException()
  {
    return (EReference)testCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTestCase_Steps()
  {
    return (EReference)testCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductException()
  {
    return productExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductException_ProductName()
  {
    return (EAttribute)productExceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStep()
  {
    return stepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStep_GenericSignal()
  {
    return (EReference)stepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSet_Value()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSet_ProductValueExceptions()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getForce()
  {
    return forceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForce_Value()
  {
    return (EReference)forceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForce_ProductValueExceptions()
  {
    return (EReference)forceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnforce()
  {
    return unforceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCheck_Value()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCheck_ProductValueExceptions()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCheck_Timeout()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductValueException()
  {
    return productValueExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductValueException_ProductName()
  {
    return (EAttribute)productValueExceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductValueException_ProductValue()
  {
    return (EAttribute)productValueExceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSignal_Name()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getValue_Name()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTimeout()
  {
    return timeoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTimeout_Name()
  {
    return (EAttribute)timeoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductTestCase()
  {
    return productTestCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductTestCase_Name()
  {
    return (EAttribute)productTestCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductTestCase_ProductName()
  {
    return (EAttribute)productTestCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductTestCase_ProductSteps()
  {
    return (EReference)productTestCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductStep()
  {
    return productStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductStep_ProductSignal()
  {
    return (EReference)productStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProductStep_System()
  {
    return (EAttribute)productStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductSet()
  {
    return productSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductSet_Value()
  {
    return (EReference)productSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductForce()
  {
    return productForceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductForce_Value()
  {
    return (EReference)productForceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductUnforce()
  {
    return productUnforceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProductCheck()
  {
    return productCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductCheck_Value()
  {
    return (EReference)productCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProductCheck_Timeout()
  {
    return (EReference)productCheckEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSuiteFactory getTestSuiteFactory()
  {
    return (TestSuiteFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    testSuiteEClass = createEClass(TEST_SUITE);
    createEReference(testSuiteEClass, TEST_SUITE__TEST_CASES);
    createEReference(testSuiteEClass, TEST_SUITE__PRODUCT_TEST_CASES);

    testCaseEClass = createEClass(TEST_CASE);
    createEAttribute(testCaseEClass, TEST_CASE__NAME);
    createEAttribute(testCaseEClass, TEST_CASE__GENERIC_FUNCTION);
    createEReference(testCaseEClass, TEST_CASE__PRODUCT_EXCEPTION);
    createEReference(testCaseEClass, TEST_CASE__STEPS);

    productExceptionEClass = createEClass(PRODUCT_EXCEPTION);
    createEAttribute(productExceptionEClass, PRODUCT_EXCEPTION__PRODUCT_NAME);

    stepEClass = createEClass(STEP);
    createEReference(stepEClass, STEP__GENERIC_SIGNAL);

    setEClass = createEClass(SET);
    createEReference(setEClass, SET__VALUE);
    createEReference(setEClass, SET__PRODUCT_VALUE_EXCEPTIONS);

    forceEClass = createEClass(FORCE);
    createEReference(forceEClass, FORCE__VALUE);
    createEReference(forceEClass, FORCE__PRODUCT_VALUE_EXCEPTIONS);

    unforceEClass = createEClass(UNFORCE);

    checkEClass = createEClass(CHECK);
    createEReference(checkEClass, CHECK__VALUE);
    createEReference(checkEClass, CHECK__PRODUCT_VALUE_EXCEPTIONS);
    createEReference(checkEClass, CHECK__TIMEOUT);

    productValueExceptionEClass = createEClass(PRODUCT_VALUE_EXCEPTION);
    createEAttribute(productValueExceptionEClass, PRODUCT_VALUE_EXCEPTION__PRODUCT_NAME);
    createEAttribute(productValueExceptionEClass, PRODUCT_VALUE_EXCEPTION__PRODUCT_VALUE);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__NAME);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__NAME);

    timeoutEClass = createEClass(TIMEOUT);
    createEAttribute(timeoutEClass, TIMEOUT__NAME);

    productTestCaseEClass = createEClass(PRODUCT_TEST_CASE);
    createEAttribute(productTestCaseEClass, PRODUCT_TEST_CASE__NAME);
    createEAttribute(productTestCaseEClass, PRODUCT_TEST_CASE__PRODUCT_NAME);
    createEReference(productTestCaseEClass, PRODUCT_TEST_CASE__PRODUCT_STEPS);

    productStepEClass = createEClass(PRODUCT_STEP);
    createEReference(productStepEClass, PRODUCT_STEP__PRODUCT_SIGNAL);
    createEAttribute(productStepEClass, PRODUCT_STEP__SYSTEM);

    productSetEClass = createEClass(PRODUCT_SET);
    createEReference(productSetEClass, PRODUCT_SET__VALUE);

    productForceEClass = createEClass(PRODUCT_FORCE);
    createEReference(productForceEClass, PRODUCT_FORCE__VALUE);

    productUnforceEClass = createEClass(PRODUCT_UNFORCE);

    productCheckEClass = createEClass(PRODUCT_CHECK);
    createEReference(productCheckEClass, PRODUCT_CHECK__VALUE);
    createEReference(productCheckEClass, PRODUCT_CHECK__TIMEOUT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    setEClass.getESuperTypes().add(this.getStep());
    forceEClass.getESuperTypes().add(this.getStep());
    unforceEClass.getESuperTypes().add(this.getStep());
    checkEClass.getESuperTypes().add(this.getStep());
    productSetEClass.getESuperTypes().add(this.getProductStep());
    productForceEClass.getESuperTypes().add(this.getProductStep());
    productUnforceEClass.getESuperTypes().add(this.getProductStep());
    productCheckEClass.getESuperTypes().add(this.getProductStep());

    // Initialize classes and features; add operations and parameters
    initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestSuite_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSuite_ProductTestCases(), this.getProductTestCase(), null, "productTestCases", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestCase_GenericFunction(), ecorePackage.getEString(), "genericFunction", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_ProductException(), this.getProductException(), null, "productException", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_Steps(), this.getStep(), null, "steps", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productExceptionEClass, ProductException.class, "ProductException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductException_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, ProductException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStep_GenericSignal(), this.getSignal(), null, "genericSignal", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSet_Value(), this.getValue(), null, "value", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSet_ProductValueExceptions(), this.getProductValueException(), null, "productValueExceptions", null, 0, -1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forceEClass, Force.class, "Force", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForce_Value(), this.getValue(), null, "value", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForce_ProductValueExceptions(), this.getProductValueException(), null, "productValueExceptions", null, 0, -1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unforceEClass, Unforce.class, "Unforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheck_Value(), this.getValue(), null, "value", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheck_ProductValueExceptions(), this.getProductValueException(), null, "productValueExceptions", null, 0, -1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheck_Timeout(), this.getTimeout(), null, "timeout", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productValueExceptionEClass, ProductValueException.class, "ProductValueException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductValueException_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, ProductValueException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProductValueException_ProductValue(), ecorePackage.getEString(), "productValue", null, 0, 1, ProductValueException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeout_Name(), ecorePackage.getEInt(), "name", null, 0, 1, Timeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productTestCaseEClass, ProductTestCase.class, "ProductTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductTestCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProductTestCase_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, ProductTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductTestCase_ProductSteps(), this.getProductStep(), null, "productSteps", null, 0, -1, ProductTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productStepEClass, ProductStep.class, "ProductStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductStep_ProductSignal(), this.getSignal(), null, "productSignal", null, 0, 1, ProductStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProductStep_System(), ecorePackage.getEString(), "system", null, 0, 1, ProductStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productSetEClass, ProductSet.class, "ProductSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductSet_Value(), this.getValue(), null, "value", null, 0, 1, ProductSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productForceEClass, ProductForce.class, "ProductForce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductForce_Value(), this.getValue(), null, "value", null, 0, 1, ProductForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productUnforceEClass, ProductUnforce.class, "ProductUnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(productCheckEClass, ProductCheck.class, "ProductCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductCheck_Value(), this.getValue(), null, "value", null, 0, 1, ProductCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductCheck_Timeout(), this.getTimeout(), null, "timeout", null, 0, 1, ProductCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TestSuitePackageImpl
