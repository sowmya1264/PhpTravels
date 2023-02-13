package pages;

import base.BasePage;
import org.openqa.selenium.By;


public class DashboardPage extends BasePage {

    By dashboardPageLoad = By.xpath("//div[@class='dashboard-bread']");
    By heading = By.xpath("//h2[contains(text(),'Hi,')]");

    By home_element = By.xpath("//div[@class=\"logo\"]//img");

    By hotelPageLoad = By.xpath("//form[@id=\"hotels-search\"]");


    public String getTitle()
    {
        elementToBeClickable(dashboardPageLoad);
        String heading_text = getText(heading);
        return heading_text;
    }

    public void clickLogo()
    {
        clickElement(home_element);
        elementToBeVisible(hotelPageLoad);
    }

}
