/**
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.testSuite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.dva501.testsuite.testSuite.ProductSet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage#getProductSet()
 * @model
 * @generated
 */
public interface ProductSet extends ProductStep
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage#getProductSet_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link se.mdh.dva501.testsuite.testSuite.ProductSet#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // ProductSet
