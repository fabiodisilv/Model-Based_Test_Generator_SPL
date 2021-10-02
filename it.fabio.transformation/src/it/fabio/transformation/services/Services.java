package it.fabio.transformation.services;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import weaving.Link;
import weaving.ProductSignal;
import weaving.Weaving;
import weaving.WeavingPackage;
import se.mdh.dva501.testsuite.TestSuiteStandaloneSetup;
import se.mdh.dva501.testsuite.testSuite.TestSuite;


public class Services {

	private static String weavingPath = "file:/PATH_TO_WEAVING_INSTANCE/WEAVING_NAME.weaving";
	private static String testSuitePath = "file:/PATH_TO_TESTSUITE_INSTANCE/TEST_SUITE_NAME.testsuite";


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
	
	
	public Weaving getWeaving() {
		WeavingPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("weaving", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(weavingPath), true);
		Weaving model = (Weaving) resource.getContents().get(0);
		return model;
	}
	
	public List<String> getProducts(Weaving weaving){
		List<Link> links = weaving.getLinks();
		List<ProductSignal> productSignals = new ArrayList<ProductSignal>();
		
		for (Link link : links) {
			for (ProductSignal productSignal : link.getProductSignal()) {
				productSignals.add(productSignal);
			}
		}
		java.util.Set<String> projects = new HashSet<String>();
		for (ProductSignal productSignal : productSignals) {
			projects.add(productSignal.getProduct());
		}

		return new ArrayList<String>(projects);
	}
	
	public String getSignal(String product, String genericSignal, Weaving weaving) {
		String signal = "";
		List<Link> links = weaving.getLinks();
		
		for (Link link : links) {
			if(link.getGenericSignal() == genericSignal) {
				for (ProductSignal productSignal : link.getProductSignal()) {
					if(productSignal.getProduct() == product) {
						signal = productSignal.getSignal();
					}
				}
			}
		}
		return signal;
	}
}

