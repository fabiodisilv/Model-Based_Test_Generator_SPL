package se.mdh.dva501.testsuite.transformation.services;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import generic.Family;
import generic.GenericFunction;
import generic.GenericPackage;
import productspecific.Product;
import productspecific.ProductSpecificFunction;
import productspecific.ProductSpecificInput;
import productspecific.ProductSpecificOutput;
import productspecific.ProductSpecificStep;
import productspecific.ProductspecificPackage;
import se.mdh.dva501.testsuite.TestSuiteStandaloneSetup;
import se.mdh.dva501.testsuite.testSuite.Check;
import se.mdh.dva501.testsuite.testSuite.Force;
import se.mdh.dva501.testsuite.testSuite.ProductException;
import se.mdh.dva501.testsuite.testSuite.ProductValueException;
import se.mdh.dva501.testsuite.testSuite.Set;
import se.mdh.dva501.testsuite.testSuite.Step;
import se.mdh.dva501.testsuite.testSuite.TestCase;
import se.mdh.dva501.testsuite.testSuite.TestSuite;
import weaving.FunctionLink;
import weaving.InputLink;
import weaving.OutputLink;
import weaving.Weaving;

public class Services {

	private static String testSuitePath = "file:/PATH_TO_TESTSUITE_INSTANCE/TEST_SUITE_NAME.testsuite";
	private static String genericPath = "file:/PATH_TO_GENERIC_MODEL/GENERIC_MODEL_NAME.generic";
	private static String productspecificPath = "file:/PATH_TO_PRODUCT_SPECIFIC_MODEL/PRODUCT_SPECIFIC_MODEL_NAME.productspecific";

