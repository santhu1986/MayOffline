package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\OnlineAprilEvng\\Ebanking\\src\\feature\\Login.feature",
		                    "D:\\OnlineAprilEvng\\Ebanking\\src\\feature\\Role.feature"},
                      glue="stepdefination",monochrome=true,
                      plugin= {"pretty","json:Target/Role/Roleresult.json"})
public class Loginrunner
{

}
