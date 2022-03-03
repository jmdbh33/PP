package BuisnessLib;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;

import GenericLib.baseClass;
import GenericLib.common;
import ObjectRepository.logIn_Object;

public class LogIn_Validate extends baseClass {

	
	public static boolean logInVerify() throws InterruptedException {
		
	logIn_Object lo=PageFactory.initElements(driver, logIn_Object.class);
	
		lo.getName().sendKeys(common.id);
		lo.getPwd().sendKeys(common.pwd);
		lo.getLogInBtn().click();
		
		Thread.sleep(5000);
		
		if (driver.getCurrentUrl().equalsIgnoreCase("https://staging.administrator.pressurepro.us/admin/customer")) {
			
			return true;
			
		}
		return false;
		
		
		
	}

}
