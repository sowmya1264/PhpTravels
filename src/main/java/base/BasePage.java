package base;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public void implicitWait()
    {

        DriverManager.getMeDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public WebElement elementToBeClickable(By elementIdentifier)
    {
        WebElement element  = new WebDriverWait(DriverManager.getMeDriver(),Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(elementIdentifier));
        return element;
    }

    public void urlChange(String url)
    {
       Boolean wait = new WebDriverWait(DriverManager.getMeDriver(),Duration.ofSeconds(30))
                .until(ExpectedConditions.urlContains(url));
    }

    public WebElement elementToBeVisible(By elementIdentifier)
    {
        WebElement element  = new WebDriverWait(DriverManager.getMeDriver(),Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
        return element;
    }

    protected void enterInput(By by, String key) {

        DriverManager.getMeDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key) {

        return DriverManager.getMeDriver().findElement(key);
    }

    protected void clickElement(By by) {
        DriverManager.getMeDriver().findElement(by).click();
    }

    protected String getText(By by) {
        return DriverManager.getMeDriver().findElement(by).getText();
    }

    protected void scrollToElement(By by) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getMeDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",DriverManager.getMeDriver().findElement(by));
        Thread.sleep(2000);

    }

    protected void scrollToEnd() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getMeDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

    }






}
