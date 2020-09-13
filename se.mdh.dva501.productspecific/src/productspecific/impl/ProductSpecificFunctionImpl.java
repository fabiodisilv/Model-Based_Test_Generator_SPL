/**
 */
package productspecific.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import productspecific.Product;
import productspecific.ProductSpecificFunction;
import productspecific.ProductSpecificStep;
import productspecific.ProductspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Specific Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link productspecific.impl.ProductSpecificFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.impl.ProductSpecificFunctionImpl#getProductSpecificSteps <em>Product Specific Steps</em>}</li>
 *   <li>{@link productspecific.impl.ProductSpecificFunctionImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpecificFunctionImpl extends MinimalEObjectImpl.Container implements ProductSpecificFunction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductSpecificSteps() <em>Product Specific Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificStep> productSpecificSteps;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> projects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpecificFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductspecificPackage.Literals.PRODUCT_SPECIFIC_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificStep> getProductSpecificSteps() {
		if (productSpecificSteps == null) {
			productSpecificSteps = new EObjectResolvingEList<ProductSpecificStep>(ProductSpecificStep.class, this, ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS);
		}
		return productSpecificSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<Product>(Product.class, this, ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__NAME:
				return getName();
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS:
				return getProductSpecificSteps();
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PROJECTS:
				return getProjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS:
				getProductSpecificSteps().clear();
				getProductSpecificSteps().addAll((Collection<? extends ProductSpecificStep>)newValue);
				return;
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Product>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS:
				getProductSpecificSteps().clear();
				return;
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PROJECTS:
				getProjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS:
				return productSpecificSteps != null && !productSpecificSteps.isEmpty();
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION__PROJECTS:
				return projects != null && !projects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductSpecificFunctionImpl
