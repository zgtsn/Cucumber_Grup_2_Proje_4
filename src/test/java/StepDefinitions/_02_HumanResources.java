package StepDefinitions;

import Pages.TemplateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_HumanResources {
    TemplateContent templateContent = new TemplateContent();

    @Given("^Navigate to Salary$")
    public void navigateToSalary() {

        templateContent.findElementAndClickFunction("humanResources");
        templateContent.findElementAndClickFunction("hrSetUp");
        templateContent.findElementAndClickFunction("hrPositionSalary");
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

    }

    @When("^Create new salary position \"([^\"]*)\"$")
    public void createNewSalaryPosition(String arg0)  {
        templateContent.findElementAndClickFunction("addButton");
        templateContent.findElementAndSendKeysFunction("salaryName", arg0); //name yerine isim yazdığımızda feature sayfasında istediğimiz isim değişikliğini yapabiliriz 'arg0' sayesinde
        templateContent.findElementAndClickFunction("saveButton");

    }

    @When("^Delete salary position \"([^\"]*)\"$")
    public void deleteSalaryPosition(String arg0) {
        templateContent.editAndDeleteFunction(arg0,"Delete");
        templateContent.findElementAndClickFunction("yesButton");

    }


    @When("^Edit salary position \"([^\"]*)\" \"([^\"]*)\"$")
    public void editSalaryPosition(String arg0, String arg1){
        templateContent.editAndDeleteFunction(arg0,"edit");
        templateContent.findElementAndSendKeysFunction("salaryName",arg1);
        templateContent.findElementAndClickFunction("saveButton");

    }
}
