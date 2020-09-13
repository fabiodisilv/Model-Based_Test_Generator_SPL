/**
 */
package generic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generic.GenericFunction#getName <em>Name</em>}</li>
 *   <li>{@link generic.GenericFunction#getDescription <em>Description</em>}</li>
 *   <li>{@link generic.GenericFunction#getGenericSteps <em>Generic Steps</em>}</li>
 * </ul>
 *
 * @see generic.GenericPackage#getGenericFunction()
 * @model
 * @generated
 */
public interface GenericFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generic.GenericPackage#getGenericFunction_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generic.GenericFunction#getName <em>Name</em>}' attribute.
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
	 * @see generic.GenericPackage#getGenericFunction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link generic.GenericFunction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generic Steps</b></em>' containment reference list.
	 * The list contents are of type {@link generic.GenericStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Steps</em>' containment reference list.
	 * @see generic.GenericPackage#getGenericFunction_GenericSteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GenericStep> getGenericSteps();

} // GenericFunction
