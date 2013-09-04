package test;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BeforeAfter {
	 protected WebDriver driver;

	  private String baseUrl;

	  

	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before

	  public void setUp() throws Exception {

	    driver = new FirefoxDriver();

	    baseUrl = "https://twitter.com/";

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get(baseUrl);

	  }
	  @After
	  public void tearDown() throws Exception {

		    driver.quit();

		    String verificationErrorString = verificationErrors.toString();

		    if (!"".equals(verificationErrorString)) {

		      fail(verificationErrorString);

		    }

		  }



}
