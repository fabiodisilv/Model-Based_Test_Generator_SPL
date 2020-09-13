/**
 */
package weaving;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see weaving.WeavingPackage
 * @generated
 */
public interface WeavingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WeavingFactory eINSTANCE = weaving.impl.WeavingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Weaving</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weaving</em>'.
	 * @generated
	 */
	Weaving createWeaving();

	/**
	 * Returns a new object of class '<em>Function Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Link</em>'.
	 * @generated
	 */
	FunctionLink createFunctionLink();

	/**
	 * Returns a new object of class '<em>Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Link</em>'.
	 * @generated
	 */
	InputLink createInputLink();

	/**
	 * Returns a new object of class '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Link</em>'.
	 * @generated
	 */
	OutputLink createOutputLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WeavingPackage getWeavingPackage();

} //WeavingFactory
