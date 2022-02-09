package Test;

import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFormsPage extends Basepage {

    @BeforeMethod
    public void setUpElements(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void testFormsPage(){
        WebElement forms = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2) > div > div.avatar.mx-auto.white > svg"));
        forms.click();
    }



}
