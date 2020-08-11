package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UAN_Login {
	WebDriver driver;
	public UAN_Login(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="userName")
	WebElement Username;
	
	@FindBy (id="password")
	WebElement Password;
	
	
	public WebElement Username()
	{
		return Username;
	}
	
	public WebElement Password()
	{
		return Password;
	}

}
