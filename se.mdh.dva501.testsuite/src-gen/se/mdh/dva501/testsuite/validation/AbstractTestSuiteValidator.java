/*
 * generated by Xtext 2.21.0
 */
package se.mdh.dva501.testsuite.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTestSuiteValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(se.mdh.dva501.testsuite.testSuite.TestSuitePackage.eINSTANCE);
		return result;
	}
}
