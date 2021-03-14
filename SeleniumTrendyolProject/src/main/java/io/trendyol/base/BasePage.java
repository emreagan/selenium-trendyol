package io.trendyol.base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {

    public final Logger logger = LogManager.getLogger(BasePage.class);
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10, 400);
    }

    public WebElement findElement(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public void sendKeys(By by, CharSequence text) {
        WebElement element = findElement(by);
        element.clear();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    public void clickWithJs(By by) {
        WebElement ele = findElement(by);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ele));
        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void click(By by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement element = findElement(by);
        element.click();
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollToElement(By by){
        WebElement element =findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void switchToNewTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        //webDriver.switchTo().window(tabs2.get(0));
        logger.info("Yeni Sekmeye geçildi");
    }
    public void switchToOldTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        sleep(2);
        webDriver.switchTo().window(tabs2.get(1));
        webDriver.close();
        sleep(2);
        webDriver.switchTo().window(tabs2.get(0));
        sleep(2);
        logger.info("Önceki Sekmeye geçildi");
    }

    public Select select(By by) {
        return new Select(findElement(by));
    }

    public void selectByVisibleText(By by, String text) {
        select(by).selectByVisibleText(text);
    }

    public void selectByValue(By by, String value) {
        select(by).selectByValue(value);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public void navigateUrl(String url) {
        webDriver.navigate().to(url);
    }


    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
