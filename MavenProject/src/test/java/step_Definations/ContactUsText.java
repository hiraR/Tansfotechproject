package step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsText {
	private static final JavascriptExecutor JavascriptExecutor = null;
	WebDriver driver;
	
	@Given("user launch Transfotech website")
	public void user_launch_transfotech_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mraha\\Downloads\\chromedriver_win32 new\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://transfotechacademy.com"); 
	}

	@And("user lands onto webpage")
	public void user_lands_onto_webpage() {
		 Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy");  
	}

	@When("user scroll to bottom of the page")
	public void user_scroll_to_bottom_of_the_page() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,3500)");
	    Thread.sleep(5000);
	}

	@And("user will see Get in touch information")
	public void user_will_see_get_in_touch_information() {
	driver.findElement(By.xpath("//*[@id='page']/div[3]/section/div/div[4]/div")).getText().trim();
	  
	}

	@Then("to verify user will click on the “Tuition & Financing” link")
	public void to_verify_user_will_click_on_the_tuition_financing_link() {
		 driver.findElement(By.linkText("Tuition & Financing")).click();
	}

	@And("user will scroll to bottom of the page")
	public void user_will_scroll_to_bottom_of_the_page() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,3500)");
	    Thread.sleep(5000);
	}

	@And("user will see Get in touch information is provided here too")
	public void user_will_see_get_in_touch_information_is_provided_here_too() {
		driver.findElement(By.xpath("//*[@id='page']/div[3]/section/div/div[4]/div")).getText().trim();
		
		driver.close();
	}
	
}
