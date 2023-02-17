package testLayer;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepkg.baseamznclass;
import pompkg.CreateAcc;


public class testCreateAcc extends baseamznclass {
	CreateAcc obj1;
	// calling parent constructor  which has driver set and url 
	public testCreateAcc() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		
		initiate();
		 obj1= new CreateAcc();
	
	}
	@Test 
	public void gettitle() {
	String actual =obj1.verify();
	System.out.println(actual);
	Assert.assertEquals(actual, "amazon");
	}
	
	@Test
	public void validname() {
		//obj1.hellosignin();
		//obj1.newcustomer();
		obj1.navigation();
		obj1.typename();
		obj1.typenumber();
		obj1.typepassword();
		obj1.typepassagn();
		obj1.continuebutton();
	}
	@AfterMethod
	public void close() {
		//driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
