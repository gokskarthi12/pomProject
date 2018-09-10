package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Leads extends ProjectMethods {
public Leads()
{
	PageFactory.initElements(driver, this);
}
@And("click Create Leads")
public CreateLeadPage createLead() {
	click(locateElement("linktext","Create Lead"));
	return new CreateLeadPage();
}

@FindBy(linkText="Find Leads")
WebElement clickFindPage;
public FindLeadPage findLead() {
	click(clickFindPage);
	return new FindLeadPage();
}

}
