package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	public WebElement login;
	
	@FindBy(id="Email")
	public WebElement usename;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginbutton;
	
	


}
