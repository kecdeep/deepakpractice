package utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseHook {
private static WebDriver driver;


@Before("@web")
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}


@Before("@appium")
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

@After
public void tearDown()
{
	driver.quit();
}
public static WebDriver getDriver()
{
	return driver;
}
}
