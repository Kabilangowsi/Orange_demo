package runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base_orange.Base_class;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Software_testing\\Kabilan_selenium\\Project_orange\\Feature\\admin.feature", 
glue = "step_definition")

public class Runner_class extends Base_class {

	@BeforeClass
	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		chrome();
		implict();

	}

}
