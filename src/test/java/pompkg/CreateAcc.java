package pompkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basepkg.baseamznclass;

public class CreateAcc extends baseamznclass {

    @FindBy(css="#nav-link-accountList")
    WebElement hellosignin;
	
    @FindBy(css="#nav-flyout-ya-newCust > a")
    WebElement starthere;

	@FindBy(id="ap_customer_name")
	WebElement Yourname;
	
	@FindBy(id="ap_email")
	WebElement mobile;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="ap_password_check")
	WebElement passwordagain;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	// initialize webelements 
	
	
	public CreateAcc( ) {
		
		PageFactory.initElements(driver, this);
	}

/*public void hellosignin() {
	Actions act= new Actions(driver);
		act.moveToElement(hellosignin).build().perform();	
}
public void newcustomer() {
Actions act1 =new Actions (driver);
act1.moveToElement(starthere).click().build().perform();; 
	starthere.click(); 
}*/
public void navigation () {
	driver.navigate().to("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
}

	
public void typename() {
	Yourname.sendKeys("jaspreet");
}
	public void typenumber() {
		mobile.sendKeys("647540735");
	}
public void typepassword() {
	password.sendKeys("amazon123");	
}
public void typepassagn() {
	passwordagain.sendKeys("amazon123");
	}
public void continuebutton()  {
	continuebtn.click();
}
public String verify() {
	return driver.getTitle();
}


}


