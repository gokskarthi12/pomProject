//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//
//public class Edit {
//	public ChromeDriver driver;
//	@Given("Launch Browser")
//	public void browser()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GokulnathKarthika\\Desktop\\chromedriver.exe");
//	}
//	@And("Maxi Browser")
//	public void maxi()
//	{
//		driver.manage().window().maximize();
//	}
//	@And("timeout wait")
//	public void time()
//	{
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	@And("Load url")
//	public void loadingURL()
//	{
//		driver.get("http://leaftaps.com/opentaps");
//	}
//	@And("Enter userid as (.*)")
//	public void typeUserid(String userid)
//	{
//		driver.findElementById("username").sendKeys("userid");
//	}
//	@And("Enter pswrd as (.*)")
//	public void typePswrd(String pswrd)
//	{
//		driver.findElementById("password").sendKeys("pswrd");
//	}
//	@And("click button")
//	public void button()
//	{
//		driver.findElementByClassName("decorativeSubmit").click();
//	}
//	@And("verify login")
//	public void verifyLogin() {
//		String title = driver.getTitle();
//		if(title.contains("Leaftaps - TestLeaf Automation Platform"))
//		{
//			System.out.println("Verified");
//		}
//		else
//			System.out.println("Unsuccessful");
//	}
//	@And("click CRM")
//	public void cliCRM()
//	{
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//	@And("click Lead Button")
//	public void cliLeads()
//	{
//		driver.findElementByLinkText("Leads").click();
//	}
//	@And("click find Leads")
//	public void cliFindL()
//	{
//		driver.findElementByLinkText("Find Leads").click();
//	}
//	@And("Enter fName as (.*)")
//	public void typeFname(String fname)
//	{
//		driver.findElementByName("firstName").sendKeys(fname);
//	}
//	@And("click finding leads")
//	public void cliFindB()
//	{
//		driver.findElementByLinkText("Find Leads").click();
//	}
//	@And("click on first result")
//	public void cliResult()
//	{
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//	}
//	@And("click Edit")
//	public void cliEdit()
//	{
//		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[3]").click();
//	}
//	@And("Enter companyName to change (.*)")
//	public void typeComName(String cName)
//	{
//		driver.findElementById("updateLeadForm_companyName").clear();
//		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
//		driver.findElementByXPath("//input[@value='Update']").click();
//		
//	}
//	@And("Verity the Update")
//	public void verifyUpdate(String cName)
//	{
//		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
//		if(text.contains(cName))
//		{
//			System.out.println("Updated succesful");
//		}
//	}
//	@And("quit browser")
//	public void quit()
//	{
//		driver.close();
//	}
//
//	
//}
