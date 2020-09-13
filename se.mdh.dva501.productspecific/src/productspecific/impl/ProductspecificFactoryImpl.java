/**
 */
package productspecific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import productspecific.Family;
import productspecific.Product;
import productspecific.ProductSpecificFunction;
import productspecific.ProductSpecificInput;
import productspecific.ProductSpecificOutput;
import productspecific.ProductspecificFactory;
import productspecific.ProductspecificPackage;
import productspecific.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductspecificFactoryImpl extends EFactoryImpl implements ProductspecificFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductspecificFactory init() {
		try {
			ProductspecificFactory theProductspecificFactory = (ProductspecificFactory)EPackage.Registry.INSTANCE.getEFactory(ProductspecificPackage.eNS_URI);
			if (theProductspecificFactory != null) {
				return theProductspecificFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductspecificFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductspecificFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductspecificPackage.FAMILY: return createFamily();
			case ProductspecificPackage.PRODUCT: return createProduct();
			case ProductspecificPackage.PRODUCT_SPECIFIC_FUNCTION: return createProductSpecificFunction();
			case ProductspecificPackage.PRODUCT_SPECIFIC_INPUT: return createProductSpecificInput();
			case ProductspecificPackage.PRODUCT_SPECIFIC_OUTPUT: return createProductSpecificOutput();
			case ProductspecificPackage.SIGNAL: return createSignal();
			case ProductspecificPackage.SYSTEM: return createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSpecificFunction createProductSpecificFunction() {
		ProductSpecificFunctionImpl productSpecificFunction = new ProductSpecificFunctionImpl();
		return productSpecificFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSpecificInput createProductSpecificInput() {
		ProductSpecificInputImpl productSpecificInput = new ProductSpecificInputImpl();
		return productSpecificInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSpecificOutput createProductSpecificOutput() {
		ProductSpecificOutputImpl productSpecificOutput = new ProductSpecificOutputImpl();
		return productSpecificOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public productspecific.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductspecificPackage getProductspecificPackage() {
		return (ProductspecificPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductspecificPackage getPackage() {
		return ProductspecificPackage.eINSTANCE;
	}

} //ProductspecificFactoryImpl
