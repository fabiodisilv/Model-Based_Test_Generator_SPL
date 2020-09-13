/**
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.testSuite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage
 * @generated
 */
public interface TestSuiteFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestSuiteFactory eINSTANCE = se.mdh.dva501.testsuite.testSuite.impl.TestSuiteFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Test Suite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Suite</em>'.
   * @generated
   */
  TestSuite createTestSuite();

  /**
   * Returns a new object of class '<em>Test Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Case</em>'.
   * @generated
   */
  TestCase createTestCase();

  /**
   * Returns a new object of class '<em>Product Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Exception</em>'.
   * @generated
   */
  ProductException createProductException();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns a new object of class '<em>Force</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Force</em>'.
   * @generated
   */
  Force createForce();

  /**
   * Returns a new object of class '<em>Unforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unforce</em>'.
   * @generated
   */
  Unforce createUnforce();

  /**
   * Returns a new object of class '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check</em>'.
   * @generated
   */
  Check createCheck();

  /**
   * Returns a new object of class '<em>Product Value Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Value Exception</em>'.
   * @generated
   */
  ProductValueException createProductValueException();

  /**
   * Returns a new object of class '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal</em>'.
   * @generated
   */
  Signal createSignal();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Timeout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timeout</em>'.
   * @generated
   */
  Timeout createTimeout();

  /**
   * Returns a new object of class '<em>Product Test Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Test Case</em>'.
   * @generated
   */
  ProductTestCase createProductTestCase();

  /**
   * Returns a new object of class '<em>Product Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Step</em>'.
   * @generated
   */
  ProductStep createProductStep();

  /**
   * Returns a new object of class '<em>Product Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Set</em>'.
   * @generated
   */
  ProductSet createProductSet();

  /**
   * Returns a new object of class '<em>Product Force</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Force</em>'.
   * @generated
   */
  ProductForce createProductForce();

  /**
   * Returns a new object of class '<em>Product Unforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Unforce</em>'.
   * @generated
   */
  ProductUnforce createProductUnforce();

  /**
   * Returns a new object of class '<em>Product Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Check</em>'.
   * @generated
   */
  ProductCheck createProductCheck();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TestSuitePackage getTestSuitePackage();

} //TestSuiteFactory
