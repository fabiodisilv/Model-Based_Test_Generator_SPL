/**
 */
package weaving;

import generic.GenericInput;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import productspecific.ProductSpecificInput;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link weaving.InputLink#getGenericInput <em>Generic Input</em>}</li>
 *   <li>{@link weaving.InputLink#getProductSpecificInputs <em>Product Specific Inputs</em>}</li>
 * </ul>
 *
 * @see weaving.WeavingPackage#getInputLink()
 * @model
 * @generated
 */
public interface InputLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Input</em>' reference.
	 * @see #setGenericInput(GenericInput)
	 * @see weaving.WeavingPackage#getInputLink_GenericInput()
	 * @model required="true"
	 * @generated
	 */
	GenericInput getGenericInput();

	/**
	 * Sets the value of the '{@link weaving.InputLink#getGenericInput <em>Generic Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Input</em>' reference.
	 * @see #getGenericInput()
	 * @generated
	 */
	void setGenericInput(GenericInput value);

	/**
	 * Returns the value of the '<em><b>Product Specific Inputs</b></em>' reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Inputs</em>' reference list.
	 * @see weaving.WeavingPackage#getInputLink_ProductSpecificInputs()
	 * @model required="true"
	 * @generated
	 */
	EList<ProductSpecificInput> getProductSpecificInputs();

} // InputLink
