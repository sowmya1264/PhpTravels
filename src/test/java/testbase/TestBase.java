package testbase;
import driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

public class TestBase {

        @BeforeMethod
        protected void setUp() throws MalformedURLException {
            DriverManager.init();
            DriverManager.getMeDriver().manage().window().maximize();

        }

        @AfterMethod
        protected void tearDown(){

            DriverManager.down();
        }

        public void takeScreenShot(String name){
            Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) DriverManager.getMeDriver()).getScreenshotAs(OutputType.BYTES)));
        }


}
