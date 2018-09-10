Feature: Leaftap Automation for Edit
Scenario Outline:
	And Enter userid as <userid>
	And Enter pswrd as <pswrd>
	And click button
	And click CRM
	And click Lead Button
	And click find Leads
	And Enter fName as <fName>
	And click finding leads 
	And click on first result
	And click Edit
	And Enter companyName to change <comName>
	And Verity the Update
	When quit browser
Examples:
|userid|pswrd|fName|comName|
|DemoSalesManager|crmsfa|gokul|Testleaf|
|DemoSalesManager|crmsfa|karthi|CTS|
