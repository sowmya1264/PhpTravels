package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HotelBookingPage extends BasePage {


    By citydrp = By.cssSelector("#select2-hotels_city-container");

    By city  = By.xpath("//input[@class=\"select2-search__field\"]");

    By selectCity = By.xpath("//ul[@id=\"select2-hotels_city-results\"]//li[1]");
    By citySelection = By.xpath("//span[@id='select2-hotels_city-container']");
    By search = By.xpath("//form[@id='hotels-search']//button[@id='submit']");

    public void setSelectCity() throws InterruptedException {
        clickElement(citydrp);
        enterInput(city,"Sing");
        Thread.sleep(5000);
        clickElement(selectCity);
        elementToBeVisible(citySelection);
        clickElement(search);
    }
}
