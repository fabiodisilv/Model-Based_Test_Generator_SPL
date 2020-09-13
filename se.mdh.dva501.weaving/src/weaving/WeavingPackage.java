/**
 */
package weaving;

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
 * @see weaving.WeavingFactory
 * @model kind="package"
 * @generated
 */
public interface WeavingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "weaving";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdh.se/dva501/weaving";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.mdh.dva501.weaving";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WeavingPackage eINSTANCE = weaving.impl.WeavingPackageImpl.init();

	/**
	 * The meta object id for the '{@link weaving.impl.WeavingImpl <em>Weaving</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see weaving.impl.WeavingImpl
	 * @see weaving.impl.WeavingPackageImpl#getWeaving()
	 * @generated
	 */
	int WEAVING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Function Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING__FUNCTION_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Weaving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Weaving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link weaving.impl.FunctionLinkImpl <em>Function Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see weaving.impl.FunctionLinkImpl
	 * @see weaving.impl.WeavingPackageImpl#getFunctionLink()
	 * @generated
	 */
	int FUNCTION_LINK = 1;

	/**
	 * The feature id for the '<em><b>Generic Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__GENERIC_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Input Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__INPUT_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Output Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__OUTPUT_LINKS = 3;

	/**
	 * The number of structural features of the '<em>Function Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link weaving.impl.InputLinkImpl <em>Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see weaving.impl.InputLinkImpl
	 * @see weaving.impl.WeavingPackageImpl#getInputLink()
	 * @generated
	 */
	int INPUT_LINK = 2;

	/**
	 * The feature id for the '<em><b>Generic Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK__GENERIC_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK__PRODUCT_SPECIFIC_INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link weaving.impl.OutputLinkImpl <em>Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see weaving.impl.OutputLinkImpl
	 * @see weaving.impl.WeavingPackageImpl#getOutputLink()
	 * @generated
	 */
	int OUTPUT_LINK = 3;

	/**
	 * The feature id for the '<em><b>Generic Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK__GENERIC_OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Product Specific Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS = 1;

	/**
	 * The number of structural features of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link weaving.Weaving <em>Weaving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weaving</em>'.
	 * @see weaving.Weaving
	 * @generated
	 */
	EClass getWeaving();

	/**
	 * Returns the meta object for the attribute '{@link weaving.Weaving#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see weaving.Weaving#getName()
	 * @see #getWeaving()
	 * @generated
	 */
	EAttribute getWeaving_Name();

	/**
	 * Returns the meta object for the attribute '{@link weaving.Weaving#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see weaving.Weaving#getDescription()
	 * @see #getWeaving()
	 * @generated
	 */
	EAttribute getWeaving_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link weaving.Weaving#getFunctionLinks <em>Function Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Links</em>'.
	 * @see weaving.Weaving#getFunctionLinks()
	 * @see #getWeaving()
	 * @generated
	 */
	EReference getWeaving_FunctionLinks();

	/**
	 * Returns the meta object for class '{@link weaving.FunctionLink <em>Function Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Link</em>'.
	 * @see weaving.FunctionLink
	 * @generated
	 */
	EClass getFunctionLink();

	/**
	 * Returns the meta object for the reference '{@link weaving.FunctionLink#getGenericFunction <em>Generic Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Function</em>'.
	 * @see weaving.FunctionLink#getGenericFunction()
	 * @see #getFunctionLink()
	 * @generated
	 */
	EReference getFunctionLink_GenericFunction();

	/**
	 * Returns the meta object for the reference list '{@link weaving.FunctionLink#getProductSpecificFunctions <em>Product Specific Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specific Functions</em>'.
	 * @see weaving.FunctionLink#getProductSpecificFunctions()
	 * @see #getFunctionLink()
	 * @generated
	 */
	EReference getFunctionLink_ProductSpecificFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link weaving.FunctionLink#getInputLinks <em>Input Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Links</em>'.
	 * @see weaving.FunctionLink#getInputLinks()
	 * @see #getFunctionLink()
	 * @generated
	 */
	EReference getFunctionLink_InputLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link weaving.FunctionLink#getOutputLinks <em>Output Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Links</em>'.
	 * @see weaving.FunctionLink#getOutputLinks()
	 * @see #getFunctionLink()
	 * @generated
	 */
	EReference getFunctionLink_OutputLinks();

	/**
	 * Returns the meta object for class '{@link weaving.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Link</em>'.
	 * @see weaving.InputLink
	 * @generated
	 */
	EClass getInputLink();

	/**
	 * Returns the meta object for the reference '{@link weaving.InputLink#getGenericInput <em>Generic Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Input</em>'.
	 * @see weaving.InputLink#getGenericInput()
	 * @see #getInputLink()
	 * @generated
	 */
	EReference getInputLink_GenericInput();

	/**
	 * Returns the meta object for the reference list '{@link weaving.InputLink#getProductSpecificInputs <em>Product Specific Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specific Inputs</em>'.
	 * @see weaving.InputLink#getProductSpecificInputs()
	 * @see #getInputLink()
	 * @generated
	 */
	EReference getInputLink_ProductSpecificInputs();

	/**
	 * Returns the meta object for class '{@link weaving.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Link</em>'.
	 * @see weaving.OutputLink
	 * @generated
	 */
	EClass getOutputLink();

	/**
	 * Returns the meta object for the reference '{@link weaving.OutputLink#getGenericOutput <em>Generic Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Output</em>'.
	 * @see weaving.OutputLink#getGenericOutput()
	 * @see #getOutputLink()
	 * @generated
	 */
	EReference getOutputLink_GenericOutput();

	/**
	 * Returns the meta object for the reference list '{@link weaving.OutputLink#getProductSpecificOutputs <em>Product Specific Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specific Outputs</em>'.
	 * @see weaving.OutputLink#getProductSpecificOutputs()
	 * @see #getOutputLink()
	 * @generated
	 */
	EReference getOutputLink_ProductSpecificOutputs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WeavingFactory getWeavingFactory();

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
		 * The meta object literal for the '{@link weaving.impl.WeavingImpl <em>Weaving</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see weaving.impl.WeavingImpl
		 * @see weaving.impl.WeavingPackageImpl#getWeaving()
		 * @generated
		 */
		EClass WEAVING = eINSTANCE.getWeaving();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAVING__NAME = eINSTANCE.getWeaving_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAVING__DESCRIPTION = eINSTANCE.getWeaving_Description();

		/**
		 * The meta object literal for the '<em><b>Function Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVING__FUNCTION_LINKS = eINSTANCE.getWeaving_FunctionLinks();

		/**
		 * The meta object literal for the '{@link weaving.impl.FunctionLinkImpl <em>Function Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see weaving.impl.FunctionLinkImpl
		 * @see weaving.impl.WeavingPackageImpl#getFunctionLink()
		 * @generated
		 */
		EClass FUNCTION_LINK = eINSTANCE.getFunctionLink();

		/**
		 * The meta object literal for the '<em><b>Generic Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_LINK__GENERIC_FUNCTION = eINSTANCE.getFunctionLink_GenericFunction();

		/**
		 * The meta object literal for the '<em><b>Product Specific Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_LINK__PRODUCT_SPECIFIC_FUNCTIONS = eINSTANCE.getFunctionLink_ProductSpecificFunctions();

		/**
		 * The meta object literal for the '<em><b>Input Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_LINK__INPUT_LINKS = eINSTANCE.getFunctionLink_InputLinks();

		/**
		 * The meta object literal for the '<em><b>Output Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_LINK__OUTPUT_LINKS = eINSTANCE.getFunctionLink_OutputLinks();

		/**
		 * The meta object literal for the '{@link weaving.impl.InputLinkImpl <em>Input Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see weaving.impl.InputLinkImpl
		 * @see weaving.impl.WeavingPackageImpl#getInputLink()
		 * @generated
		 */
		EClass INPUT_LINK = eINSTANCE.getInputLink();

		/**
		 * The meta object literal for the '<em><b>Generic Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_LINK__GENERIC_INPUT = eINSTANCE.getInputLink_GenericInput();

		/**
		 * The meta object literal for the '<em><b>Product Specific Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_LINK__PRODUCT_SPECIFIC_INPUTS = eINSTANCE.getInputLink_ProductSpecificInputs();

		/**
		 * The meta object literal for the '{@link weaving.impl.OutputLinkImpl <em>Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see weaving.impl.OutputLinkImpl
		 * @see weaving.impl.WeavingPackageImpl#getOutputLink()
		 * @generated
		 */
		EClass OUTPUT_LINK = eINSTANCE.getOutputLink();

		/**
		 * The meta object literal for the '<em><b>Generic Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_LINK__GENERIC_OUTPUT = eINSTANCE.getOutputLink_GenericOutput();

		/**
		 * The meta object literal for the '<em><b>Product Specific Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_LINK__PRODUCT_SPECIFIC_OUTPUTS = eINSTANCE.getOutputLink_ProductSpecificOutputs();

	}

} //WeavingPackage
