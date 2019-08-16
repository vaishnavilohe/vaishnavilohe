package newutil;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class casestudyregister extends baseTest{
	
  @Test(dataProvider="dp" , priority=0)
  public void login(String username, String password) throws InterruptedException {
	  logger = extent.createTest("Login Test");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys(username);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  Assert.assertTrue(true);
  }
  
  @Test(priority=1)
  public void order() throws InterruptedException {
	  logger = extent.createTest("order Test");
	  driver.findElement(By.linkText("Apparel & Shoes")).click();
	  driver.findElement(By.linkText("Casual Golf Belt")).click();
	  driver.findElement(By.id("addtocart_40_EnteredQuantity")).clear();
	  driver.findElement(By.id("addtocart_40_EnteredQuantity")).sendKeys("10");
	  driver.findElement(By.id("add-to-cart-button-40")).click();
	  driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
	  Assert.assertEquals(driver.findElement(By.linkText("Casual Golf Belt")).getText(),"Casual Golf Belt");
	  Assert.assertEquals(driver.findElement(By.xpath("//input[starts-with(@name,'itemquantity')]")).getAttribute("value"),"20");
	  driver.findElement(By.id("termsofservice")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkout")).click();
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2)
  public void addtocart() throws InterruptedException {
	  logger = extent.createTest("addtocart Test");
	  driver.findElement(By.xpath("//input[@title='Continue']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("shippingoption_0")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("paymentmethod_2")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("CardholderName")).sendKeys("Barabar Gordan");
	  driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
	  driver.findElement(By.id("ExpireMonth")).sendKeys("04");
	  driver.findElement(By.id("ExpireYear")).sendKeys("2020");
	  driver.findElement(By.id("CardCode")).sendKeys("123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']")).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(true);
  }
  
  @Test(priority=3)
  public void logout() throws InterruptedException {
	  logger = extent.createTest("logout Test");
	  driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='title']//strong")).getText(),"Your order has been successfully processed!");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Log out")).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(true);
  }
	  //Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
	  //Thread.sleep(2000);
	  //country.selectByValue("1");
	  //Select state = new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
	  //Thread.sleep(2000);
	  //country.selectByValue("3");
	  //driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Nagpur");
	  //driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Janki Nagar");
	  //driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("441302");
	  //driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9850414018");
	  //Thread.sleep(2000);
  
}
