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
import java.util.List;


public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static JavascriptExecutor js;

    static {
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

    private static WebElement findByCss(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }


    public static void closeDriver() {
        driver.quit();
    }

    public static void closeTabAndWindowDriver(){driver.close();}

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void clickElement(String locator) {
        find(locator).click();
    }

    public static void doubleClickElement(String locator) {
        action.doubleClick(find(locator)).perform();
    }

    public static void rightClickElement(String locator) {
        action.contextClick(find(locator)).perform();
    }

    public static void writeText(String locator, String textToWrite) {
        find(locator).clear();
        find(locator).sendKeys(textToWrite);

    }

    public static void writeEnter(String locator){
        find(locator).sendKeys(Keys.RETURN);
    }


    public String getTextFromElement(String locator) {
        return find(locator).getText();
    }

    public static void selectDropdownByValue(String locator, String value) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(value);
    }

    public boolean isSelected(String locator) {
        return find(locator).isSelected();
    }

    public boolean elementIsDisplayed(String locator) {
        return find(locator).isDisplayed();
    }

    public static void scrollWeb() {
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public static void scrollWeb350() {
        js.executeScript("window.scrollBy(0,350)", "");
    }


    public void selectFromDropdownByText(String locator, String textToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

    public static void swtichToTabByIndex(int tabN){
        ArrayList <String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(tabN));}

    public static void aceptAlert(){
        driver.switchTo().alert().accept();;
    }

    public static void sendKeysAndAccept(String textWrite){
        driver.switchTo().alert().sendKeys(textWrite);
        driver.switchTo().alert().accept();
    }

    public static void switchToFrame(String locator){
        driver.switchTo().frame(locator);
    }
}