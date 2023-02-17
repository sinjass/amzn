package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepkg.baseamznclass;
import pompkg.Address;

public class Testaddress extends baseamznclass {

	Address obj2;
	public Testaddress() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup1() {
		initiate();
	 obj2 = new Address();
	}
	@Test
	public void validfullname() {
		obj2.hellosignin();
		obj2.clicksigninbtn();
		obj2.enteremail();
		obj2.clickcontinuebutton();
		obj2.enterpassword();
		obj2.clicksigninbutton();
		obj2.navigatetoaddress();
		obj2.countrydropdown();
		obj2.typename();
		obj2.typephonenumber();
		obj2.typeaddress1();
		obj2.typeaddress2();
		obj2.typecity();
		obj2.provincedropdown();
		obj2.typepostalcode();
		obj2.defaultbtn();
		obj2.addbutton();
			
	}
	
	@AfterMethod
	public void closebrower() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
