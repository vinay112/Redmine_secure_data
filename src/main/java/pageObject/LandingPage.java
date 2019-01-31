package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LandingPage
{
	WebDriver driver;
	
	By project= By.xpath("//select[@id='project_quick_jump_box']");
	By log =By.xpath("//a[contains(text(),'Log time')]");
	//By text = By.xpath("//h2[text()='Featured Courses']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement getProject()
	{
		return driver.findElement(project);
	}
	
	public WebElement getlog()
	{
		return driver.findElement(log);
	}
//	public WebElement gttext()
//	{
//		return driver.findElement(text);
//	}
	
	
}
