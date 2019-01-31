package pageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpentTime 
{
WebDriver driver;
	
	By date= By.xpath("//input[@id='time_entry_spent_on']");
	//By log =By.xpath("//a[contains(text(),'Log time')]");
	//By text = By.xpath("//h2[text()='Featured Courses']");
	
	public SpentTime(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement getdate()
	{
		return driver.findElement(date);
	}

}
