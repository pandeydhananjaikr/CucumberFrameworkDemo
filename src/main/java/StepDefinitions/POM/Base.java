package StepDefinitions.POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
    public static WebDriver driver;
    public static WebDriver DriverSetUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }
}
