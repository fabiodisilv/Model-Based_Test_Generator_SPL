/**
 */
package weaving;

import generic.GenericFunction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import productspecific.ProductSpecificFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link weaving.FunctionLink#getGenericFunction <em>Generic Function</em>}</li>
 *   <li>{@link weaving.FunctionLink#getProductSpecificFunctions <em>Product Specific Functions</em>}</li>
 *   <li>{@link weaving.FunctionLink#getInputLinks <em>Input Links</em>}</li>
 *   <li>{@link weaving.FunctionLink#getOutputLinks <em>Output Links</em>}</li>
 * </ul>
 *
 * @see weaving.WeavingPackage#getFunctionLink()
 * @model
 * @generated
 */
public interface FunctionLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Function</em>' reference.
	 * @see #setGenericFunction(GenericFunction)
	 * @see weaving.WeavingPackage#getFunctionLink_GenericFunction()
	 * @model required="true"
	 * @generated
	 */
	GenericFunction getGenericFunction();

	/**
	 * Sets the value of the '{@link weaving.FunctionLink#getGenericFunction <em>Generic Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Function</em>' reference.
	 * @see #getGenericFunction()
	 * @generated
	 */
	void setGenericFunction(GenericFunction value);

	/**
	 * Returns the value of the '<em><b>Product Specific Functions</b></em>' reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Functions</em>' reference list.
	 * @see weaving.WeavingPackage#getFunctionLink_ProductSpecificFunctions()
	 * @model required="true"
	 * @generated
	 */
	EList<ProductSpecificFunction> getProductSpecificFunctions();

	/**
	 * Returns the value of the '<em><b>Input Links</b></em>' containment reference list.
	 * The list contents are of type {@link weaving.InputLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Links</em>' containment reference list.
	 * @see weaving.WeavingPackage#getFunctionLink_InputLinks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputLink> getInputLinks();

	/**
	 * Returns the value of the '<em><b>Output Links</b></em>' containment reference list.
	 * The list contents are of type {@link weaving.OutputLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Links</em>' containment reference list.
	 * @see weaving.WeavingPackage#getFunctionLink_OutputLinks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputLink> getOutputLinks();

} // FunctionLink
