package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_orange.Base_class;

public class Pom_2 extends Base_class {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	private WebElement admin;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")

	private WebElement job;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")
	private WebElement js;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")

	private WebElement click;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	private WebElement Title;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	private WebElement Descripition;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
	private WebElement save;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[1]")
	private WebElement cancel;

	public Pom_2(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getDescripition() {
		return Descripition;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSearch() {
		return job;
	}

	public WebElement getJob() {
		return job;
	}

	public WebElement getJs() {
		return js;
	}
}
