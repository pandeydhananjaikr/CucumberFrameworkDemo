//package StepsForHooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class HooksDemoSteps {
//    WebDriver driver;
//
//   // @BeforeStep
//    public void beforeSteps(){
//        System.out.println("I am inside beforestep");
//    }
//  //  @AfterStep
//    public void aterSteps(){
//        System.out.println("I am inside Afterstep");
//    }
//
//    @Before("@smoke")
//    public void browserSetup() throws InterruptedException {
//        System.out.println("I am inside Browser setup");
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
//        driver.get("https://www.google.com");
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Before()
//    public void browserSetup2() throws InterruptedException {
//        System.out.println("I am inside Browser setup - 2 ");
//    }
//    @After(order = 1)
//    public void tearDown(){
//        System.out.println("I am inside teardown");
//            driver.close();
//            driver.quit();
//        }
//    @After(order = 0)
//    public void tearDown2(){
//        System.out.println("I am inside teardown- 2");
//        driver.close();
//        driver.quit();
//        }
//
//     @Given("if the user is on the login page")
//    public void if_the_user_is_on_the_login_page() {
//
//    }
//    @When("the user enters valid username and password")
//    public void the_user_enters_valid_username_and_password() {
//
//    }
//    @When("click on the Login button")
//    public void click_on_the_login_button() {
//
//    }
//    @Then("the user will be navigated to homepage")
//    public void the_user_will_be_navigated_to_homepage() {
//
//    }
//}
