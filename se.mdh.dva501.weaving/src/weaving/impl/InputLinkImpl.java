/**
 */
package weaving.impl;

import generic.GenericInput;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import productspecific.ProductSpecificInput;

import weaving.InputLink;
import weaving.WeavingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link weaving.impl.InputLinkImpl#getGenericInput <em>Generic Input</em>}</li>
 *   <li>{@link weaving.impl.InputLinkImpl#getProductSpecificInputs <em>Product Specific Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputLinkImpl extends MinimalEObjectImpl.Container implements InputLink {
	/**
	 * The cached value of the '{@link #getGenericInput() <em>Generic Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericInput()
	 * @generated
	 * @ordered
	 */
	protected GenericInput genericInput;

	/**
	 * The cached value of the '{@link #getProductSpecificInputs() <em>Product Specific Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificInput> productSpecificInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeavingPackage.Literals.INPUT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericInput getGenericInput() {
		if (genericInput != null && genericInput.eIsProxy()) {
			InternalEObject oldGenericInput = (InternalEObject)genericInput;
			genericInput = (GenericInput)eResolveProxy(oldGenericInput);
			if (genericInput != oldGenericInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeavingPackage.INPUT_LINK__GENERIC_INPUT, oldGenericInput, genericInput));
			}
		}
		return genericInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericInput basicGetGenericInput() {
		return genericInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericInput(GenericInput newGenericInput) {
		GenericInput oldGenericInput = genericInput;
		genericInput = newGenericInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeavingPackage.INPUT_LINK__GENERIC_INPUT, oldGenericInput, genericInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificInput> getProductSpecificInputs() {
		if (productSpecificInputs == null) {
			productSpecificInputs = new EObjectResolvingEList<ProductSpecificInput>(ProductSpecificInput.class, this, WeavingPackage.INPUT_LINK__PRODUCT_SPECIFIC_INPUTS);
		}
		return productSpecificInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeavingPackage.INPUT_LINK__GENERIC_INPUT:
				if (resolve) return getGenericInput();
				return basicGetGenericInput();
			case WeavingPackage.INPUT_LINK__PRODUCT_SPECIFIC_INPUTS:
				return getProductSpecificInputs();
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
			case WeavingPackage.INPUT_LINK__GENERIC_INPUT:
				setGenericInput((GenericInput)newValue);
				return;
			case WeavingPackage.INPUT_LINK__PRODUCT_SPECIFIC_INPUTS:
				getProductSpecificInputs().clear();
				getProductSpecificInputs().addAll((Collection<? extends ProductSpecificInput>)newValue);
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
			case WeavingPackage.INPUT_LINK__GENERIC_INPUT:
				setGenericInput((GenericInput)null);
				return;
			case WeavingPackage.INPUT_LINK__PRODUCT_SPECIFIC_INPUTS:
				getProductSpecificInputs().clear();
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
			case WeavingPackage.INPUT_LINK__GENERIC_INPUT:
				return genericInput != null;
			case WeavingPackage.INPUT_LINK__PRODUCT_SPECIFIC_INPUTS:
				return productSpecificInputs != null && !productSpecificInputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputLinkImpl
