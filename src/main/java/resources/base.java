package resources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base
{

	public static WebDriver driver;
	public static Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\demo_Intelegencia_my_workspace\\Redmine_workspace\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);


		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay.tiwari\\Downloads\\chromedriver_win32.exe");
			WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

			
		
			

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			//WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
		

	}
	
	public void getscreenshots(String result) throws IOException
	{
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtil.copyFile(src,new File("C:\\testscr\\"+result+"screenshoot.png") );
	}

}
