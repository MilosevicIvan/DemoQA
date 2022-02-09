package BasePage;

import Pages.ElementsPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Basepage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public ElementsPage elementsPage;


    @BeforeClass
    public void setUp () {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);












    }

    public void scrollMethod (WebElement we) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);
    }


    @AfterClass
    public void tearDown () {
        //driver.close();
        //driver.quit();
    }









}
