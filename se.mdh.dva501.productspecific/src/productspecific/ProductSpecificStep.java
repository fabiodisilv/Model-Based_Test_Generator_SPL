/**
 */
package productspecific;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Specific Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productspecific.ProductSpecificStep#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.ProductSpecificStep#getSignal <em>Signal</em>}</li>
 *   <li>{@link productspecific.ProductSpecificStep#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see productspecific.ProductspecificPackage#getProductSpecificStep()
 * @model abstract="true"
 * @generated
 */
public interface ProductSpecificStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see productspecific.ProductspecificPackage#getProductSpecificStep_Name()
	 * @model required="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link productspecific.ProductSpecificStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see productspecific.ProductspecificPackage#getProductSpecificStep_Signal()
	 * @model
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link productspecific.ProductSpecificStep#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(productspecific.System)
	 * @see productspecific.ProductspecificPackage#getProductSpecificStep_System()
	 * @model
	 * @generated
	 */
	productspecific.System getSystem();

	/**
	 * Sets the value of the '{@link productspecific.ProductSpecificStep#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(productspecific.System value);

} // ProductSpecificStep
