/*package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create {
public ChromeDriver driver;

//@And("Maximize the browser")
//public void maximize()
//{
//	driver.manage().window().maximize();
//}
//@And("Set timeout")
//public void timeout()
//{
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//}
//@And("Load the URL")
//public void loadURL()
//{
//	
//	driver.get("http://leaftaps.com/opentaps/control/main");
//}
@And("Enter username as (.*)")
public void typeUsername(String uName)
{
	driver.findElementById("username").sendKeys(uName);
}
@And("Enter password as (.*)")
public void typePassword(String password)
{
	driver.findElementById("password").sendKeys(password);
}
@When("click Login button")
public void clickLogin()
{
	driver.findElementByClassName("decorativeSubmit").click();
}
@Then("verify login is successful")
public void verifyLogin() {
	String title = driver.getTitle();
	if(title.contains("Leaftaps - TestLeaf Automation Platform"))
	{
		System.out.println("Verified");
	}
	else
		System.out.println("Unsuccessful");
}
@When("close the browser")
public void closeSteps()
{
	driver.close();
}
@And("click the crmsfa")
public void clickCrmsfa()
{
	driver.findElementByLinkText("CRM/SFA").click();
}
@And("click Leads")
public void clickLeads()
{
	driver.findElementByLinkText("Leads").click();
}
@And("click Create Leads")
public void clickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
}
@And("Enter company Name as (.*)")
public void typeCompanyName(String cname) {
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	
	//driver.findElementByName("companyName").sendKeys("TestLeaf");
}
@And("Enter first Name as (.*)")
public void typeFirstName(String fname) {
	//driver.findElementByName("firstName").sendKeys("kd");
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	
	
}
@And("Enter last Name as (.*)")
public void typeLastName(String lname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	//driver.findElementByName("lastName").sendKeys("gk");
}
@And("click create button")
public void clickCreate()
{
	driver.findElementByClassName("smallSubmit").click();
}
}*/