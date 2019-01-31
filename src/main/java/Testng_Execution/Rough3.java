package Testng_Execution;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rough3 extends Hooks
{
	@Test
	public void R1()
	{
		System.out.println("R1");
	}
	@Test
	public void R2()
	{
		System.out.println("R2");
	}
	@Test
	public void R3()
	{
		System.out.println("R3");
	}
//@BeforeMethod
//	public void R4()
//	{
//		System.out.println("BeforeMethod R4");
//	}
//@AfterMethod
//	public void R5()
//	{
//		System.out.println("AfterMethod R5");
//	}
}
