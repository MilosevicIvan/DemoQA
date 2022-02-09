package Test;

import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsPage extends Basepage {


    @BeforeMethod
    public void setUpElements(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test (priority = 10)
    public void verifyThatUsrerCanClickOnAllElements() throws InterruptedException {

        WebElement elements = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg"));
        elements.click();

        /*elementsPage.getTextbox().click();
        elementsPage.getCheckbox().click();
        elementsPage.getRadiobutton().click();
        elementsPage.getWebtables().click();
        elementsPage.getButtons().click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        elementsPage.getlinks().click();
        jse.executeScript("window.scrollBy(0,500)");
        elementsPage.getBrokenlinksimages().click();
        jse.executeScript("window.scrollBy(0,500)");
        elementsPage.getUploadanddownload().click();
        jse.executeScript("window.scrollBy(0,500)");
        elementsPage.getDynamicproperties().click();
*/

    }

    @Test
    public void verifyThatCheckBoxSelectAllChildCheckBoxes () throws InterruptedException {
        WebElement elements = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg"));
        elements.click();

        elementsPage.getCheckbox().click();
        elementsPage.getCheckboxtick().click();
        Thread.sleep(2000);
        Assert.assertFalse(elementsPage.getCheckboxtick().isSelected());
    }

    @Test
    public void verifyThatYesRadioButtonIsSelected(){
        WebElement elements = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg"));
        elements.click();

        elementsPage.getRadiobutton().click();
        elementsPage.getRadiobuttonyes().click();


        elementsPage.getRadiobutton().click();
        elementsPage.getRadiobuttonno().click();
        Assert.assertTrue(elementsPage.getRadiobuttonno().isSelected());


    }








}
