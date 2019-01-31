//package WebApplication;
//
////import static org.testng.Assert.assertTrue;
//
////import java.io.IOException;
//
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import junit.framework.Assert;
//import pageObject.LandingPage;
//import resources.base;
//
//public class ValidationTest extends base
//
//{
//	@BeforeTest
//	//public void urlcode() throws IOException {
//		driver = initializeDriver();
//		String url = prop.getProperty("url");
//		driver.get(url);
//		driver.manage().window().maximize();
//	}
//
//	@Test
//	public void basepagenavigation() throws IOException, InterruptedException {
//
//		 
//		LandingPage lo = new LandingPage(driver);
//	//	Assert.assertTrue(lo.titleverified().isDisplayed());
//	//	Assert.assertEquals(lo.gttext().getText(), "FEATURED COURSES");
//
//	}
//
//	@AfterTest
//	public void getclose() {
//		driver.close();
//	}
//
//}
