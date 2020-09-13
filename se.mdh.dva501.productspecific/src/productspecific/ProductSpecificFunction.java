/**
 */
package productspecific;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Specific Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productspecific.ProductSpecificFunction#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.ProductSpecificFunction#getProductSpecificSteps <em>Product Specific Steps</em>}</li>
 *   <li>{@link productspecific.ProductSpecificFunction#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see productspecific.ProductspecificPackage#getProductSpecificFunction()
 * @model
 * @generated
 */
public interface ProductSpecificFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see productspecific.ProductspecificPackage#getProductSpecificFunction_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link productspecific.ProductSpecificFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product Specific Steps</b></em>' reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Steps</em>' reference list.
	 * @see productspecific.ProductspecificPackage#getProductSpecificFunction_ProductSpecificSteps()
	 * @model required="true"
	 * @generated
	 */
	EList<ProductSpecificStep> getProductSpecificSteps();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link productspecific.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see productspecific.ProductspecificPackage#getProductSpecificFunction_Projects()
	 * @model required="true"
	 * @generated
	 */
	EList<Product> getProjects();

} // ProductSpecificFunction
