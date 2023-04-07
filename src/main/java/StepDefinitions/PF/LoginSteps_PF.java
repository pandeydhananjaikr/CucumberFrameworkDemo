//package StepDefinitions.PF;
//
//import PageFactory.HomePage_PF;
//
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.time.Duration;
//
//public class LoginSteps_PF {
//    WebDriver driver;
//    LoginPage_PF login;
//    HomePage_PF home;
//
//    @Given("the edge browser is open")
//    public void the_edge_browser_is_open() {
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//    }
//    @Given("User is on login page")
//    public void user_is_on_login_page() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("https://example.testproject.io/web/");
//
//    }
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//        login = new LoginPage_PF(driver);
//        login.enterUsername(username);
//        login.enterPassword(password);
//        Thread.sleep(3000);
//       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//    @When("User click on login button")
//    public void user_click_on_login_button() throws InterruptedException {
//        login = new LoginPage_PF(driver);
//        login.clickOnLogin();
//        Thread.sleep(3000);
//    }
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() throws InterruptedException {
//        home = new HomePage_PF(driver);
//        home.checkLogoutIsDisplayed();
//        Thread.sleep(3000);
//        driver.quit();
//
//    }
//
//
//}
