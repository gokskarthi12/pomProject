package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Find Leads")
	WebElement clickFindPage;
	public FindLeadPage findLeads() {
		click(clickFindPage);
		return new FindLeadPage();
	}

}
