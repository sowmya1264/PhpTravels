package tests;

import driver.DriverManager;
import io.qameta.allure.Description;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import testbase.TestBase;
import utils.PropertyReaderOptimized;

public class LoginPageTest extends TestBase {

        @Test(priority = 1)
        @Description("Verify valid user login  is working fine")
        public void login_positive() throws Exception
        {
            DriverManager.getMeDriver().get(PropertyReaderOptimized.readKeyO("url"));
            LoginPage loginpage = new LoginPage();
            DashboardPage dashboardPage = new DashboardPage();
            loginpage.loginSuccess();
            String expectResult  = dashboardPage.getTitle();
            Assertions.assertThat(expectResult)
                    .isNotBlank()
                    .isNotNull()
                    .contains("Welcome Back");
            takeScreenShot("login success");
        }

        @Test(priority = 0)
        @Description("Verify invalid user sign fails")
        public void login_negative() throws Exception
        {
            DriverManager.getMeDriver().get(PropertyReaderOptimized.readKeyO("url"));
            LoginPage loginpage = new LoginPage();
            DashboardPage dashboardPage = new DashboardPage();

            String expectResult  = loginpage.loginfail();
            Assertions.assertThat(expectResult)
                    .contains("Wrong credentials. try again!");
            takeScreenShot("login fail");
        }
    }





