package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
    @BeforeTest
	public void Login() throws InterruptedException 
	{
	
		//Luanch Firefox
		
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://103.211.39.246/ranford2");
		
		//Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	    RHP.Login();
	    
	}
    
    @Test(dataProvider="Rdata")
    public void RoleCreation(String Rn,String Rt) throws InterruptedException, IOException
    {

	     Thread.sleep(3000);
	    
	     //Role
	     
	    AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	    AHP.Rol();
	    
	    //New Role Button
	    
	    RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
	    RD.NewRol();
	    
	    
	    //Role Creation
	    
	    RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
	    RC.Rcre(Rn,Rt);
	    
	    Thread.sleep(3000);
	    
	    //Alert
	    
	    driver.switchTo().alert().accept();
	   
	    Thread.sleep(3000);
	    
	     //Home
	    
	    RD.Rhom();
	    
	    Thread.sleep(3000);
	    
        
	}
    
    @DataProvider
    
    public Object [][] Rdata()
    {
  	
  	  Object[][] Obj=new Object[3][2];
  	  
  	  Obj[0][0]="Tellerbnk";
  	  Obj[0][1]="E";
  	  
  	  Obj[1][0]="ManagerBnk";
  	  Obj[1][1]="E";
  	  
  	  Obj[2][0]="GenManagerbnk";
  	  Obj[2][1]="E";
  	  
  	  return Obj;
    }

}
