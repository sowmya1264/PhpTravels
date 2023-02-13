package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotelResultsPage extends BasePage {

    By hotelResultsLoad = By.xpath("//div[@class='row g-3']");

    By details  = By.xpath("//section[@id=\"data\"]//ul//li[1]//a");
    By scroll  = By.xpath("//div[@id=\"availability\"]");
    By bookNow = By.xpath("//div[@id=\"availability\"]//div//div//span");

    String bookingPageUrl = "hotels/booking";

    By checkbox = By.xpath("//label[@for='agreechb']");
    By confirm = By.xpath("//button[contains(text(),'Confirm Booking')]");

    String invoiceUrl = "hotels/booking/invoice/";


        public void clickDetails() throws InterruptedException {
            elementToBeVisible(hotelResultsLoad);
            clickElement(details);
            scrollToElement(scroll);
            clickElement(bookNow);
            urlChange(bookingPageUrl);
            scrollToEnd();
            elementToBeClickable(checkbox);
            clickElement(checkbox);
            clickElement(confirm);
            urlChange(invoiceUrl);



        }
}
