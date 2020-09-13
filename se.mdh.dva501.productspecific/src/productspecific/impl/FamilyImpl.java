/**
 */
package productspecific.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import productspecific.Family;
import productspecific.Product;
import productspecific.ProductSpecificFunction;
import productspecific.ProductSpecificStep;
import productspecific.ProductspecificPackage;
import productspecific.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link productspecific.impl.FamilyImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getProductSpecificFunctions <em>Product Specific Functions</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getProductSpecificSteps <em>Product Specific Steps</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getName <em>Name</em>}</li>
 *   <li>{@link productspecific.impl.FamilyImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyImpl extends MinimalEObjectImpl.Container implements Family {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getProductSpecificFunctions() <em>Product Specific Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificFunction> productSpecificFunctions;

	/**
	 * The cached value of the '{@link #getProductSpecificSteps() <em>Product Specific Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificStep> productSpecificSteps;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<productspecific.System> systems;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductspecificPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, ProductspecificPackage.FAMILY__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificFunction> getProductSpecificFunctions() {
		if (productSpecificFunctions == null) {
			productSpecificFunctions = new EObjectContainmentEList<ProductSpecificFunction>(ProductSpecificFunction.class, this, ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS);
		}
		return productSpecificFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificStep> getProductSpecificSteps() {
		if (productSpecificSteps == null) {
			productSpecificSteps = new EObjectContainmentEList<ProductSpecificStep>(ProductSpecificStep.class, this, ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS);
		}
		return productSpecificSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, ProductspecificPackage.FAMILY__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<productspecific.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<productspecific.System>(productspecific.System.class, this, ProductspecificPackage.FAMILY__SYSTEMS);
		}
		return systems;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductspecificPackage.FAMILY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductspecificPackage.FAMILY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductspecificPackage.FAMILY__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS:
				return ((InternalEList<?>)getProductSpecificFunctions()).basicRemove(otherEnd, msgs);
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS:
				return ((InternalEList<?>)getProductSpecificSteps()).basicRemove(otherEnd, msgs);
			case ProductspecificPackage.FAMILY__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case ProductspecificPackage.FAMILY__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductspecificPackage.FAMILY__PRODUCTS:
				return getProducts();
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS:
				return getProductSpecificFunctions();
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS:
				return getProductSpecificSteps();
			case ProductspecificPackage.FAMILY__SIGNALS:
				return getSignals();
			case ProductspecificPackage.FAMILY__SYSTEMS:
				return getSystems();
			case ProductspecificPackage.FAMILY__NAME:
				return getName();
			case ProductspecificPackage.FAMILY__DESCRIPTION:
				return getDescription();
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
			case ProductspecificPackage.FAMILY__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS:
				getProductSpecificFunctions().clear();
				getProductSpecificFunctions().addAll((Collection<? extends ProductSpecificFunction>)newValue);
				return;
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS:
				getProductSpecificSteps().clear();
				getProductSpecificSteps().addAll((Collection<? extends ProductSpecificStep>)newValue);
				return;
			case ProductspecificPackage.FAMILY__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case ProductspecificPackage.FAMILY__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends productspecific.System>)newValue);
				return;
			case ProductspecificPackage.FAMILY__NAME:
				setName((String)newValue);
				return;
			case ProductspecificPackage.FAMILY__DESCRIPTION:
				setDescription((String)newValue);
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
			case ProductspecificPackage.FAMILY__PRODUCTS:
				getProducts().clear();
				return;
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS:
				getProductSpecificFunctions().clear();
				return;
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS:
				getProductSpecificSteps().clear();
				return;
			case ProductspecificPackage.FAMILY__SIGNALS:
				getSignals().clear();
				return;
			case ProductspecificPackage.FAMILY__SYSTEMS:
				getSystems().clear();
				return;
			case ProductspecificPackage.FAMILY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductspecificPackage.FAMILY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ProductspecificPackage.FAMILY__PRODUCTS:
				return products != null && !products.isEmpty();
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_FUNCTIONS:
				return productSpecificFunctions != null && !productSpecificFunctions.isEmpty();
			case ProductspecificPackage.FAMILY__PRODUCT_SPECIFIC_STEPS:
				return productSpecificSteps != null && !productSpecificSteps.isEmpty();
			case ProductspecificPackage.FAMILY__SIGNALS:
				return signals != null && !signals.isEmpty();
			case ProductspecificPackage.FAMILY__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case ProductspecificPackage.FAMILY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductspecificPackage.FAMILY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FamilyImpl
