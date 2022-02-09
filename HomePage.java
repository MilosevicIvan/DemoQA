package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement elements;
    WebElement forms;
    WebElement alertsFramesAndWindows;
    WebElement widgets;
    WebElement interactions;
    WebElement bookStore;


    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElements() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]/svg"));
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/svg"));
    }

    public WebElement getAlertsFramesAndWindows() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]/svg/path"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[2]/svg"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]/svg"));
    }

    public WebElement getBookStore() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[2]/svg"));
    }

    //-----------------------------

    public void clickonelements(){
        this.getElements().click();
    }

    public void clickonforms (){
        this.getForms().click();
    }

    public void clickonalertsframesandwindows (){
        this.getAlertsFramesAndWindows().click();
    }

    public void clickonwidgets (){
        this.getWidgets().click();
    }

    public void clickoninteractions (){
        this.getInteractions().click();
    }

    public void clickonbookstore (){
        this.getBookStore().click();
    }
}
