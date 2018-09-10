package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
@Before
public void beforeScenario(Scenario sc)
{
	startResult();
	startTestModule(sc.getName(), sc.getId());
	test = startTestCase(sc.getName());
	test.assignCategory("smoke");
	test.assignAuthor("Karthika");
	startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	
}
@After
public void afterScenario(Scenario sc)
{
	closeAllBrowsers();
	endResult();
}
}
