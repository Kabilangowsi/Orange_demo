package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_orange.Base_class;

public class Pom_1 extends Base_class {
	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement user;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement pass;
	@FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-login-action']/child::button")
	private WebElement log;

	public Pom_1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

}
