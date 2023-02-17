package basepkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.timeutlis;

public class baseamznclass {
	public static  WebDriver  driver;


	    
	    public baseamznclass() {
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.ca/");
	    }
// 
@SuppressWarnings("deprecation")
public void initiate () {
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(timeutlis.timepage, TimeUnit.SECONDS);
	
}




















}
