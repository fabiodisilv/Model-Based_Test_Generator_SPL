/**
 */
package weaving;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaving</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link weaving.Weaving#getName <em>Name</em>}</li>
 *   <li>{@link weaving.Weaving#getDescription <em>Description</em>}</li>
 *   <li>{@link weaving.Weaving#getFunctionLinks <em>Function Links</em>}</li>
 * </ul>
 *
 * @see weaving.WeavingPackage#getWeaving()
 * @model
 * @generated
 */
public interface Weaving extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see weaving.WeavingPackage#getWeaving_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link weaving.Weaving#getName <em>Name</em>}' attribute.
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
	 * @see weaving.WeavingPackage#getWeaving_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link weaving.Weaving#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Function Links</b></em>' containment reference list.
	 * The list contents are of type {@link weaving.FunctionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Links</em>' containment reference list.
	 * @see weaving.WeavingPackage#getWeaving_FunctionLinks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FunctionLink> getFunctionLinks();

} // Weaving
