package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.PropertyReaderOptimized;

public class LoginPage extends BasePage {



    By loginPageLoad = By.xpath("//div[@class='row mt-5 mb-5']");
    By email = By.cssSelector("input[placeholder=\"Email\"]");
    By password = By.cssSelector("input[placeholder=\"Password\"]");
    By submit = By.xpath("//span[normalize-space()='Login']");

    By errorMessage = By.cssSelector("div[class=\"message\"]");


    public void loginSuccess() throws Exception {
        elementToBeClickable(loginPageLoad);
        enterInput(email, PropertyReaderOptimized.readKeyO("username"));
        enterInput(password,PropertyReaderOptimized.readKeyO("password"));
        clickElement(submit);
        implicitWait();

    }

    public String loginfail() throws Exception {
        elementToBeClickable(loginPageLoad);
        enterInput(email, PropertyReaderOptimized.readKeyO("username"));
        enterInput(password,PropertyReaderOptimized.readKeyO("wrongpassword"));
        clickElement(submit);
        elementToBeVisible(errorMessage);
        return getText(errorMessage);

    }

}
