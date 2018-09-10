package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@And("Enter company Name as (.*)")
	public  CreateLeadPage typeCompanyNamePage(String data)
	{
		type(locateElement("id","createLeadForm_companyName"),data);
		return this;
	}
	@And("Enter first Name as (.*)")
	public  CreateLeadPage typeFNamePage(String data)
	{
		type(locateElement("id","createLeadForm_firstName"),data);
		return this;
	}
	@And("Enter last Name as (.*)")
	public  CreateLeadPage typeLNamePage(String data)
	{
		type(locateElement("id","createLeadForm_lastName"),data);
		return this;
	}
	@And("Enter gmail as (.*)")
	public  CreateLeadPage gMailPage(String data)
	{
		type(locateElement("id","createLeadForm_primaryEmail"),data);
		return this;
	}
	@FindBy(className="smallSubmit")
	WebElement eleCreate;
	@When("click create button")
	public ViewLead clickCreatePage() {
		click(eleCreate);
		return new ViewLead();
	}
}
