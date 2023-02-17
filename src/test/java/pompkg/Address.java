package pompkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepkg.baseamznclass;

public class Address extends baseamznclass{
	
	

     @FindBy(css="#nav-link-accountList")
     WebElement hellosignin;
     
     @FindBy(css="#nav-flyout-ya-signin > a > span")
     WebElement signin;
     
     @FindBy(id="ap_email")
     WebElement signinemail;
     
     @FindBy(id="continue")
     WebElement signincontbtn;
     
     @FindBy(id="ap_password")
     WebElement signinpwd;
     
     @FindBy(id="signInSubmit")
     WebElement signinpwdbtn;
     
	
	 @FindBy(css="body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-t1.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-section:nth-child(31) div.a-section.a-spacing-medium.a-text-left.address-narrow-container-desktop:nth-child(1) div.a-section:nth-child(2) div.a-section.celwidget:nth-child(1) div.a-row:nth-child(1) div.a-input-text-group.a-spacing-medium.a-spacing-top-medium div.a-section.a-spacing-micro.adddress-ui-widgets-form-field-container.address-ui-widgets-desktop-form-field:nth-child(2) span.a-dropdown-container span.a-button.a-button-dropdown.a-spacing-none.address-ui-widgets-desktop-form-field-full-width span.a-button-inner > span.a-button-text.a-declarative")
	 WebElement countrydrpdwn;
	 
	 @FindBy(id="address-ui-widgets-enterAddressFullName")
	 WebElement fullname;
	 
	 @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	 WebElement phonenumber;
	 
	 @FindBy(id="address-ui-widgets-enterAddressLine1")
	 WebElement adressline1;
	 
	 @FindBy(id="address-ui-widgets-enterAddressLine2")
	 WebElement addressline2;
	 
	 @FindBy(id="address-ui-widgets-enterAddressCity")
	 WebElement city;
	 
	 @FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span")
	 WebElement provincedrpdwn;
	 
	 @FindBy(id="address-ui-widgets-enterAddressPostalCode")
	 WebElement postalcode;
	 
	 @FindBy(id="address-ui-widgets-use-as-my-default")
	 WebElement makeadddefault;
	
	 @FindBy(id="address-ui-widgets-form-submit-button-announce")
	 WebElement addbtn;
	
	

public Address() {
	PageFactory.initElements(driver, this);
	
}
public void hellosignin() {
	Actions act1= new Actions(driver);
		act1.moveToElement(hellosignin).build().perform();	
}
public void clicksigninbtn() {
	Actions act2 = new Actions(driver);
	act2.moveToElement(signin).click().build().perform();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	
}

public void enteremail() {
	signinemail.sendKeys("singh058jaspreet@gmail.com");
	
}
public void clickcontinuebutton() {
	signincontbtn.click();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
}
public void enterpassword() {
	signinpwd.sendKeys("Luvualot1@");
	
}
public void clicksigninbutton() {
	signinpwdbtn.click();
}


public void navigatetoaddress() {
	driver.navigate().to("https://www.amazon.ca/a/addresses/add?ref=ya_address_book_add_button");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
}

public void countrydropdown() {
	Select sel= new Select(countrydrpdwn);
			sel.selectByVisibleText("canada");
}
public void typename() {
	fullname.sendKeys("jaspreet");
}

public void typephonenumber() {
	phonenumber.sendKeys("6475440735");
}
public void typeaddress1() {
	adressline1.sendKeys("375 castlemore road");
}
public void typeaddress2() {
	addressline2.sendKeys("brampton road ");
}

public void typecity() {
	city.sendKeys("toronto");
}

public void provincedropdown() {
	Select sel1= new Select(provincedrpdwn);
	sel1.selectByVisibleText("ontario");
}
public void typepostalcode() {
	postalcode.sendKeys("l6P 1Z9");
}
public void defaultbtn() {
	makeadddefault.click();
}
public void addbutton() {
	addbtn.click();
}






}