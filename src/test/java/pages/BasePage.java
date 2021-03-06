package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static JavascriptExecutor js;
    static {
        System.setProperty("webdriver.chrome.driver", "/Users/ramirocaceres/AutomationDriver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
    }

    private static WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void closeDriver() {
        driver.quit();
    }

    public void closeTabAndWindowDriver(){driver.close();}

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickElement(String locator) {
        find(locator).click();
    }

    public void doubleClickElement(String locator) {
        action.doubleClick(find(locator)).perform();
    }

    public void rightClickElement(String locator) {
        action.contextClick(find(locator)).perform();
    }

    public void writeText(String locator, String textToWrite) {
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void writeEnter(String locator){
        find(locator).sendKeys(Keys.RETURN);
    }
    
    public String getTextFromElement(String locator) {
        return find(locator).getText();
    }

    public void selectDropdownByValue(String locator, String value) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(value);
    }

    public boolean isSeleeected(String locator) {
        return find(locator).isSelected();
    }

    public boolean elementIsDisplayed(String locator) {
        return find(locator).isDisplayed();
    }

    public void scrollllWeb() {
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public void selectFromDropdownByText(String locator, String textToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

    public void swtichToTabByIndex(int tabN){
        ArrayList <String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(tabN));}

    public void aceptAlert(){
        driver.switchTo().alert().accept();;
    }

    public void sendKeysAndAccept(String textWrite){
        driver.switchTo().alert().sendKeys(textWrite);
        driver.switchTo().alert().accept();
    }

    public void switchToFrame(String locator){
        driver.switchTo().frame(locator);
    }

    public void sliderAction(String locator, int horizontal, int vertical){action.dragAndDropBy(find(locator), horizontal, vertical).perform();}

}