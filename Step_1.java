package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base_orange.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.Pom_1;

public class Step_1 extends Base_class {
	public static Pom_1 a = new Pom_1(driver);

	@Given(": User should Enter the valid Username{string}")
	public void user_should_enter_the_valid_username_admin(String username) {
		send(a.getUser(), username);
		System.out.println(username);

	}

	@Given(": user should pass URl")
	public void user_should_pass_u_rl() {
		passurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given(": user should Enter the valid password{string}")
	public void user_should_enter_the_valid_password_password(String password) {

		send(a.getPass(), password);
		System.out.println(password);
	}

	@Then(": user should click the login button")
	public void user_should_click_the_login_button() {
		mouse(a.getLog());
		System.out.println("click");

	}

	@Then(": It will navigate to the Home page")
	public void it_will_navigate_to_the_home_page() {
		System.out.println("Login sucessfully");

	}

	@Given(": user should Enter the username{string}")
	public void user_should_enter_the_username_admin(String username) {
		send(a.getUser(), username);
		System.out.println(username);

	}

	@Given(": User should enter the password{string}")
	public void user_should_enter_the_password_admin1234(String password) {
		send(a.getPass(), password);
		System.out.println(password);

	}

	@Then(": It will show the error poup-message")
	public void it_will_show_the_error_poup_message() {
		System.out.println("It shows error poup-message");

	}

}
