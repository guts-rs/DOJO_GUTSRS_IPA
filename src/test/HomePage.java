package test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;

	    assertEquals("Twitter", driver.getTitle());
	}
	
	By locatorTextTweet=  By.id("tweet-box-mini-home-profile");
	By locatorBtnEnviaTweet = By.xpath("//*[@class='btn primary-btn tweet-action']");
	By locatorDivMsg	= By.className("message-text");
	By locatorFirstTweet= By.cssSelector("p.js-tweet-text.tweet-text");
	
	public HomePage escreveTweet(String msg){
		driver.findElement(locatorTextTweet).click();
	    driver.findElement(locatorTextTweet).sendKeys(msg);
	    return this;
	}
	public HomePage enviaTweet(){
		driver.findElement(locatorBtnEnviaTweet).click();
		return this;
	}
	public String getMsg(){
	    while (!driver.findElement(locatorDivMsg).isDisplayed()){

            try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		return driver.findElement(locatorDivMsg).getText();
	}
	public String getFirstTweet(){
		return driver.findElement(locatorFirstTweet).getText();
	}

}
