package Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement LoginCLK;
	
	@FindBy(xpath="//*[@id=\"loginusername\"]")
	WebElement ID;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement LoginBTN;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	
	
	public void user_click_the_login_button() throws InterruptedException {
		LoginCLK.click();
		Thread.sleep(2000);
	}
	
	public void user_enter_the_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void user_enter_the_login_credentials_after_enter_the_details_click_login_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {

		List<Map<String, String>> LoginDetails = dataTable.asMaps(String.class, String.class);

		String Id = LoginDetails.get(0).get("Username");
		String pass = LoginDetails.get(0).get("Password");

		ID.sendKeys(Id);
		Thread.sleep(2000);
		Password.sendKeys(pass);
		Thread.sleep(2000);
		R1.logger(driver, "Id_Data", "Id_report");
		LoginBTN.click();
		Thread.sleep(2000);

	}

}
