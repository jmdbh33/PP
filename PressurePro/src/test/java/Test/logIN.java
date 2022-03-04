package Test;

import org.testng.annotations.Test;

import BuisnessLib.LogIn_Validate;
import GenericLib.baseClass;
import junit.framework.Assert;

public class logIN extends baseClass {
  @Test
  public void logInTest() throws InterruptedException {
	  
	  openBrowser("chrome");
	  getUrl("https://staging.administrator.pressurepro.us/index.php/admin/login");
	 
	 Assert.assertEquals(true, LogIn_Validate.logInVerify());
//hello i am jayesh.....how r u
	  
	  
  }
}
