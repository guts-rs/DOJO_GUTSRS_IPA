package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Utils {
	  private boolean acceptNextAlert = true;
	  private boolean isElementPresent(By by, WebDriver driver) {

	    try {

	      driver.findElement(by);

	      return true;

	    } catch (NoSuchElementException e) {

	      return false;

	    }

	  }

	 

	  private boolean isAlertPresent(WebDriver driver) {

	    try {

	      driver.switchTo().alert();

	      return true;

	    } catch (NoAlertPresentException e) {

	      return false;

	    }

	  }

	 

	  private String closeAlertAndGetItsText(WebDriver driver) {

	    try {

	      Alert alert = driver.switchTo().alert();

	      String alertText = alert.getText();

	      if (acceptNextAlert) {

	        alert.accept();

	      } else {

	        alert.dismiss();

	      }

	      return alertText;

	    } finally {

	      acceptNextAlert = true;

	    }

	  }


}
