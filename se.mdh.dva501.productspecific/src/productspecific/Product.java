/**
 */
package productspecific;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productspecific.Product#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.Product#getProductSpecificFunctions <em>Product Specific Functions</em>}</li>
 * </ul>
 *
 * @see productspecific.ProductspecificPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see productspecific.ProductspecificPackage#getProduct_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link productspecific.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product Specific Functions</b></em>' reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Functions</em>' reference list.
	 * @see productspecific.ProductspecificPackage#getProduct_ProductSpecificFunctions()
	 * @model required="true"
	 * @generated
	 */
	EList<ProductSpecificFunction> getProductSpecificFunctions();

} // Product
