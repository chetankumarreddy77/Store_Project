package Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Login;
import Page.Logout;
import Page.Store;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def {

	WebDriver driver;
	
	Reporters R1;
	
	Login LP;
	Store SP;
	Logout LG;
	
	

	@Given("user Launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		R1 = new Reporters();
		R1.CreateHTMLReport("Store_Report");
	}
	@When("user enter the url {string}")
	public void user_enter_the_url(String url) {
		LP = new Login();
		LP.driver(driver,R1);
		LP.user_enter_the_url(url);
	}
	@When("user click the Login Button")
	public void user_click_the_login_button() throws InterruptedException {
		LP.user_click_the_login_button();
	}
	@Then("user enter the login Credentials after enter the details click Login button")
	public void user_enter_the_login_credentials_after_enter_the_details_click_login_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		
//		List<Map<String, String>> LoginDetails = dataTable.asMaps(String.class, String.class);
//
//		String Id = LoginDetails.get(0).get("Username");
//		String pass = LoginDetails.get(0).get("Password");
//
//		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(Id);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(pass);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
//		Thread.sleep(2000);
		
		LP.user_enter_the_login_credentials_after_enter_the_details_click_login_button(dataTable);

	}
	@Then("user choose the phone and add to the cart and click the cart button")
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
		SP = new Store();
		SP.driver(driver,R1);
		SP.user_choose_the_phone_and_add_to_the_cart_and_click_the_cart_button();
	}
	@When("user click place the order and give the user details and you can click the purchase button")
	public void user_click_place_the_order_and_give_the_user_details_and_you_can_click_the_purchase_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		SP.user_click_place_the_order_and_give_the_user_details_and_you_can_click_the_purchase_button(dataTable);
		
		
		
		
//		List<Map<String,String>> userDetails = dataTable.asMaps(String.class, String.class);
//
//		for(int i=0; i<userDetails.size(); i++) {
//
//			String name = userDetails.get(i).get("Name");
//			String country = userDetails.get(i).get("Country");
//			String city = userDetails.get(i).get("City");
//			String creditCard= userDetails.get(i).get("CreditCard");
//			String month = userDetails.get(i).get("Month");
//			String year = userDetails.get(i).get("Year");
//
//
//			driver.findElement(By.id("itemc")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
//			Thread.sleep(3000);
//
//			Alert alert = driver.switchTo().alert();
//			System.out.println("Alert text: " + alert.getText());
//			alert.accept();
//			driver.switchTo().defaultContent();
//			Thread.sleep(1000); 
//
//			driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
//			Thread.sleep(2000);
//
//
//
//
//			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys(country);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys(creditCard);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys(month);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys(year);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
//			Thread.sleep(2000);
//			
//			
//			
//			
//			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//			Thread.sleep(2000);
		
//	        }
		
}



	@When("user can place the order successfully")
	public void user_can_place_the_order_successfully() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//		Thread.sleep(2000);
		SP.user_can_place_the_order_successfully();

	}
	@Then("user exit from browser")
	public void user_exit_from_browser() {
//		driver.quit();
		LG = new Logout();
		LG.driver(driver,R1);
		LG.user_exit_from_browser();

	}


}
