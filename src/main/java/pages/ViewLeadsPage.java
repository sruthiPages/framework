package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeadsPage extends Annotations {

	public ViewLeadsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleVerifyFirstName;
	
	public ViewLeadsPage verifyFirstName(String expectedText) {
		verifyExactText(eleVerifyFirstName, expectedText);
		return this;
	}
}
