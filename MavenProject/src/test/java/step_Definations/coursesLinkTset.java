package step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class coursesLinkTset {
	WebDriver driver;
	
	@Given("user loads application")
	public void user_loads_application() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mraha\\Downloads\\chromedriver_win32 new\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://transfotechacademy.com");
		} 
     @And ("get titel of the page")
     public void get_titel_of_the_page(){
    	 Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy"); 
 		 	 
     }
	@When("user move curser to courses link")
	public void user_move_curser_to_courses_link() {
		driver.findElement(By.partialLinkText("Courses")).click();
	 Actions action = new Actions(driver);
	 WebElement Courseslink = driver.findElement(By.partialLinkText("Courses"));
	 action.moveToElement(Courseslink).build().perform();
}

	@And("user goes to QA Engineering")
	public void user_move_to_QA_Engineering() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("QA Engineering"))).build().perform();  
	}

	@Then("user select QA Engineering")
	public void user_select_qa_engineering() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("QA Engineering"))).build().perform();   
	    action.click().build().perform();
	}
	

	@And("user will land on Full Stack QA Engineering Course page")
	public void user_will_land_full_stack_qa_engineering_course_page() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/section[1]/div[2]"
				+ "/div[1]/div/div[1]/div/h2")).getText().trim(), "Full Stack QA Engineering Course"); 
	
	driver.close();
}
}


