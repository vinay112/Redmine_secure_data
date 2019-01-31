package WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://redmine.intelegencia.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinay.tiwari");
		;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("intel@04");
		driver.findElement(By.xpath("//input[@value='Login »']")).click();

		Select sel = new Select(driver.findElement(By.id("project_quick_jump_box")));
		sel.selectByVisibleText("GlobeMed");
		driver.findElement(By.xpath("//a[contains(text(),'Log time')]")).click();
		  WebElement dateBox =	driver.findElement(By.name("time_entry[spent_on]"));
		  dateBox.sendKeys("12012018");
		  dateBox.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		  driver.findElement(By.id("time_entry_hours")).sendKeys("09:00");
	       //driver.findElement(arg0);
	}

}
