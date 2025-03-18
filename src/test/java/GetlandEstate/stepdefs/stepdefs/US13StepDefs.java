package GetlandEstate.stepdefs.stepdefs;

import GetlandEstate.pages.DashboardPage;
import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.pages.MyTourRequestsPage;
import GetlandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13StepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();
    MyTourRequestsPage myTourRequestsPage = new MyTourRequestsPage();


    @Given("siteye geri don kismina tiklamalidir")
    public void siteyeGeriDonKisminaTiklamalidir() {
        ReusableMethods.waitForSecond(3);
        homePage.controlPannelButton.click();
        dashboardPage.backToSite.click();
        homePage.profilButton.click();
    }

    @When("profile tiklamalidir")
    public void profileTiklamalidir() {
        homePage.profilButton.click();

    }

    @And("Tur Taleplerime tiklamalidir")
    public void turTaleplerimeTiklamalidir() {
        myTourRequestsPage.myTourRequests.click();
    }


    @And("Tur Cevaplarim kismi tiklanir.")
    public void turCevaplarimKismiTiklanir() {
        myTourRequestsPage.updateChoose.click();

    }

    @Then("Tur Cevaplarim listesindeki isim,durum,tur tarihi ,saat goruntulenebiliyor mu  kontrol edilir.")
    public void turCevaplarimListesindekiIsimDurumTurTarihiSaatGoruntulenebiliyorMuKontrolEdilir() {
        Assert.assertTrue(myTourRequestsPage.tourRequestCreatedSuccessfully.isDisplayed());
    }
//TC02
    @And("Tur Cevaplarim listesi goruntulenir.")
    public void turCevaplarimListesiGoruntulenir() {
    }

    @And("onaylanma kismina tiklanir")
    public void onaylanmaKisminaTiklanir() {
    }

    @And("cikan sekmedeki evet kutusuna tiklanir")
    public void cikanSekmedekiEvetKutusunaTiklanir() {
    }

    @Then("onaylandigina dair yazi kontrol edilir.")
    public void onaylandiginaDairYaziKontrolEdilir() {
    }
//TC03
    @And("cikan sekmedeki reddetmek kutusuna tiklanir")
    public void cikanSekmedekiReddetmekKutusunaTiklanir() {
    }

    @Then("reddedildigine dair yazi kontrol edilir.")
    public void reddedildigineDairYaziKontrolEdilir() {
    }



}