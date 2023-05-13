package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

	WebDriver driver;

@Given("^User Should on Ranford HP$")
public void user_Should_on_Ranford_HP() throws Throwable 
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.4/ranford2");
}

@When("^User Enters \"(.*)\" and \"(.*)\" click on Login$")
public void user_Enters_UserName_Password_and_click_on_Login(String Un,String Pwd) throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
}

@Then("^User Validates Admin Login$")
public void user_Validates_Admin_Login() throws Throwable
{
          String Expval="Welcome to Admin";
          
        String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
			
			//Comparision
			
			if (Expval.equalsIgnoreCase(Actval)) 
			{
				System.out.println("Admin Login Succ");
			}
			else
			{
				System.out.println("Admin Login Failed");
			}
	
}


}
