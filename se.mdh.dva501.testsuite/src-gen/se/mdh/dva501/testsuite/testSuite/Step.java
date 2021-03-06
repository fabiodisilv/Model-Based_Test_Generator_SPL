/**
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.testSuite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.dva501.testsuite.testSuite.Step#getGenericSignal <em>Generic Signal</em>}</li>
 * </ul>
 *
 * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic Signal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Signal</em>' containment reference.
   * @see #setGenericSignal(Signal)
   * @see se.mdh.dva501.testsuite.testSuite.TestSuitePackage#getStep_GenericSignal()
   * @model containment="true"
   * @generated
   */
  Signal getGenericSignal();

  /**
   * Sets the value of the '{@link se.mdh.dva501.testsuite.testSuite.Step#getGenericSignal <em>Generic Signal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Signal</em>' containment reference.
   * @see #getGenericSignal()
   * @generated
   */
  void setGenericSignal(Signal value);

} // Step
