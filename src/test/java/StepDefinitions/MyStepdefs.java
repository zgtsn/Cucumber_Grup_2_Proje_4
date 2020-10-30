package StepDefinitions;

import Pages.TemplateContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    TemplateContent templateContent=new TemplateContent();

    @Given("^Login$")
    public void login() {
      templateContent.findElementAndSelectOption("username","username");
    }

    @And("^Navigate to Basqar$")
    public void navigateToBasqar() {
    }
}
