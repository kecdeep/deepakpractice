package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src\\test\\java\\Feature\\ClickView.feature","src\\test\\java\\Feature\\Gesture.feature"}
,glue={"stepdefination","utility"}
,plugin = {"pretty", "html:target/cucumber"}
//,tags ={"@appium"}

)
@Test
public class Runner extends AbstractTestNGCucumberTests{

}











