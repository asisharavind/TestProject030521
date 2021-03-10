package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorld {
	
	@Test
	public void testHelloWorld() {
		
		System.out.println("Hello World");
		System.out.println("Hello Asish Aravind");
		System.out.println("Hello Automation-0308");
		System.out.println("Hello Automation-0309");
		
		//driver.get(System.getProperty("url"));
		WebDriver driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
	}

}
