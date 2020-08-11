package Ashwil_mavenGroup;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.DebugGraphics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



import repository.UAN_Login;

public class Demo {
	

	public void test() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwil\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		// Chrome in debugging mode
		// chrome.exe -remote-debugging-port=9014 --user-data-dir="C:\Users\Ashwil\Documents\ChromeTemp"
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("debuggerAddress", "localhost:9014");
		WebDriver driver = new ChromeDriver(option); 
		
		Thread.sleep(3000);	
		int First;
		int Second;
		List<WebElement> eleList = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		Actions act = new Actions(driver);
		for (int j=0;j<(eleList.size()-1);j++)
		{
			for(int i=0;i<(eleList.size()-1);i++)
			{
				List<WebElement> eleList1 = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
				First = Integer.valueOf(eleList1.get(i).getText().replace("Item ", "").trim());
				Second = Integer.valueOf(eleList1.get(i+1).getText().replace("Item ", "").trim());
				
				if(First < Second)
				{
					act.dragAndDrop(eleList1.get(i+1), eleList1.get(i)).build().perform();
				}
			}
		}
		
		
		/*
		WebDriver driver= new ChromeDriver();
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		Thread.sleep(3000);		
		UAN_Login ULpage = new UAN_Login(driver);
		ULpage.Username().sendKeys("100528715105");
		ULpage.Password().sendKeys("Ashwil@033");
		
		*/
		
		
		/*

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		Dimension d = new Dimension(800,450);
		driver.manage().window().setSize(d);

		//Point poi = new Point(850,250);
		//driver.manage().window().setPosition(poi);
		 * */
		

		//String Reverse
		/*
		String strNewString = "Ashwil is in Bangalore";
	
		String strReverseString = "";
		
		for(int i=0; i<strNewString.length(); i++) {
			strReverseString = strNewString.charAt(i) + strReverseString;
		}
		System.out.println(strReverseString);
		
		
		StringBuilder stringBuild = new StringBuilder(strNewString);
		StringBuilder strReverse = stringBuild.reverse();
		System.out.println(strReverse);
		
		//String sorting
		char[] chrArray = strNewString.toCharArray();
		Arrays.sort(chrArray);
		System.out.println(chrArray.clone());
			
		
		String strInput = "avinashvi";
		for(int i=1;i<strInput.length();i++) {			
			String strChar= Character.toString(strInput.charAt(i)); //Convert character to string
			String strSubString = strInput.substring(i+1); //derive substring
			if(strSubString.contains(strChar)) {
				continue;
			}
			else {
				System.out.println("The first non repeated char is " + strChar);
				break;
			}
		}
		
		*/
		
		
	}
}


class ClassB{
	public void test1(){
		System.out.println("ClassB");
	}	
}

class ClassA extends ClassB{	
	public void test1() {		
		System.out.println("ClassA");		
	}
}
	
class ClassC {
	@Test
	public void test2() {
		ClassB test = new ClassA();
		test.test1();		
	}	
}
