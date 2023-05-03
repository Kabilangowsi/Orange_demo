package base_orange;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver chrome() {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		return driver;

	}

	public static void fire() {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();

	}

	public static void edge() {
		// TODO Auto-generated method stub
		driver = new EdgeDriver();

	}

	public static void passurl(String URL) {
		// TODO Auto-generated method stub
		driver.get(URL);

	}

	public void min() {
		// TODO Auto-generated method stub
		driver.manage().window().minimize();

	}

	public void max() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();

	}

	public void refresh() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();

	}

	public void title() {
		// TODO Auto-generated method stub
		System.out.println(driver.getTitle());

	}

	public void selectbyindex(WebElement a, int b) {
		// TODO Auto-generated method stub
		Select S = new Select(a);
		S.selectByIndex(b);

	}

	public void Selectbyvalue(WebElement a1, String b1) {
		// TODO Auto-generated method stub
		Select S1 = new Select(a1);
		S1.selectByValue(b1);

	}

	public void selectbyvisible(WebElement a2, String b2) {
		// TODO Auto-generated method stub
		Select S2 = new Select(a2);
		S2.selectByVisibleText(b2);

	}

	public void alert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();

	}

	public void conformalert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();

	}

	public void fframes(int a) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(a);

	}

	public void exitframe() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();

	}

	public void mouse(WebElement s) {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.click(s).build().perform();

	}

	public void keyboard() throws AWTException {
		// TODO Auto-generated method stub
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_TAB);
		b.keyRelease(KeyEvent.VK_TAB);
		b.keyPress(KeyEvent.VK_ENTER);

	}

	public void send(WebElement a, String value) {
		// TODO Auto-generated method stub
		a.sendKeys(value);

	}

	public void text(WebElement a, String value) {
		// TODO Auto-generated method stub
		System.out.println(a.getText());

	}

	public void displayed(WebElement a) {
		// TODO Auto-generated method stub
		System.out.println(a.isDisplayed());

	}

	public void selected(WebElement a) {
		// TODO Auto-generated method stub
		System.out.println(a.isSelected());

	}

	public static void implict() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void exp() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void clickandhold(WebElement s) {
		// TODO Auto-generated method stub
		Actions n = new Actions(driver);
		n.clickAndHold(s).build().perform();
		;

	}

}
