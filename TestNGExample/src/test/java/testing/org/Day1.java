package testing.org;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day1 {
	@Parameters({"url"})
	@Test
	public void Demo(String url) {
		
		System.out.println(url);
		System.out.println("First Change");
		
	}
	@BeforeClass
	public void Beforeclass()
	{
		
	}
	@Test(groups= {"smoke"})
	public void SecondTest() {
		
		System.out.println("bye");
		
	}

}
