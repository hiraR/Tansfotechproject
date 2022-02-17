package step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TuitionandFinancingTest {
	WebDriver driver;
	
	@Given("user launches Transfotech HomePage")
	public void user_launches_transfotech_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mraha\\Downloads\\chromedriver_win32 new\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://transfotechacademy.com");
			} 

	@And("user lands on to homepage")
	public void user_lands_on_to_homepage() {
	    	 Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy");  
	     }

	@When("user clicks on the “Tuition & Financing” link")
	public void user_clicks_on_the_tuition_financing_link() {
	    driver.findElement(By.linkText("Tuition & Financing")).click();
	}
	
	@And("user will land on “Tuition & Financing” page")
	public void user_will_land_on_tuition_financing_page() {
		Assert.assertEquals(driver.getTitle(), "Tuition & Financing | Transfotech Academy");
		WebElement PageTitletext =driver.findElement(By.xpath("//*[@id='content']/div/div/div/section"
				+ "[1]/div[2]/div/div/div/div/h2"));
		PageTitletext.getText().trim();
	}
	
	@And("user should see payment options")
	public void user_should_see_payment_options() {
	 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/section"
				+ "[3]/div/div/div/section/div/div[2]/div/div/div/div/div/div[2]/h3\r\n")).getText().trim();	
	}

	@Then("user will select Income share Agreement contact Now option")
	public void user_will_select_income_share_agreement_contact_now_option() {
	    driver.findElement(By.xpath("//*[@id='content']/div/div/div/section[3]/div/div/div/"
	    		+ "section/div/div[2]/div/div/div/div/div/div[2]/div/div/a")).click();
	}

	@And("user lands to Contact Us page")
	public void user_lands_to_contact_us_page() {
		Assert.assertEquals(driver.getTitle(), "Contact Us | Transfotech Academy");
		
		driver.close();   
	}
	

}
