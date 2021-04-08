package Pack1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
		
	if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asish\\git\\TestProject030521\\MyFirstMavenProject_Asish\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
	}
	
	@Test
	public void testCase1() {
		
		System.out.println("Hello World-Test 1");
		
		driver.get(System.getProperty("url"));
			
		System.out.println("Test 1 complete");
	}
	
	@Test
	public void testCase2() {
		
		System.out.println("Hello World-Test 2");
		
		//driver.get("https://google.com");
			
		System.out.println("Test 2 complete..");
	}
	
	@Test
	public void testCase3() {
		
		System.out.println("Hello World-Test 3");
		System.out.println("test line-03262021");
		
		//driver.get("https://google.com");
			
		System.out.println("Test 3 complete");
		System.out.println("new line_mavenTestNG-04052021");
		System.out.println("pushing code changes to feature branch-first push>040821");
	}
	
	@AfterTest
	public void flush() {
		
		driver.close();
		
	}

}
