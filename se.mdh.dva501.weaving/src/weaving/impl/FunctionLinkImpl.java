/**
 */
package weaving.impl;

import generic.GenericFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import productspecific.ProductSpecificFunction;

import weaving.FunctionLink;
import weaving.InputLink;
import weaving.OutputLink;
import weaving.WeavingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link weaving.impl.FunctionLinkImpl#getGenericFunction <em>Generic Function</em>}</li>
 *   <li>{@link weaving.impl.FunctionLinkImpl#getProductSpecificFunctions <em>Product Specific Functions</em>}</li>
 *   <li>{@link weaving.impl.FunctionLinkImpl#getInputLinks <em>Input Links</em>}</li>
 *   <li>{@link weaving.impl.FunctionLinkImpl#getOutputLinks <em>Output Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionLinkImpl extends MinimalEObjectImpl.Container implements FunctionLink {
	/**
	 * The cached value of the '{@link #getGenericFunction() <em>Generic Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericFunction()
	 * @generated
	 * @ordered
	 */
	protected GenericFunction genericFunction;

	/**
	 * The cached value of the '{@link #getProductSpecificFunctions() <em>Product Specific Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificFunction> productSpecificFunctions;

	/**
	 * The cached value of the '{@link #getInputLinks() <em>Input Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InputLink> inputLinks;

	/**
	 * The cached value of the '{@link #getOutputLinks() <em>Output Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputLink> outputLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeavingPackage.Literals.FUNCTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericFunction getGenericFunction() {
		if (genericFunction != null && genericFunction.eIsProxy()) {
			InternalEObject oldGenericFunction = (InternalEObject)genericFunction;
			genericFunction = (GenericFunction)eResolveProxy(oldGenericFunction);
			if (genericFunction != oldGenericFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION, oldGenericFunction, genericFunction));
			}
		}
		return genericFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericFunction basicGetGenericFunction() {
		return genericFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericFunction(GenericFunction newGenericFunction) {
		GenericFunction oldGenericFunction = genericFunction;
		genericFunction = newGenericFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION, oldGenericFunction, genericFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificFunction> getProductSpecificFunctions() {
		if (productSpecificFunctions == null) {
			productSpecificFunctions = new EObjectResolvingEList<ProductSpecificFunction>(ProductSpecificFunction.class, this, WeavingPackage.FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS);
		}
		return productSpecificFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputLink> getInputLinks() {
		if (inputLinks == null) {
			inputLinks = new EObjectContainmentEList<InputLink>(InputLink.class, this, WeavingPackage.FUNCTION_LINK__INPUT_LINKS);
		}
		return inputLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputLink> getOutputLinks() {
		if (outputLinks == null) {
			outputLinks = new EObjectContainmentEList<OutputLink>(OutputLink.class, this, WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS);
		}
		return outputLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WeavingPackage.FUNCTION_LINK__INPUT_LINKS:
				return ((InternalEList<?>)getInputLinks()).basicRemove(otherEnd, msgs);
			case WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS:
				return ((InternalEList<?>)getOutputLinks()).basicRemove(otherEnd, msgs);
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
			case WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION:
				if (resolve) return getGenericFunction();
				return basicGetGenericFunction();
			case WeavingPackage.FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS:
				return getProductSpecificFunctions();
			case WeavingPackage.FUNCTION_LINK__INPUT_LINKS:
				return getInputLinks();
			case WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS:
				return getOutputLinks();
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
			case WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION:
				setGenericFunction((GenericFunction)newValue);
				return;
			case WeavingPackage.FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS:
				getProductSpecificFunctions().clear();
				getProductSpecificFunctions().addAll((Collection<? extends ProductSpecificFunction>)newValue);
				return;
			case WeavingPackage.FUNCTION_LINK__INPUT_LINKS:
				getInputLinks().clear();
				getInputLinks().addAll((Collection<? extends InputLink>)newValue);
				return;
			case WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS:
				getOutputLinks().clear();
				getOutputLinks().addAll((Collection<? extends OutputLink>)newValue);
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
			case WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION:
				setGenericFunction((GenericFunction)null);
				return;
			case WeavingPackage.FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS:
				getProductSpecificFunctions().clear();
				return;
			case WeavingPackage.FUNCTION_LINK__INPUT_LINKS:
				getInputLinks().clear();
				return;
			case WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS:
				getOutputLinks().clear();
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
			case WeavingPackage.FUNCTION_LINK__GENERIC_FUNCTION:
				return genericFunction != null;
			case WeavingPackage.FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS:
				return productSpecificFunctions != null && !productSpecificFunctions.isEmpty();
			case WeavingPackage.FUNCTION_LINK__INPUT_LINKS:
				return inputLinks != null && !inputLinks.isEmpty();
			case WeavingPackage.FUNCTION_LINK__OUTPUT_LINKS:
				return outputLinks != null && !outputLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionLinkImpl
