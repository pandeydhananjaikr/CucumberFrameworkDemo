package pages;

import StepDefinitions.POM.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    WebDriver driver ;
    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    public static By login_button = By.id("login");

    public LoginPage enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
        return this;

    }
    public LoginPage enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
        return this;

    }
    public void  clickLogin(){
        driver.findElement(login_button).click();

    }


}
