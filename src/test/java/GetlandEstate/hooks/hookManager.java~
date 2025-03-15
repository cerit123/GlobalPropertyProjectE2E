package GetlandEstate.hooks;

import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.WaitUtils;
import io.cucumber.java.Before;
import org.junit.After;

public class hookManager {


    @Before("@Manager")
    public static void setUp() {
        LoginPage loginPage = new LoginPage();
        HomePage   homePage=new HomePage();

            Driver.getDriver().get(ConfigReader.getProperty("url"));
            homePage.LoginButton.click();
            loginPage.mailButton.sendKeys(ConfigReader.getProperty("manager"));
            loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password2"));
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
