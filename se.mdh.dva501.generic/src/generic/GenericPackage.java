/**
 */
package generic;

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
 * @see generic.GenericFactory
 * @model kind="package"
 * @generated
 */
public interface GenericPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdh.se/dva501/generic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.mdh.dva501.generic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericPackage eINSTANCE = generic.impl.GenericPackageImpl.init();

	/**
	 * The meta object id for the '{@link generic.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generic.impl.FamilyImpl
	 * @see generic.impl.GenericPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Generic Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__GENERIC_FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generic.impl.GenericFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generic.impl.GenericFunctionImpl
	 * @see generic.impl.GenericPackageImpl#getGenericFunction()
	 * @generated
	 */
	int GENERIC_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FUNCTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Generic Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FUNCTION__GENERIC_STEPS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generic.impl.GenericStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generic.impl.GenericStepImpl
	 * @see generic.impl.GenericPackageImpl#getGenericStep()
	 * @generated
	 */
	int GENERIC_STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STEP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generic.impl.GenericInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generic.impl.GenericInputImpl
	 * @see generic.impl.GenericPackageImpl#getGenericInput()
	 * @generated
	 */
	int GENERIC_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_INPUT__NAME = GENERIC_STEP__NAME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_INPUT_FEATURE_COUNT = GENERIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_INPUT_OPERATION_COUNT = GENERIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generic.impl.GenericOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generic.impl.GenericOutputImpl
	 * @see generic.impl.GenericPackageImpl#getGenericOutput()
	 * @generated
	 */
	int GENERIC_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OUTPUT__NAME = GENERIC_STEP__NAME;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OUTPUT_FEATURE_COUNT = GENERIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OUTPUT_OPERATION_COUNT = GENERIC_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link generic.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see generic.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link generic.Family#getGenericFunctions <em>Generic Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Functions</em>'.
	 * @see generic.Family#getGenericFunctions()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_GenericFunctions();

	/**
	 * Returns the meta object for the attribute '{@link generic.Family#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generic.Family#getName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Name();

	/**
	 * Returns the meta object for the attribute '{@link generic.Family#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generic.Family#getDescription()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Description();

	/**
	 * Returns the meta object for class '{@link generic.GenericFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see generic.GenericFunction
	 * @generated
	 */
	EClass getGenericFunction();

	/**
	 * Returns the meta object for the attribute '{@link generic.GenericFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generic.GenericFunction#getName()
	 * @see #getGenericFunction()
	 * @generated
	 */
	EAttribute getGenericFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link generic.GenericFunction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generic.GenericFunction#getDescription()
	 * @see #getGenericFunction()
	 * @generated
	 */
	EAttribute getGenericFunction_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link generic.GenericFunction#getGenericSteps <em>Generic Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Steps</em>'.
	 * @see generic.GenericFunction#getGenericSteps()
	 * @see #getGenericFunction()
	 * @generated
	 */
	EReference getGenericFunction_GenericSteps();

	/**
	 * Returns the meta object for class '{@link generic.GenericStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see generic.GenericStep
	 * @generated
	 */
	EClass getGenericStep();

	/**
	 * Returns the meta object for the attribute '{@link generic.GenericStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generic.GenericStep#getName()
	 * @see #getGenericStep()
	 * @generated
	 */
	EAttribute getGenericStep_Name();

	/**
	 * Returns the meta object for class '{@link generic.GenericInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see generic.GenericInput
	 * @generated
	 */
	EClass getGenericInput();

	/**
	 * Returns the meta object for class '{@link generic.GenericOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see generic.GenericOutput
	 * @generated
	 */
	EClass getGenericOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericFactory getGenericFactory();

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
		 * The meta object literal for the '{@link generic.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generic.impl.FamilyImpl
		 * @see generic.impl.GenericPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Generic Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__GENERIC_FUNCTIONS = eINSTANCE.getFamily_GenericFunctions();

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
		 * The meta object literal for the '{@link generic.impl.GenericFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generic.impl.GenericFunctionImpl
		 * @see generic.impl.GenericPackageImpl#getGenericFunction()
		 * @generated
		 */
		EClass GENERIC_FUNCTION = eINSTANCE.getGenericFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_FUNCTION__NAME = eINSTANCE.getGenericFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_FUNCTION__DESCRIPTION = eINSTANCE.getGenericFunction_Description();

		/**
		 * The meta object literal for the '<em><b>Generic Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_FUNCTION__GENERIC_STEPS = eINSTANCE.getGenericFunction_GenericSteps();

		/**
		 * The meta object literal for the '{@link generic.impl.GenericStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generic.impl.GenericStepImpl
		 * @see generic.impl.GenericPackageImpl#getGenericStep()
		 * @generated
		 */
		EClass GENERIC_STEP = eINSTANCE.getGenericStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_STEP__NAME = eINSTANCE.getGenericStep_Name();

		/**
		 * The meta object literal for the '{@link generic.impl.GenericInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generic.impl.GenericInputImpl
		 * @see generic.impl.GenericPackageImpl#getGenericInput()
		 * @generated
		 */
		EClass GENERIC_INPUT = eINSTANCE.getGenericInput();

		/**
		 * The meta object literal for the '{@link generic.impl.GenericOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generic.impl.GenericOutputImpl
		 * @see generic.impl.GenericPackageImpl#getGenericOutput()
		 * @generated
		 */
		EClass GENERIC_OUTPUT = eINSTANCE.getGenericOutput();

	}

} //GenericPackage
