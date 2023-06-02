package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleDetails 
{

	//EP
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RHome;
	
	@FindBy(id="btnRoles")
	WebElement Nrole;
	
	//EM
	
	public void Rhom()
	{
		RHome.click();
	}
	
	public void NewRol()
	{
		Nrole.click();
	}
}
