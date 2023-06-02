package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSDef 
{

	WebDriver driver;

@Given("^Tester Should On Ranford HP$")
public void tester_Should_On_Ranford_HP() throws Throwable 
{

    driver=new FirefoxDriver();
	
	//Maximize
	
	driver.manage().window().maximize();
	
	//URL
	
	driver.get("http://103.211.39.246/ranford2");
	
}

@When("^Tester Enter Un and Password click on login$")
public void tester_Enter_Un_and_Password_click_on_login() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("TestingMindq");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
}

@Then("^Tester click on Role button$")
public void tester_click_on_Role_button() throws Throwable 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	
}

@When("^Tester click on New Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_click_on_New_Role_and_enters_and(String Rn, String Rt) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rn);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
}

@When("^Teste Close The Application$")
public void teste_Close_The_Application() throws Throwable 
{
	Thread.sleep(3000);
  driver.close();
}

}
