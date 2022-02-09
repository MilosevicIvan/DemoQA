package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage{

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement elementsdropdown;
    WebElement textbox;
    WebElement checkbox;
    WebElement radiobutton;
    WebElement webtables;
    WebElement buttons;
    WebElement links;
    WebElement brokenlinksimages;
    WebElement uploadanddownload;
    WebElement dynamicproperties;
    WebElement checkboxtick;
    WebElement radiobuttonyes;
    WebElement radiobuttonno;


    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElementsdropdown() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(1) > div"));
    }

    public WebElement getTextbox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckbox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadiobutton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebtables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getlinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenlinksimages() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadanddownload() {
        return driver.findElement(By.id("item-7"));
    }

    public WebElement getDynamicproperties() {
        return driver.findElement(By.id("item-8"));
    }

    public WebElement getCheckboxtick() {
        return driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
    }

    public WebElement getRadiobuttonyes() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
    }

    public WebElement getRadiobuttonno() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
    }

    //---------------------------------------------

    public void clickonelementsdropdown(){
        this.getElementsdropdown().click();
    }

    public void clickontextbox(){
        this.getTextbox().click();
    }

    public void clickoncheckbox (){
        this.getCheckbox().click();

    }

    public void clickonradiobutton(){
        this.getRadiobutton().click();
    }

    public void clickonwebtables(){
        this.getWebtables().click();
    }

    public void clickonbuttons(){
        this.getButtons().click();
    }

    public void clickonlinks(){
        this.getlinks().click();
    }

    public void clickongbrokenlinksimages(){
        this.getBrokenlinksimages().click();
    }

    public void clickonuploadanddownload(){
        this.getUploadanddownload().click();
    }

    public void clickondynamicproperties(){
        this.getDynamicproperties().click();
    }

    public void clickoncheckboxtick (){
        this.getCheckboxtick().click();
    }

    public void clickonyesbutton(){
        this.getRadiobuttonyes().click();
    }

    public void clickonnobutton(){
        this.getRadiobuttonno().click();
    }
}
