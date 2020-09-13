/**
 */
package generic.impl;

import generic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericFactoryImpl extends EFactoryImpl implements GenericFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericFactory init() {
		try {
			GenericFactory theGenericFactory = (GenericFactory)EPackage.Registry.INSTANCE.getEFactory(GenericPackage.eNS_URI);
			if (theGenericFactory != null) {
				return theGenericFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericFactoryImpl() {
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
			case GenericPackage.FAMILY: return createFamily();
			case GenericPackage.GENERIC_FUNCTION: return createGenericFunction();
			case GenericPackage.GENERIC_INPUT: return createGenericInput();
			case GenericPackage.GENERIC_OUTPUT: return createGenericOutput();
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
	public GenericFunction createGenericFunction() {
		GenericFunctionImpl genericFunction = new GenericFunctionImpl();
		return genericFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericInput createGenericInput() {
		GenericInputImpl genericInput = new GenericInputImpl();
		return genericInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericOutput createGenericOutput() {
		GenericOutputImpl genericOutput = new GenericOutputImpl();
		return genericOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericPackage getGenericPackage() {
		return (GenericPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericPackage getPackage() {
		return GenericPackage.eINSTANCE;
	}

} //GenericFactoryImpl
