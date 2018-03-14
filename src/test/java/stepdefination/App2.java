package stepdefination;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import utility.BaseHook;

public class App2 {
	TouchAction t ;
	private static WebDriver driver;
	public App2(){
		this.driver=BaseHook.getDriver();
	}
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		   Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).isDisplayed());   

	}

	@When("^I tap on Expandable Lists$")
	public void i_tap_on_Expandable_Lists() throws Throwable {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	}

	@Then("^I click Custom Adapter$")
	public void i_click_Custom_Adapter() throws Throwable {
		//Tap
				TouchAction t =new TouchAction((MobileDriver) driver);
				t.tap(driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"))).perform();
	}

	/*@Then("^I click People Names and get Title$")
	public void i_click_People_Names_and_get_Title() throws Throwable {
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		  t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(3000).release().perform();
//t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(3000).release().perform();
System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
	}*/


}

