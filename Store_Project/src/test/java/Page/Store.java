
package Page;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Store {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="//*[@id=\"itemc\"]") 
	WebElement PhoneNav;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement clickMobile;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	WebElement ADDtoCart;
	
	@FindBy(xpath="//*[@id=\"cartur\"]")
	WebElement Cart;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement PlaceOrder;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement Name;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement Country;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement City;
	
	@FindBy(xpath="//*[@id=\"card\"]")
	WebElement Card;
	
	@FindBy(xpath="//*[@id=\"month\"]")
	WebElement Month;
	
	@FindBy(xpath="//*[@id=\"year\"]")
	WebElement Year;
	
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement Purchase;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	WebElement OrderPlaced;
	
	
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	public void user_click_place_the_order_and_give_the_user_details_and_you_can_click_the_purchase_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		List<Map<String,String>> userDetails = dataTable.asMaps(String.class, String.class);

		for(int i=0; i<userDetails.size(); i++) {

			String name = userDetails.get(i).get("Name");
			String country = userDetails.get(i).get("Country");
			String city = userDetails.get(i).get("City");
			String creditCard= userDetails.get(i).get("CreditCard");
			String month = userDetails.get(i).get("Month");
			String year = userDetails.get(i).get("Year");



			PhoneNav.click();
			Thread.sleep(2000);
			clickMobile.click();
			Thread.sleep(2000);
			ADDtoCart.click();
			Thread.sleep(3000);


			Alert alert = driver.switchTo().alert();
			System.out.println("Alert text: " + alert.getText());
			alert.accept();
			driver.switchTo().defaultContent();
			Thread.sleep(1000);

			Cart.click();
			Thread.sleep(2000);
			R1.logger(driver, "CartDetails", "CartReport");
			PlaceOrder.click();
			Thread.sleep(2000);




			Name.sendKeys(name);
			Thread.sleep(2000);
			Country.sendKeys(country);
			Thread.sleep(2000);
			City.sendKeys(city);
			Thread.sleep(2000);
			Card.sendKeys(creditCard);
			Thread.sleep(2000);
			Month.sendKeys(month);
			Thread.sleep(2000);
			Year.sendKeys(year);
			Thread.sleep(2000);
			R1.logger(driver, "userData", "UserReport");
			Purchase.click();
			Thread.sleep(2000);
			
			
			
			R1.closeReport();
			OrderPlaced.click();
			Thread.sleep(2000);
		}


	}
	
	public void user_choose_the_phone_and_add_to_the_cart_and_click_the_cart_button() throws InterruptedException {
		//		driver.findElement(By.id("itemc")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		//		Thread.sleep(3000);
		//		
		//		Alert alert = driver.switchTo().alert();
		//		System.out.println("Alert text: " + alert.getText());
		//		alert.accept();
		//		driver.switchTo().defaultContent();
		//		Thread.sleep(1000); 
		//
		//		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		//		Thread.sleep(2000);
	
	}
	
	
	public void user_can_place_the_order_successfully() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//		Thread.sleep(2000);

	}

}
