/**
 */
package weaving;

import generic.GenericOutput;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import productspecific.ProductSpecificOutput;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link weaving.OutputLink#getGenericOutput <em>Generic Output</em>}</li>
 *   <li>{@link weaving.OutputLink#getProductSpecificOutputs <em>Product Specific Outputs</em>}</li>
 * </ul>
 *
 * @see weaving.WeavingPackage#getOutputLink()
 * @model
 * @generated
 */
public interface OutputLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Output</em>' reference.
	 * @see #setGenericOutput(GenericOutput)
	 * @see weaving.WeavingPackage#getOutputLink_GenericOutput()
	 * @model required="true"
	 * @generated
	 */
	GenericOutput getGenericOutput();

	/**
	 * Sets the value of the '{@link weaving.OutputLink#getGenericOutput <em>Generic Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Output</em>' reference.
	 * @see #getGenericOutput()
	 * @generated
	 */
	void setGenericOutput(GenericOutput value);

	/**
	 * Returns the value of the '<em><b>Product Specific Outputs</b></em>' reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Outputs</em>' reference list.
	 * @see weaving.WeavingPackage#getOutputLink_ProductSpecificOutputs()
	 * @model required="true"
	 * @generated
	 */
	EList<ProductSpecificOutput> getProductSpecificOutputs();

} // OutputLink
