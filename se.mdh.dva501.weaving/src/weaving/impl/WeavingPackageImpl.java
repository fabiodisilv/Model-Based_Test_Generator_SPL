/**
 */
package weaving.impl;

import generic.GenericPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import productspecific.ProductspecificPackage;

import weaving.FunctionLink;
import weaving.InputLink;
import weaving.OutputLink;
import weaving.Weaving;
import weaving.WeavingFactory;
import weaving.WeavingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeavingPackageImpl extends EPackageImpl implements WeavingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weavingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see weaving.WeavingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WeavingPackageImpl() {
		super(eNS_URI, WeavingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WeavingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WeavingPackage init() {
		if (isInited) return (WeavingPackage)EPackage.Registry.INSTANCE.getEPackage(WeavingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWeavingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WeavingPackageImpl theWeavingPackage = registeredWeavingPackage instanceof WeavingPackageImpl ? (WeavingPackageImpl)registeredWeavingPackage : new WeavingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GenericPackage.eINSTANCE.eClass();
		ProductspecificPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWeavingPackage.createPackageContents();

		// Initialize created meta-data
		theWeavingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWeavingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WeavingPackage.eNS_URI, theWeavingPackage);
		return theWeavingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeaving() {
		return weavingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeaving_Name() {
		return (EAttribute)weavingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeaving_Description() {
		return (EAttribute)weavingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeaving_FunctionLinks() {
		return (EReference)weavingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionLink() {
		return functionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionLink_GenericFunction() {
		return (EReference)functionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionLink_ProductSpecificFunctions() {
		return (EReference)functionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionLink_InputLinks() {
		return (EReference)functionLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionLink_OutputLinks() {
		return (EReference)functionLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputLink() {
		return inputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputLink_GenericInput() {
		return (EReference)inputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputLink_ProductSpecificInputs() {
		return (EReference)inputLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputLink() {
		return outputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputLink_GenericOutput() {
		return (EReference)outputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputLink_ProductSpecificOutputs() {
		return (EReference)outputLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeavingFactory getWeavingFactory() {
		return (WeavingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		weavingEClass = createEClass(WEAVING);
		createEAttribute(weavingEClass, WEAVING__NAME);
		createEAttribute(weavingEClass, WEAVING__DESCRIPTION);
		createEReference(weavingEClass, WEAVING__FUNCTION_LINKS);

		functionLinkEClass = createEClass(FUNCTION_LINK);
		createEReference(functionLinkEClass, FUNCTION_LINK__GENERIC_FUNCTION);
		createEReference(functionLinkEClass, FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS);
		createEReference(functionLinkEClass, FUNCTION_LINK__INPUT_LINKS);
		createEReference(functionLinkEClass, FUNCTION_LINK__OUTPUT_LINKS);

		inputLinkEClass = createEClass(INPUT_LINK);
		createEReference(inputLinkEClass, INPUT_LINK__GENERIC_INPUT);
		createEReference(inputLinkEClass, INPUT_LINK__PRODUCT_SPECIFIC_INPUTS);

		outputLinkEClass = createEClass(OUTPUT_LINK);
		createEReference(outputLinkEClass, OUTPUT_LINK__GENERIC_OUTPUT);
		createEReference(outputLinkEClass, OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericPackage theGenericPackage = (GenericPackage)EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI);
		ProductspecificPackage theProductspecificPackage = (ProductspecificPackage)EPackage.Registry.INSTANCE.getEPackage(ProductspecificPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(weavingEClass, Weaving.class, "Weaving", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeaving_Name(), ecorePackage.getEString(), "name", null, 1, 1, Weaving.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeaving_Description(), ecorePackage.getEString(), "description", null, 0, 1, Weaving.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeaving_FunctionLinks(), this.getFunctionLink(), null, "functionLinks", null, 1, -1, Weaving.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionLinkEClass, FunctionLink.class, "FunctionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionLink_GenericFunction(), theGenericPackage.getGenericFunction(), null, "genericFunction", null, 1, 1, FunctionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionLink_ProductSpecificFunctions(), theProductspecificPackage.getProductSpecificFunction(), null, "productSpecificFunctions", null, 1, -1, FunctionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionLink_InputLinks(), this.getInputLink(), null, "inputLinks", null, 1, -1, FunctionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionLink_OutputLinks(), this.getOutputLink(), null, "outputLinks", null, 1, -1, FunctionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputLinkEClass, InputLink.class, "InputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputLink_GenericInput(), theGenericPackage.getGenericInput(), null, "genericInput", null, 1, 1, InputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputLink_ProductSpecificInputs(), theProductspecificPackage.getProductSpecificInput(), null, "productSpecificInputs", null, 1, -1, InputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputLinkEClass, OutputLink.class, "OutputLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputLink_GenericOutput(), theGenericPackage.getGenericOutput(), null, "genericOutput", null, 1, 1, OutputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputLink_ProductSpecificOutputs(), theProductspecificPackage.getProductSpecificOutput(), null, "productSpecificOutputs", null, 1, -1, OutputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WeavingPackageImpl
