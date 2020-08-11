package Ashwil_mavenGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMaven {
	
	@Test
	public void myTestcase()
	{
		System.out.println("myTestcase");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://facebook.com");
		driver.navigate().forward();
		driver.navigate().back();
		
		System.out.println( driver.getTitle()+ "\n"+ driver.getCurrentUrl());
	}

}
