package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLeadPage extends Annotations {

	public CreateLeadPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(className = "errorList")
	WebElement eleErrorMsg;
	@FindBy(name = "submitButton")
	WebElement submitBtn;
	
	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;
	}
	
	public CreateLeadPage verifyErrorMsg(String expectedText) {
		verifyPartialText(eleErrorMsg, expectedText);
		return this;
	}
	
	public CreateLeadPage clickSubmitFailure() {
		click(submitBtn);
		return this;
	}
	
	public ViewLeadsPage clickSubmit() {
		click(submitBtn);
		return new ViewLeadsPage();
	}
}