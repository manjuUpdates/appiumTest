package com.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	public AndroidDriver driver;
	public LoginPage(AndroidDriver idriver){
		this.driver=idriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="redbus.rbpdomestic.android:id/user_name")
	public WebElement LoginPageUsername_txtBox;
	/*
	@androidFindBy(id="redbus.rbpdomestic.android:id/user_name")
	@iOSFindBy(id="iOS ID")
	public WebElement LoginPageUsername_txtBox;
	*/
	
	@FindBy(id="redbus.rbpdomestic.android:id/password")
	public WebElement LoginPagePassword_txtBox;
	
	@FindBy(id="redbus.rbpdomestic.android:id/btn_login")
	public WebElement LoginPageSignin_Button;
	
	@FindBy(name="Book a Bus")
	public WebElement HomePage_BookBus_Button;
	
    @FindBy(name="Source")
    public WebElement Homepage_Source_txtBox;
    
    @FindBy(name="Enter a city")
    public WebElement EnterCityName_txtBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/city_item_txt")
    public List<WebElement> selectCity;
    
    @FindBy(name="Destination")
    public WebElement Homepage_Destination_txtBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/date_layout")
    public WebElement DateLayout_btn;
    
    @FindBy(id="redbus.rbpdomestic.android:id/dates_pane_tommorow")
    public WebElement SelectDate_btn;
    
    @FindBy(id="redbus.rbpdomestic.android:id/home_btn_search")
    public WebElement SearchBus_btn;
    
    @FindBy(id="redbus.rbpdomestic.android:id/bus_details")
    public WebElement selectService;
    
    @FindBy(id="redbus.rbpdomestic.android:id/img_seat")
    public List<WebElement> selectSeat;
    
    @FindBy(id="redbus.rbpdomestic.android:id/seats_label")
    public WebElement getSeatNumber;
    
    @FindBy(id="redbus.rbpdomestic.android:id/fare_text")
    public WebElement getFare;
    
    @FindBy(id="redbus.rbpdomestic.android:id/btn_seat_selected")
    public WebElement clickOnNextBtn;
    
    @FindBy(id="redbus.rbpdomestic.android:id/txt_bp_name")
    public WebElement selectBP;
    
    @FindBy(id="redbus.rbpdomestic.android:id/edt_customer_email")
    public WebElement CustomerEmailTextBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/edt_customer_phone")
    public WebElement CustomerPhoneTextBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/txt_passenger_name")
    public WebElement PassengerNameTextBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/txt_passenger_age")
    public WebElement PassengerAgeTextBox;
    
    @FindBy(id="redbus.rbpdomestic.android:id/gender_female")
    public WebElement SelectGender;
    
    @FindBy(id="redbus.rbpdomestic.android:id/notes_text")
    public WebElement EnterNotes;
    
    @FindBy(id="redbus.rbpdomestic.android:id/pas_btn_pay")
    public WebElement ProceedToPayButton;
    
}
