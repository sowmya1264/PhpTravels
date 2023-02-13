package tests;

import driver.DriverManager;
import io.qameta.allure.Description;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.*;
import testbase.TestBase;
import utils.PropertyReaderOptimized;

public class BookHotelTest extends TestBase {

    @Test
    @Description("Verify Book Hotel scenario")
    public void hotel_booking() throws Exception
    {
        LoginPage loginpage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        HotelBookingPage hotelBookingPage = new HotelBookingPage();
        HotelResultsPage hotelResultsPage = new HotelResultsPage();
        BookingInvoicePage bookingInvoicePage = new BookingInvoicePage();

        DriverManager.getMeDriver().get(PropertyReaderOptimized.readKeyO("url"));

        loginpage.loginSuccess();
        dashboardPage.clickLogo();
        hotelBookingPage.setSelectCity();
        hotelResultsPage.clickDetails();
        String reservation_number = bookingInvoicePage.getReservation();
        Assertions.assertThat(reservation_number).isNotNull();
        takeScreenShot("Booking Success");
    }

}
