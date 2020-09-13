/**
 */
package productspecific;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see productspecific.ProductspecificFactory
 * @model kind="package"
 * @generated
 */
public interface ProductspecificPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productspecific";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdh.se/dva501/productspecific";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.mdh.dva501.productspecific";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductspecificPackage eINSTANCE = productspecific.impl.ProductspecificPackageImpl.init();

	/**
	 * The meta object id for the '{@link productspecific.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.FamilyImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PRODUCT_SPECIFIC_FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Product Specific Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PRODUCT_SPECIFIC_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SIGNALS = 3;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SYSTEMS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.ProductImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_SPECIFIC_FUNCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.ProductSpecificFunctionImpl <em>Product Specific Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.ProductSpecificFunctionImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificFunction()
	 * @generated
	 */
	int PRODUCT_SPECIFIC_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_FUNCTION__PROJECTS = 2;

	/**
	 * The number of structural features of the '<em>Product Specific Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Specific Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.ProductSpecificStepImpl <em>Product Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.ProductSpecificStepImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificStep()
	 * @generated
	 */
	int PRODUCT_SPECIFIC_STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_STEP__SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_STEP__SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Product Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.ProductSpecificInputImpl <em>Product Specific Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.ProductSpecificInputImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificInput()
	 * @generated
	 */
	int PRODUCT_SPECIFIC_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_INPUT__NAME = PRODUCT_SPECIFIC_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_INPUT__SIGNAL = PRODUCT_SPECIFIC_STEP__SIGNAL;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_INPUT__SYSTEM = PRODUCT_SPECIFIC_STEP__SYSTEM;

	/**
	 * The number of structural features of the '<em>Product Specific Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_INPUT_FEATURE_COUNT = PRODUCT_SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Specific Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_INPUT_OPERATION_COUNT = PRODUCT_SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.ProductSpecificOutputImpl <em>Product Specific Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.ProductSpecificOutputImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificOutput()
	 * @generated
	 */
	int PRODUCT_SPECIFIC_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_OUTPUT__NAME = PRODUCT_SPECIFIC_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_OUTPUT__SIGNAL = PRODUCT_SPECIFIC_STEP__SIGNAL;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_OUTPUT__SYSTEM = PRODUCT_SPECIFIC_STEP__SYSTEM;

	/**
	 * The number of structural features of the '<em>Product Specific Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_OUTPUT_FEATURE_COUNT = PRODUCT_SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Specific Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFIC_OUTPUT_OPERATION_COUNT = PRODUCT_SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.SignalImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productspecific.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productspecific.impl.SystemImpl
	 * @see productspecific.impl.ProductspecificPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link productspecific.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see productspecific.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link productspecific.Family#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see productspecific.Family#getProducts()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link productspecific.Family#getProductSpecificFunctions <em>Product Specific Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Specific Functions</em>'.
	 * @see productspecific.Family#getProductSpecificFunctions()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_ProductSpecificFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link productspecific.Family#getProductSpecificSteps <em>Product Specific Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Specific Steps</em>'.
	 * @see productspecific.Family#getProductSpecificSteps()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_ProductSpecificSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link productspecific.Family#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see productspecific.Family#getSignals()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link productspecific.Family#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see productspecific.Family#getSystems()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Systems();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.Family#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.Family#getName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Name();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.Family#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see productspecific.Family#getDescription()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Description();

	/**
	 * Returns the meta object for class '{@link productspecific.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see productspecific.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference list '{@link productspecific.Product#getProductSpecificFunctions <em>Product Specific Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specific Functions</em>'.
	 * @see productspecific.Product#getProductSpecificFunctions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductSpecificFunctions();

	/**
	 * Returns the meta object for class '{@link productspecific.ProductSpecificFunction <em>Product Specific Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Specific Function</em>'.
	 * @see productspecific.ProductSpecificFunction
	 * @generated
	 */
	EClass getProductSpecificFunction();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.ProductSpecificFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.ProductSpecificFunction#getName()
	 * @see #getProductSpecificFunction()
	 * @generated
	 */
	EAttribute getProductSpecificFunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link productspecific.ProductSpecificFunction#getProductSpecificSteps <em>Product Specific Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specific Steps</em>'.
	 * @see productspecific.ProductSpecificFunction#getProductSpecificSteps()
	 * @see #getProductSpecificFunction()
	 * @generated
	 */
	EReference getProductSpecificFunction_ProductSpecificSteps();

	/**
	 * Returns the meta object for the reference list '{@link productspecific.ProductSpecificFunction#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see productspecific.ProductSpecificFunction#getProjects()
	 * @see #getProductSpecificFunction()
	 * @generated
	 */
	EReference getProductSpecificFunction_Projects();

	/**
	 * Returns the meta object for class '{@link productspecific.ProductSpecificStep <em>Product Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Specific Step</em>'.
	 * @see productspecific.ProductSpecificStep
	 * @generated
	 */
	EClass getProductSpecificStep();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.ProductSpecificStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.ProductSpecificStep#getName()
	 * @see #getProductSpecificStep()
	 * @generated
	 */
	EAttribute getProductSpecificStep_Name();

	/**
	 * Returns the meta object for the reference '{@link productspecific.ProductSpecificStep#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see productspecific.ProductSpecificStep#getSignal()
	 * @see #getProductSpecificStep()
	 * @generated
	 */
	EReference getProductSpecificStep_Signal();

	/**
	 * Returns the meta object for the reference '{@link productspecific.ProductSpecificStep#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see productspecific.ProductSpecificStep#getSystem()
	 * @see #getProductSpecificStep()
	 * @generated
	 */
	EReference getProductSpecificStep_System();

	/**
	 * Returns the meta object for class '{@link productspecific.ProductSpecificInput <em>Product Specific Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Specific Input</em>'.
	 * @see productspecific.ProductSpecificInput
	 * @generated
	 */
	EClass getProductSpecificInput();

	/**
	 * Returns the meta object for class '{@link productspecific.ProductSpecificOutput <em>Product Specific Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Specific Output</em>'.
	 * @see productspecific.ProductSpecificOutput
	 * @generated
	 */
	EClass getProductSpecificOutput();

	/**
	 * Returns the meta object for class '{@link productspecific.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see productspecific.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for class '{@link productspecific.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see productspecific.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link productspecific.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see productspecific.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductspecificFactory getProductspecificFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link productspecific.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.FamilyImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PRODUCTS = eINSTANCE.getFamily_Products();

		/**
		 * The meta object literal for the '<em><b>Product Specific Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PRODUCT_SPECIFIC_FUNCTIONS = eINSTANCE.getFamily_ProductSpecificFunctions();

		/**
		 * The meta object literal for the '<em><b>Product Specific Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PRODUCT_SPECIFIC_STEPS = eINSTANCE.getFamily_ProductSpecificSteps();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SIGNALS = eINSTANCE.getFamily_Signals();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SYSTEMS = eINSTANCE.getFamily_Systems();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__NAME = eINSTANCE.getFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__DESCRIPTION = eINSTANCE.getFamily_Description();

		/**
		 * The meta object literal for the '{@link productspecific.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.ProductImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Product Specific Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_SPECIFIC_FUNCTIONS = eINSTANCE.getProduct_ProductSpecificFunctions();

		/**
		 * The meta object literal for the '{@link productspecific.impl.ProductSpecificFunctionImpl <em>Product Specific Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.ProductSpecificFunctionImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificFunction()
		 * @generated
		 */
		EClass PRODUCT_SPECIFIC_FUNCTION = eINSTANCE.getProductSpecificFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SPECIFIC_FUNCTION__NAME = eINSTANCE.getProductSpecificFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Product Specific Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFIC_FUNCTION__PRODUCT_SPECIFIC_STEPS = eINSTANCE.getProductSpecificFunction_ProductSpecificSteps();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFIC_FUNCTION__PROJECTS = eINSTANCE.getProductSpecificFunction_Projects();

		/**
		 * The meta object literal for the '{@link productspecific.impl.ProductSpecificStepImpl <em>Product Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.ProductSpecificStepImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificStep()
		 * @generated
		 */
		EClass PRODUCT_SPECIFIC_STEP = eINSTANCE.getProductSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SPECIFIC_STEP__NAME = eINSTANCE.getProductSpecificStep_Name();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFIC_STEP__SIGNAL = eINSTANCE.getProductSpecificStep_Signal();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFIC_STEP__SYSTEM = eINSTANCE.getProductSpecificStep_System();

		/**
		 * The meta object literal for the '{@link productspecific.impl.ProductSpecificInputImpl <em>Product Specific Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.ProductSpecificInputImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificInput()
		 * @generated
		 */
		EClass PRODUCT_SPECIFIC_INPUT = eINSTANCE.getProductSpecificInput();

		/**
		 * The meta object literal for the '{@link productspecific.impl.ProductSpecificOutputImpl <em>Product Specific Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.ProductSpecificOutputImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getProductSpecificOutput()
		 * @generated
		 */
		EClass PRODUCT_SPECIFIC_OUTPUT = eINSTANCE.getProductSpecificOutput();

		/**
		 * The meta object literal for the '{@link productspecific.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.SignalImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '{@link productspecific.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productspecific.impl.SystemImpl
		 * @see productspecific.impl.ProductspecificPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

	}

} //ProductspecificPackage
