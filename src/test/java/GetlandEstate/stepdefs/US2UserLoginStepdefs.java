package GetlandEstate.stepdefs;

import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US2UserLoginStepdefs {
    @Given("sayfaya gidilir")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Login sekmesine tiklanir")
    public void loginSekmesineTiklanir() {



    }

    @And("Siteye kaydolunan email adresi girilir")
    public void siteyeKaydolunanEmailAdresiGirilir() {
    }

    @And("Kullanici password girilir")
    public void kullaniciPasswordGirilir() {
    }

    @Then("Login olundugu dogrulanir")
    public void loginOlunduguDogrulanir() {
    }

    @And("Email adresi @ sembolu olmadan girilir")
    public void emailAdresiEksikGirilir() {
    }

    @Then("Siteye giris yapilamadigi dogrulanir")
    public void siteyeGirisYapilamadigiDogrulanir() {
    }

    @And("Email adresi . sembolu olmadan girilir")
    public void emailAdresiNoktaOlmadanGirilir() {
    }

    @And("Password bos birakilir")
    public void passwordBosBirakilir() {

    }

    @And("Email kutucugu bos birakilir")
    public void emailKutucuguBosBirakilir() {
    }

    @Then("Login butonunun tiklanamadigi dogrulanir")
    public void loginButonununTiklanamadigiDogrulanir() {
    }

    @Then("Password is required uyarisinin geldigi dogrulanir")
    public void passwordIsRequiredUyarisininGeldigiDogrulanir() {
    }

    @Then("Invalid email uyarisi geldigi dogrulanir")
    public void invalidEmailUyarisiGeldigiDogrulanir() {
        
    }

    @Then("Kullanicinin profilini gorebildigi dogrulanir")
    public void kullanicininProfiliniGorebildigiDogrulanir() {
    }
}
