package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver){
    this.driver = driver;
}

public void open(){
driver.get("https://dashboard.basiq.io/login");
driver.manage().window().maximize();
}
public void setUsername(String userName){
    WebElement username = driver.findElement(By.id("input-email"));
    username.sendKeys(userName);
}
public void setPassword(String passWord){
    WebElement password = driver.findElement(By.id("input-password"));
    password.sendKeys(passWord);
}
public void clickLogin(){
    WebElement clickLoginButton = driver.findElement(By.id("login-btn"));
    clickLoginButton.click();
}
}
