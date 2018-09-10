package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
public  FindLeadPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@name='firstName'])[3]")
WebElement typeFname;
public  FindLeadPage typeFName(String data)
{
	type(typeFname, data);
	return this;
}
@FindBy(xpath="//button[text()='Find Leads']")
WebElement clickFindButton;
public FindLeadPage clickFindButton() {
	click(clickFindButton);
	return this;
}
@FindBy(name="id")
WebElement typeID;
public FindLeadPage typeID(String delData)
{
	type(typeID,delData);
	return this;
}
@CacheLookup
@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
WebElement clickFirstResult;
public ViewLead clickFirstResult() {
	delData = clickFirstResult.getText();
	click(clickFirstResult);
	return new ViewLead();			
}
@FindBy(className="x-paging-info")
WebElement eleVerify;
public FindLeadPage verifyLead(String ErrMsg) {
	
		
	//verifyPartialAttribute(clickFirstResult, "linktext", delData);
	verifyPartialText(eleVerify, ErrMsg);
	return this;
}

}
