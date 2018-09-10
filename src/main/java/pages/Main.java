package pages;



import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Main extends ProjectMethods{
public Main() {
	PageFactory.initElements(driver, this);
}
@And("click Leads")
public Leads clickLeads() {
	click(locateElement("linktext","Leads"));
	return new Leads();
}
}
