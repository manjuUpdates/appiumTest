package com.page.utils;

import static org.testng.Assert.assertTrue;

import com.basefunctions.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.pom.LoginPage;
import com.testscript.Capture;

public class LoginUtil {
	
	public void appLogin(){
		try{
			Thread.sleep(7000);
			LoginPage login=new LoginPage(driver);
			assertTrue(login.LoginPageUsername_txtBox.isDisplayed(), "The boapp username textbox is not displayed");
		   login.LoginPageUsername_txtBox.sendKeys("test_agent13");
			//login.LoginPageUsername_txtBox.sendKeys(GenericLib.getExcelData("logindata", 1,0));
			NXGReports.addStep("Entering username", LogAs.PASSED, new Capture);
			Thread.sleep(3000);
		//	GenericLib.hideKeypad();
			login.LoginPagePassword_txtBox.sendKeys("ss");
			NXGReports.addStep("Entering Password", LogAs.PASSED,null);
			GenericLib.hideKeypad();
			Thread.sleep(1000);
			NXGReports.addStep("click on signin button", LogAs.PASSED,null);
            login.LoginPageSignin_Button.click();
			Thread.sleep(2000);

}
}
}	