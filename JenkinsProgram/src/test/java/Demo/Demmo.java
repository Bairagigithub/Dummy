package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demmo {

	
	@Test
	public void m1()
	{
		WebDriver driver;
		
		
	String BROWSER = System.getProperty("browser");
	   String URL = System.getProperty("url");
	   
	   if(BROWSER.equalsIgnoreCase("chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   
	   else if(BROWSER.equalsIgnoreCase("egde"))
	   {
		   driver = new EdgeDriver();
	   }
		
	   driver = new ChromeDriver();
	}
	
	
	
	
}
