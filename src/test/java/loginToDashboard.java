import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class loginToDashboard {

    @Test
    public void logintoDashboard(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.setUsername("aleksa.ivanovic+1@basiq.io");
        loginPage.setPassword("ZGQQiyw-Q!qq.tQM_bLjWq.9");
        loginPage.clickLogin();
        try {
            Thread.sleep(10000); // Sleep for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://dashboard.basiq.io/";
        if (expectedUrl.equals(currentUrl)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILEEDD");
        }
        driver.quit();

    }


}
