package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.Leads;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_Create extends ProjectMethods {
	@BeforeTest()
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="Create a lead";
		category = "Smoke";
		authors= "sarath";
		testNodes = "Leads";
		dataSheetName="Create";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String uname,String pswd,String cname, String fname, String lname, String email)   {
		new LoginPage()
		.typeUsername(uname)
		.typePassword(pswd)
		.clickLogin()
		.clickCrmsfa();
	new Leads().createLead();
	new CreateLeadPage()
	.typeCompanyNamePage(cname)
	.typeFNamePage(fname)
	.typeLNamePage(lname)
	.gMailPage(email)
	.clickCreatePage();
	}
}
