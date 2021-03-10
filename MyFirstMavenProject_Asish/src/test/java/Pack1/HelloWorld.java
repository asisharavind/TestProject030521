package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorld {
	
	@Test
	public void testHelloWorld() {
		
		System.out.println("Hello World");
		System.out.println("Hello Asish Aravind");
		System.out.println("Hello Automation-0308");
		System.out.println("Hello Automation-0309");
		WebDriver driver = null;
		if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asish\\git\\TestProject030521\\MyFirstMavenProject_Asish\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(System.getProperty("url"));
		}

		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\asish\\git\\TestProject030521\\MyFirstMavenProject_Asish\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
			
		System.out.println("Test Complete-Asish Aravind-0310");
	}

}
