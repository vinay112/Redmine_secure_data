
package WebApplication;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoggingPage;
import resources.base;

class HomePageTest extends base 
{
	LoggingPage log;
	LandingPage lo;
	Select sel;

	@BeforeTest
	public void urlcode() throws IOException, InterruptedException 
	{
		driver = initializeDriver();
		Thread.sleep(2000);

	}


	@Test(dataProvider = "getdata")
	public void basepagenavigation(String username, String password, String text)
			throws IOException, InterruptedException {

		String url = prop.getProperty("url");
		driver.get(url);
        driver.manage().window().maximize();
		log = new LoggingPage(driver);
		log.getEmail().sendKeys(username);
		log.getpassword().sendKeys(password);
		log.getloginbutton().click();
		System.out.println(text);

	}
	@Test(dependsOnMethods= {"basepagenavigation"})
public void getevalidate()
	{
	WebElement  el=	driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		Assert.assertEquals(el.getText(), "FEATURED COURSES");
	}

	@Test(dependsOnMethods = { "basepagenavigation" })
	public void planding() throws InterruptedException
	{
		lo = new LandingPage(driver);
		lo.getProject().click();
		Select sel = new Select(lo.getProject());
		sel.selectByVisibleText("GlobeMed");

	}

	@Test(dependsOnMethods = { "planding" })
	public void pgetlog() throws InterruptedException {
		// lo = new LandingPage(driver);
		lo.getlog().click();
		Thread.sleep(50000);
	}

	@DataProvider
	public Object[][] getdata() throws InterruptedException {

		Object[][] ob1 = new Object[1][3];

		ob1[0][0] = "vinay.tiwari";
		ob1[0][1] = "intel@04";
		ob1[0][2] = "valid";

		return ob1;
	}
	
@Test(dependsOnMethods ="pgetlog")
	public void datadrive() throws NullPointerException, IOException, InterruptedException {

		Excel_class ex = new Excel_class();
		ArrayList<String> a3 = ex.getdata("TimesheetDetails.xlsx");
		int num = a3.size();
		System.out.println(num);
		for (int i = 0; i <num; i++) 
		{
			
			  WebElement dateBox =	driver.findElement(By.name("time_entry[spent_on]"));
			  dateBox.clear();
			  dateBox.sendKeys(a3.get(i));
			  dateBox.sendKeys(Keys.TAB);
			  Thread.sleep(2000);
			WebElement hours=  driver.findElement(By.id("time_entry_hours"));
			  Thread.sleep(2000);
			  hours.clear();
			  hours.sendKeys(a3.get(i+1));
			 
			  Thread.sleep(2000);
			 
				WebElement comments =  driver.findElement(By.id("time_entry_comments"));
				comments.clear();
				comments.sendKeys(a3.get(i+2));
				
			  Select sel1 = new Select(driver.findElement(By.id("time_entry_activity_id")));
			  sel1.selectByVisibleText("QA");
			  System.out.println(a3.get(i));

		}
	}

	@AfterTest
	public void getclose() 
	{
		driver.close();
		driver =null;
	}
	


}
