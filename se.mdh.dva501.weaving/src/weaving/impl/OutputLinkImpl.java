/**
 */
package weaving.impl;

import generic.GenericOutput;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import productspecific.ProductSpecificOutput;

import weaving.OutputLink;
import weaving.WeavingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link weaving.impl.OutputLinkImpl#getGenericOutput <em>Generic Output</em>}</li>
 *   <li>{@link weaving.impl.OutputLinkImpl#getProductSpecificOutputs <em>Product Specific Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputLinkImpl extends MinimalEObjectImpl.Container implements OutputLink {
	/**
	 * The cached value of the '{@link #getGenericOutput() <em>Generic Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericOutput()
	 * @generated
	 * @ordered
	 */
	protected GenericOutput genericOutput;

	/**
	 * The cached value of the '{@link #getProductSpecificOutputs() <em>Product Specific Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecificOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecificOutput> productSpecificOutputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeavingPackage.Literals.OUTPUT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericOutput getGenericOutput() {
		if (genericOutput != null && genericOutput.eIsProxy()) {
			InternalEObject oldGenericOutput = (InternalEObject)genericOutput;
			genericOutput = (GenericOutput)eResolveProxy(oldGenericOutput);
			if (genericOutput != oldGenericOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT, oldGenericOutput, genericOutput));
			}
		}
		return genericOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericOutput basicGetGenericOutput() {
		return genericOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericOutput(GenericOutput newGenericOutput) {
		GenericOutput oldGenericOutput = genericOutput;
		genericOutput = newGenericOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT, oldGenericOutput, genericOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecificOutput> getProductSpecificOutputs() {
		if (productSpecificOutputs == null) {
			productSpecificOutputs = new EObjectResolvingEList<ProductSpecificOutput>(ProductSpecificOutput.class, this, WeavingPackage.OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS);
		}
		return productSpecificOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT:
				if (resolve) return getGenericOutput();
				return basicGetGenericOutput();
			case WeavingPackage.OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS:
				return getProductSpecificOutputs();
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
			case WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT:
				setGenericOutput((GenericOutput)newValue);
				return;
			case WeavingPackage.OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS:
				getProductSpecificOutputs().clear();
				getProductSpecificOutputs().addAll((Collection<? extends ProductSpecificOutput>)newValue);
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
			case WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT:
				setGenericOutput((GenericOutput)null);
				return;
			case WeavingPackage.OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS:
				getProductSpecificOutputs().clear();
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
			case WeavingPackage.OUTPUT_LINK__GENERIC_OUTPUT:
				return genericOutput != null;
			case WeavingPackage.OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS:
				return productSpecificOutputs != null && !productSpecificOutputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputLinkImpl
