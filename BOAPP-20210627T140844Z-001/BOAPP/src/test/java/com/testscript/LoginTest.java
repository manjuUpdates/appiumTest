package com.testscript;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

import com.basefunctions.BaseClass;
import com.basefunctions.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.page.utils.LoginUtil;
import com.pom.LoginPage;
import com.thoughtworks.selenium.webdriven.commands.CaptureScreenshotToString;

import io.appium.java_client.TouchAction;


public class LoginTest extends BaseClass{
	
	
	@Test
	public void appLogin(){
		try{
			
			LoginUtil loginutil = new LoginUtil();
			loginutil.appLogin();
			
			login.HomePage_BookBus_Button.click();
			Thread.sleep(2000);
			login.Homepage_Source_txtBox.click();
			Thread.sleep(4000);
			login.EnterCityName_txtBox.sendKeys("Bangalore");
			Thread.sleep(4000);
			TouchAction tc=new TouchAction(driver);
			tc.tap(0,208 ).perform();
			//login.selectCity.get(0).click();
		//	Thread.sleep(1000);
/*			List<WebElement> text=login.selectCity;			
*/			//Thread.sleep(2000);

			/*Iterator it=text.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}*/
			/*String[] city=new String[text.size()];
			int i=0;
			for(WebElement a: text){
				Thread.sleep(2000);
				city[i]=a.getText();
				i++;
				System.out.println(city[i]);
				Thread.sleep(2000);
				if(city[i]=="Bangalore"){
					login.selectCity.get(i).click();
				}
		}*/
		
			Thread.sleep(4000);
			login.Homepage_Destination_txtBox.click();
			Thread.sleep(4000);
			login.EnterCityName_txtBox.sendKeys("Davanagere");
            Thread.sleep(3000);
			TouchAction tc1=new TouchAction(driver);
			tc1.tap(0,208 ).perform();
			Thread.sleep(3000);
			login.DateLayout_btn.click();
			Thread.sleep(2000);
            login.SelectDate_btn.click();
			Thread.sleep(2000);
            login.SearchBus_btn.click();
			Thread.sleep(5000);
			TouchAction tc2=new TouchAction(driver);
			tc2.tap(0,354).perform();
			Thread.sleep(2000);
			login.selectService.click();
			Thread.sleep(6000);
            login.selectSeat.get(0).click();
			Thread.sleep(2000);
			String seatNumber=login.getSeatNumber.getText();
			System.out.println(seatNumber);
			Thread.sleep(1000);
			String Fare=login.getFare.getText();
			System.out.println(Fare);
			Thread.sleep(1000);
			login.clickOnNextBtn.click();
			Thread.sleep(3000);
			login.selectBP.click();
			/*TouchAction tc3=new TouchAction(driver);
			tc3.tap(32,192).perform();*/
			Thread.sleep(4000);
			login.CustomerEmailTextBox.sendKeys("manjuvani.a@redbus.com");
			Thread.sleep(1000);
			login.CustomerPhoneTextBox.sendKeys("9535026226");
			Thread.sleep(1000);
			login.PassengerNameTextBox.sendKeys("test redbus");
			Thread.sleep(1000);
			login.PassengerAgeTextBox.sendKeys("25");
			Thread.sleep(1000);
			login.SelectGender.click();
			Thread.sleep(1000);
			GenericLib.hideKeypad();
			Thread.sleep(1000);
			login.EnterNotes.sendKeys("test");
			Thread.sleep(1000);
			login.ProceedToPayButton.click();
			Thread.sleep(2000);
	}catch(Exception e){
			e.printStackTrace();
		}
	}

}
