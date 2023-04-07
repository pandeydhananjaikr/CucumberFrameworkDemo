package StepDefinitions.POM;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import pages.LoginPage;

public class LoginPageSteps  {
    LoginPage loginpage;
    WebDriver driver;
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        //driver = new EdgeDriver();
        driver.get("https://example.testproject.io/web/");
        Thread.sleep(5000);
    }

    @When("^user entered (.*) and (.*)$")
    public void user_entered_the_username_and_password(String username, String password) throws InterruptedException {
        loginpage = new LoginPage(driver);
        loginpage.enterUsername(username)
                .enterPassword(password);

    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() throws InterruptedException {
        Thread.sleep(3000);
        loginpage.clickLogin();
        }

    @Then("the user is taken to the homepage")
    public void the_user_is_taken_to_the_homepage() {
        driver.quit();
    }
}
