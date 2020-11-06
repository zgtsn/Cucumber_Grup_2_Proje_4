package StepDefinitions;

import Pages.TemplateContent;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _01_loginStep {
    WebDriver driver;
    TemplateContent templateContent=new TemplateContent();

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {
        templateContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        templateContent.findElementAndSendKeysFunction("password","TechnoStudy123@");
        templateContent.findElementAndClickFunction("loginButton");
        templateContent.findElementAndClickFunction("gotItBtn");

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

    }

}
