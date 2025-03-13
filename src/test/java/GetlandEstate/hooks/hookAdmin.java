package GetlandEstate.hooks;

import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.WaitUtils;
import io.cucumber.java.Before;
import org.junit.After;
import org.junit.AfterClass;

public class hookAdmin {


    @Before("@Admin")
    public void setUp() {
        LoginPage loginPage = new LoginPage();
        HomePage   homePage=new HomePage();

            Driver.getDriver().get(ConfigReader.getProperty("url"));

            homePage.LoginButton.click();
            loginPage.mailButton.sendKeys(ConfigReader.getProperty("admin"));
            loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password1"));
            loginPage.login.click();

        WaitUtils.waitFor(2);
    }



    @After
    public void tearDown() {
        try {
            Driver.closeDriver();
        } catch (Exception e) {
            System.out.println("Driver kapatma sırasında hata oluştu: " + e.getMessage());
        }
    }
}
