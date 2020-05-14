package Academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}
	@Test
	
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		pageobjects.LandingPage l=new pageobjects.LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getTitle().getText(), "FEATURED CO123URSES");
		 log.info("Successfully validated Text message");
		 System.out.println("Test completed");
<<<<<<< HEAD
		 // cannot import the code
		 System.out.println("cANNOT FOUND aNY fILES ");
System.out.println("cANNOT FOUND aNY fILES please verify with your team ");
		;
=======
		 System.out.println("Test completed please verify with Co");
		 System.out.println("Test completed please verify with Co Almost done with oracle");
	
>>>>>>> cfdf5e985e2b8f88c3620ec1f90f825075bf9f04
	
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}
}
