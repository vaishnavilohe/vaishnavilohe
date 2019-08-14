package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	public addtocart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Apparel & Shoes")
	public WebElement apprealshoes;
	
	@FindBy(linkText="Casual Golf Belt")
	public WebElement casual;
	
	@FindBy(id="addtocart_40_EnteredQuantity")
	public WebElement quantity;
	
	@FindBy(id="add-to-cart-button-40")
	public WebElement addtocart;
	
	@FindBy(className="cart-label")
	public WebElement cart;


}
