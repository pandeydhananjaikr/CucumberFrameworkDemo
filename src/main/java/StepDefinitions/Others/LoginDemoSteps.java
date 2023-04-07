//package StepDefinitions.Others;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.time.Duration;
//
//public class LoginDemoSteps {
//    WebDriver driver;
//
//    @Given("edge browser is open")
//    public void edge_browser_is_open() {
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
//    public void user_enters_dhananjai_and(String username, String password) throws InterruptedException {
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }
//    @When("User click on login button")
//    public void user_click_on_login_button() {
//        driver.findElement(By.id("login")).click();
//
//    }
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() {
//        driver.quit();
//
//    }
//
//
//}
