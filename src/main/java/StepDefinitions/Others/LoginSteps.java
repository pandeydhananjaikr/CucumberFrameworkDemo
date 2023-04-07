package StepDefinitions.Others;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on Login Page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user enters username and password");
    }
    @When("clicks on Login button")
    public void clicks_on_login_button() {
        System.out.println("clicks on Login button");

    }
    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        System.out.println("user is navigated to homepage");
    }

}
