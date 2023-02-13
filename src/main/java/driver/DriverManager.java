package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverManager {

    static WebDriver driver;


    public static void init() {
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeOptions);

        }

    }


    public static void down() {
        if(driver!=null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getMeDriver(){
        return driver;
    }

}
