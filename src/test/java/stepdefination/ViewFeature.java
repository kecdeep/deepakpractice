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

	public class ViewFeature {
		TouchAction t ;
		private static WebDriver driver;
		public ViewFeature(){
			this.driver=BaseHook.getDriver();
		}
		@Given("^I use the application$")
		public void i_open_the_application() throws Throwable {
			   Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).isDisplayed());   

		}

		@When("^I click on Expandable Lists$")
		public void i_tap_on_Expandable_Lists() throws Throwable {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		}

		

		


	}


