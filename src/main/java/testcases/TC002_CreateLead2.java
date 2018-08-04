package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC002_CreateLead2 extends Annotations {

	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLeadData";
		testName = "Create Lead";
		testDescription = "Create a lead";
		category = "smoke";
		author = "Sruthi";
		moduleName = "Leads";
		System.out.println("Setting Values");
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);
		
	}
}
