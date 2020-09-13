/**
 */
package productspecific;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productspecific.Family#getProducts <em>Products</em>}</li>
 *   <li>{@link productspecific.Family#getProductSpecificFunctions <em>Product Specific Functions</em>}</li>
 *   <li>{@link productspecific.Family#getProductSpecificSteps <em>Product Specific Steps</em>}</li>
 *   <li>{@link productspecific.Family#getSignals <em>Signals</em>}</li>
 *   <li>{@link productspecific.Family#getSystems <em>Systems</em>}</li>
 *   <li>{@link productspecific.Family#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.Family#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see productspecific.ProductspecificPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link productspecific.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see productspecific.ProductspecificPackage#getFamily_Products()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Product Specific Functions</b></em>' containment reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Functions</em>' containment reference list.
	 * @see productspecific.ProductspecificPackage#getFamily_ProductSpecificFunctions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProductSpecificFunction> getProductSpecificFunctions();

	/**
	 * Returns the value of the '<em><b>Product Specific Steps</b></em>' containment reference list.
	 * The list contents are of type {@link productspecific.ProductSpecificStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specific Steps</em>' containment reference list.
	 * @see productspecific.ProductspecificPackage#getFamily_ProductSpecificSteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProductSpecificStep> getProductSpecificSteps();

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link productspecific.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see productspecific.ProductspecificPackage#getFamily_Signals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link productspecific.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see productspecific.ProductspecificPackage#getFamily_Systems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<productspecific.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see productspecific.ProductspecificPackage#getFamily_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link productspecific.Family#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see productspecific.ProductspecificPackage#getFamily_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link productspecific.Family#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Family
