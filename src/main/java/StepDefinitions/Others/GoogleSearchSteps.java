package StepDefinitions.Others;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    @Given("browser is open")
    public void browser_is_open()  {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
    @Given("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.google.com");

    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("q"))
                .sendKeys("Automation Testing in Cucumber");

    }
    @When("hits enter")
    public void hits_enter() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() throws InterruptedException {
        Thread.sleep(3000);
        driver.getPageSource().contains("Cucumber: BDD Testing & Collaboration Tools for Teams");
        driver.close();
        driver.quit();
    }
}
