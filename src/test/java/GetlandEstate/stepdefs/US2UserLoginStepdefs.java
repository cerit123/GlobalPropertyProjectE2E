package GetlandEstate.stepdefs;

import GetlandEstate.pages.LoginPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2UserLoginStepdefs {
    LoginPage loginPage = new LoginPage();

    @Given("sayfaya gidilir")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Login sekmesine tiklanir")
    public void loginSekmesineTiklanir() {
        loginPage.loginButton.click();
    }

    @And("Siteye kaydolunan email adresi girilir")
    public void siteyeKaydolunanEmailAdresiGirilir() {
        loginPage.mailButton.sendKeys("bugboy@gmail.com");
    }

    @And("Kullanici password girilir")
    public void kullaniciPasswordGirilir() {
        loginPage.passwordButton.sendKeys("Ppbugboy38!!");
    }

    @Then("Login olundugu dogrulanir")
    public void loginOlunduguDogrulanir() {
        loginPage.login.click();
        Assert.assertTrue(loginPage.loginButton.isEnabled());
    }


    @And("Email adresi @ sembolu olmadan girilir")
    public void emailAdresiEksikGirilir() {
        loginPage.mailButton.sendKeys("bugboygmail.com");
    }

    @Then("Siteye giris yapilamadigi dogrulanir")
    public void siteyeGirisYapilamadigiDogrulanir() {
        Assert.assertTrue(loginPage.invalidEmailMessage.isDisplayed());
    }

    @And("Email adresi . sembolu olmadan girilir")
    public void emailAdresiNoktaOlmadanGirilir() {
        loginPage.mailButton.sendKeys("bugboy@gmailcom");
    }
    @Then("Invalid email uyarisi geldigi dogrulanir")
    public void invalidEmailUyarisiGeldigiDogrulanir() {
        Assert.assertTrue(loginPage.invalidEmailMessage.isDisplayed());

    }

    @And("Password bos birakilir")
    public void passwordBosBirakilir() {
        loginPage.passwordButton.clear();

    }
    @Then("Password is required uyarisinin geldigi dogrulanir")
    public void passwordIsRequiredUyarisininGeldigiDogrulanir() {
        Assert.assertTrue(loginPage.passwordRequiredMessage.isDisplayed());
    }

    @And("Email kutucugu bos birakilir")
    public void emailKutucuguBosBirakilir() {
        loginPage.mailButton.clear();
    }

    @Then("Login butonunun tiklanamadigi dogrulanir")
    public void loginButonununTiklanamadigiDogrulanir() {
        Assert.assertFalse(loginPage.login.isEnabled());
    }


}
