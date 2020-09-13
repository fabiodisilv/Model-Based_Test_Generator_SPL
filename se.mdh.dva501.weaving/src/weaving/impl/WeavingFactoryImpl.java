/**
 */
package weaving.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import weaving.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeavingFactoryImpl extends EFactoryImpl implements WeavingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeavingFactory init() {
		try {
			WeavingFactory theWeavingFactory = (WeavingFactory)EPackage.Registry.INSTANCE.getEFactory(WeavingPackage.eNS_URI);
			if (theWeavingFactory != null) {
				return theWeavingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WeavingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeavingFactoryImpl() {
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
			case WeavingPackage.WEAVING: return createWeaving();
			case WeavingPackage.FUNCTION_LINK: return createFunctionLink();
			case WeavingPackage.INPUT_LINK: return createInputLink();
			case WeavingPackage.OUTPUT_LINK: return createOutputLink();
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
	public Weaving createWeaving() {
		WeavingImpl weaving = new WeavingImpl();
		return weaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionLink createFunctionLink() {
		FunctionLinkImpl functionLink = new FunctionLinkImpl();
		return functionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputLink createInputLink() {
		InputLinkImpl inputLink = new InputLinkImpl();
		return inputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputLink createOutputLink() {
		OutputLinkImpl outputLink = new OutputLinkImpl();
		return outputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeavingPackage getWeavingPackage() {
		return (WeavingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WeavingPackage getPackage() {
		return WeavingPackage.eINSTANCE;
	}

} //WeavingFactoryImpl
