package Testng_Execution;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rough2 extends Hooks
{
	@Test
	public void R12()
	{
		System.out.println("R12");
	}
	@Test
	public void R22()
	{
		System.out.println("R22");
	}
	@Test
	public void R32()
	{
		System.out.println("R32");
	}
//@BeforeMethod
//	public void R42()
//	{
//		System.out.println("BeforeMethod R42");
//	}
//@AfterMethod
//	public void R5()
//	{
//		System.out.println("AfterMethod R5");
//	}
}
