package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BookingInvoicePage extends BasePage {

    By reservation = By.xpath("//span[@class='text-right']");

        public String getReservation(){
            elementToBeVisible(reservation);
            String reservation_no = getText(reservation);
            return reservation_no;
        }
}
