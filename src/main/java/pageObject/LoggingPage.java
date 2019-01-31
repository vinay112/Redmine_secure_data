package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggingPage 
{
	WebDriver driver;
	
	By email = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By Loginbutton = By.xpath("//input[@value='Login »']");
 public LoggingPage(WebDriver driver)
 {
	 this.driver = driver;
 }
	
	public WebElement getEmail()
	{
		
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getloginbutton()
	{
		
		return driver.findElement(Loginbutton);
	}
}
