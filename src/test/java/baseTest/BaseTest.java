package baseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseTest {
	private static WebDriver driver;
	public void setAappium() throws MalformedURLException{
		// TODO Auto-generated method stub
		 File appDir = new File("App");
	    File app = new File(appDir, "ApiDemos-debug.apk");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "DeepakMobile");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	   driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
}
