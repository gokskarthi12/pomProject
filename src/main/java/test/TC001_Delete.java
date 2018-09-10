package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;

import pages.LoginPage;

import wdMethods.ProjectMethods;

public class TC001_Delete extends ProjectMethods{
	@BeforeTest()
	public void setData() {
		testCaseName = "TC001_Delete";
		testDescription ="Delete a lead";
		category = "Smoke";
		authors= "karthi";
		testNodes = "Leads";
		dataSheetName="Delete";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uname, String pswd, String fname,String ErrorMsg)
	{
		new LoginPage()
		.typeUsername(uname)
		.typePassword(pswd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.findLead()
		.typeFName(fname)
		.clickFindButton()
		.clickFirstResult()
		.clickDelete()
		.findLeads();
		new FindLeadPage()
		.typeID(delData)
		.clickFindButton()
		.verifyLead(ErrorMsg);
		
	}
}