	public TestSuite getTestSuite() {

		TestSuiteStandaloneSetup.doSetup();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(testSuitePath));
		try {
			resource.load(resourceSet.getLoadOptions());
			TestSuite model = (TestSuite) resource.getContents().get(0);
			return model;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public generic.Family getGeneric() {
		GenericPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("generic", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(genericPath), true);
		generic.Family model = (generic.Family) resource.getContents().get(0);
		return model;
	}

	public productspecific.Family getProductSpecific() {
		ProductspecificPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("productspecific", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(productspecificPath), true);
		productspecific.Family model = (productspecific.Family) resource.getContents().get(0);
		return model;

	}

	public GenericFunction getGenericFunction(String genericFunctionName, generic.Family genericFamily) {
		// search for the generic function obj givend the name
		GenericFunction genericFunction = genericFamily.getGenericFunctions().stream()
				.filter(genFunction -> genericFunctionName.equals(genFunction.getName())).findAny().orElse(null);

		return genericFunction;

//		for (GenericFunction genericFunction : genericFunctions.getGenericFunctions()) {
//			if (genericFunction.getName() == genericFunctionName) {
//				return genericFunction;
//			}
//		}
//		return null;
	}

	public ProductSpecificInput getProductSpecificInput(Product project, Step step, Weaving weaving, GenericFunction genericFunction) {
		// System.out.println("***INPUT".concat(step.eClass().getName()));
		try {

			ProductSpecificFunction projectFunction = null;
			List<ProductSpecificInput> projectInputList = null;
			List<ProductSpecificFunction> projectFunctionList = null;

			// search for the function link given the generic function
			FunctionLink functionLink = weaving.getFunctionLinks().stream()
					.filter(funLink -> genericFunction.getName().contentEquals(funLink.getGenericFunction().getName()))
					.findAny().orElse(null);

			// get the project function related to the generic function
			projectFunctionList = functionLink.getProductSpecificFunctions();

			// get the project inputs related to the
			for (InputLink inputLink : functionLink.getInputLinks()) {
				if (inputLink.getGenericInput().getName().equals(step.getGenericSignal().getName())) {
					projectInputList = inputLink.getProductSpecificInputs();
				}
			}

			// get the project function of the project
			for (ProductSpecificFunction projectFunctionOfProduct : project.getProductSpecificFunctions()) {
				for (ProductSpecificFunction projectFunctionOfWeaving : projectFunctionList) {
					if (projectFunctionOfProduct.getName().equals(projectFunctionOfWeaving.getName())) {
						projectFunction = projectFunctionOfProduct;
					}
				}
			}

			// search for the right project input inside the project function and return it
			for (ProductSpecificStep projectStep : projectFunction.getProductSpecificSteps()) {
				if (projectStep instanceof ProductSpecificInput) {
					for (ProductSpecificInput projectInput : projectInputList) {
						if (projectInput.getSystem().getName().equals(projectStep.getSystem().getName())
								&& projectInput.getSignal().getName().equals(projectStep.getSignal().getName())) {
							return (ProductSpecificInput) projectStep;
						}
					}
				}

			}

			return null;

		} catch (Exception e) {
			return null;
		}
	}

	public ProductSpecificOutput getProductSpecificOutput(Product project, Step step, Weaving weaving,
			GenericFunction genericFunction) {
		// System.out.println("***OUTPUT".concat(step.eClass().getName()));

		try {

			ProductSpecificFunction projectFunction = null;
			List<ProductSpecificOutput> projectOutputList = null;
			List<ProductSpecificFunction> projectFunctionList = null;

			// search for the function link given the generic function
			FunctionLink functionLink = weaving.getFunctionLinks().stream()
					.filter(funLink -> genericFunction.getName().contentEquals(funLink.getGenericFunction().getName()))
					.findAny().orElse(null);

			// get the project function related to the generic function
			projectFunctionList = functionLink.getProductSpecificFunctions();

			// get the project outputs related to the
			for (OutputLink outputLink : functionLink.getOutputLinks()) {
				if (outputLink.getGenericOutput().getName().equals(step.getGenericSignal().getName())) {
					projectOutputList = outputLink.getProductSpecificOutputs();
				}
			}

			// get the project function of the project
			for (ProductSpecificFunction projectFunctionOfProduct : project.getProductSpecificFunctions()) {
				for (ProductSpecificFunction projectFunctionOfWeaving : projectFunctionList) {
					if (projectFunctionOfProduct.getName().equals(projectFunctionOfWeaving.getName())) {
						projectFunction = projectFunctionOfProduct;
					}
				}
			}

			// search for the right project output inside the project function and return it
			for (ProductSpecificStep projectStep : projectFunction.getProductSpecificSteps()) {
				if (projectStep instanceof ProductSpecificOutput) {
					for (ProductSpecificOutput projectOutput : projectOutputList) {
						if (projectOutput.getSystem().getName().equals(projectStep.getSystem().getName())
								&& projectOutput.getSignal().getName().equals(projectStep.getSignal().getName())) {
							return (ProductSpecificOutput) projectStep;
						}
					}
				}

			}

			return null;

		} catch (Exception e) {
			return null;
		}
	}

	public ProductSpecificFunction getProductSpecificFunction(GenericFunction genericFunction, Product project, Weaving weaving) {
		List<ProductSpecificFunction> projectFunctionList = null;
		for (FunctionLink functionLink : weaving.getFunctionLinks()) {
			if (functionLink.getGenericFunction().getName().equals(genericFunction.getName())) {
				projectFunctionList = functionLink.getProductSpecificFunctions();
			}
		}

		for (ProductSpecificFunction projectFunctionOfWeaving : projectFunctionList) {
			for (ProductSpecificFunction projectFunctionOfProduct : project.getProductSpecificFunctions()) {
				if (projectFunctionOfProduct.getName().equals(projectFunctionOfWeaving.getName())) {
					return projectFunctionOfProduct;
				}
			}
		}
		return null;
	}

	public Boolean isProductValueException(Product project, Step step) {
		
		if (step instanceof Set) {
			Set set = (Set) step;
			ProductValueException projectValueException = set.getProductValueExceptions().stream()
					.filter(projException -> project.getName().equals(projException.getProductName())).findAny()
					.orElse(null);
			if (projectValueException == null) {
				return false;
			} else {
				return true;
			}
		}else if (step instanceof Force) {
			Force force = (Force) step;
			ProductValueException projectValueException = force.getProductValueExceptions().stream()
					.filter(projException -> project.getName().equals(projException.getProductName())).findAny()
					.orElse(null);
			if (projectValueException == null) {
				return false;
			} else {
				return true;
			}
		}else if (step instanceof Check) {
			Check check = (Check) step;
			ProductValueException projectValueException = check.getProductValueExceptions().stream()
					.filter(projException -> project.getName().equals(projException.getProductName())).findAny()
					.orElse(null);
			if (projectValueException == null) {
				return false;
			} else {
				return true;
			}
		}else {
			return false;
		}
		
//		ProductValueException projectValueException = step.getProductValueExceptions().stream()
//				.filter(projException -> project.getName().equals(projException.getProductName())).findAny()
//				.orElse(null);
//		if (projectValueException == null) {
//			return false;
//		} else {
//			return true;
//		}
//		
//		return false;
	}

	public ProductValueException getProductValueException(Product project, Step step) {
//		ProductValueException projectValueException = step.getProductValueExceptions().stream()
//				.filter(projValException -> project.getName().equals(projValException.getProductName())).findAny()
//				.orElse(null);
//		if (projectValueException != null) {
//			return projectValueException;
//		} else {
//			return null;
//		}
		
		return null;
	}

	public Boolean isProductException(Product project, TestCase testCase) {
		ProductException projectException = testCase.getProductException().stream()
				.filter(proException -> project.getName().equals(proException.getProductName())).findAny().orElse(null);

		if (projectException != null) {
			return false;
		} else {
			return true;
		}

	}

	public String parseValue(String value) {
		// check if value is a number
		if (isNumeric(value)) {
			return value;
		} else if (isBoolean(value)) {
			return value.toLowerCase();
		} else {
			return "\"" + value + "\"";
		}
	}

	private static boolean isBoolean(String strNum) {
		if (strNum.toLowerCase().trim().equals("true") || strNum.toLowerCase().trim().equals("false")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
