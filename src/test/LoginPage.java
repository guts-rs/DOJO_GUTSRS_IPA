package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By locatorUsername = By.id("signin-email");
	By locatorSenha = By.id("signin-password");
	By locatorBtnEntrar= By.xpath("(//button[@type='submit'])[3]");
	
	public LoginPage escreveUsername(String user){
		driver.findElement(locatorUsername).sendKeys(user);
		return this;
	}
	public LoginPage escreveSenha(String senha){
		driver.findElement(locatorSenha).sendKeys(senha);
		return this;
	}
	public HomePage entrar(){
		driver.findElement(locatorBtnEntrar).click();
		return new HomePage(driver);
	}
	

}
