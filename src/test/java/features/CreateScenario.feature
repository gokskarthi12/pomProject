Feature: Create Lead with different
@smoke
Scenario Outline: Login into leaftaps for DemoSalesManager 
	And Enter username as <username>
	And Enter password as <password>
	And click Login button  
	And click crmsfa 
	And click Leads 
	And click Create Leads 
	And Enter company Name as <cname> 
	And Enter first Name as <fname> 
	And Enter last Name as <lname> 
	And Enter gmail as <gmail> 
	When click create button  
	Examples: 
		|username|password|cname|fname|lname|gmail|
		|DemoSalesManager|crmsfa|testleaf|gk|kd|gk@gmail.com|
		|DemoSalesManager|crmsfa|testleaf|karthi|devi|kd@gmail.com|
	