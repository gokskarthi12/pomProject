package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
public ViewLead()
{
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Delete")
WebElement clickDelete;
public MyLeads clickDelete() {
	click(clickDelete);
	return new MyLeads();
}
}
