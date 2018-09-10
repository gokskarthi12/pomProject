package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {

	@BeforeTest()
	public void setData() {
		testCaseName = "TC001_Create";
		testDescription ="Create a lead";
		category = "Smoke";
		authors= "sarath";
		testNodes = "Leads";
		dataSheetName="Create";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String uname,String pswd,String cname, String fname, String lname, String email)   {
		
		
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email); 
		click(locateElement("name", "submitButton"));
		
		
	}


}
