package GetlandEstate.stepdefs;

import GetlandEstate.pages.*;
import GetlandEstate.utilities.ActionsUtils;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US13_US14StepDefs {

    HomePage homePage= new HomePage();
    MyProfilePage myProfilePage= new MyProfilePage();
    LoginPage loginPage= new LoginPage();
    DashboardPage dashboardPage= new DashboardPage();
    MyTourRequestsPage myTourRequestsPage=new MyTourRequestsPage();
    SearchPage searchPage=new SearchPage();


    @Given("siteye geri don kismina tiklamalidir")
    public void siteyeGeriDonKisminaTiklamalidir() {
        dashboardPage.backToSite.click();
    }

    @When("profile tiklamalidir")
    public void profileTiklamalidir() {
        ActionsUtils.scrollDown();
        ReusableMethods.waitForSecond(5);
    }

    @And("ilanlarima tiklanmalidir")
    public void ilanlarimaTiklanmalidir() {
        myTourRequestsPage.myAdverts.click();
    }

    @Then("ilanlarim listesindeki isim,durum,tur tarihi ,saat goruntulenebiliyor mu  kontrol edilir.")
    public void ilanlarimListesindekiIsimDurumTurTarihiSaatGoruntulenebiliyorMuKontrolEdilir() {
        Assert.assertTrue(myTourRequestsPage.myAdvertsPage.isDisplayed());
    }
//13-tc02
    @And("Tur Taleplerime tiklamalidir")
    public void turTaleplerimeTiklamalidir() {
        myTourRequestsPage.myTourRequests.click();
    }

    @And("Tur Cevaplarim listesi goruntulenir.")
    public void turCevaplarimListesiGoruntulenir() {
        myTourRequestsPage.myResponses.click();
    }

    @And("onaylanma kismina tiklanir")
    public void onaylanmaKisminaTiklanir() {
        myTourRequestsPage.approveAction.click();
    }

    @And("cikan sekmedeki evet kutusuna tiklanir")
    public void cikanSekmedekiEvetKutusunaTiklanir() {
        myTourRequestsPage.popupActionYes.click();
    }

    @Then("onaylandigina dair yazi kontrol edilir.")
    public void onaylandiginaDairYaziKontrolEdilir() {
        Assert.assertTrue(myTourRequestsPage.tourRequestCreatedSuccessfully.isDisplayed());
        //burayi tekrar incele
    }
//tc03
    @And("reddetme kismina tiklanir")
    public void reddetmeKisminaTiklanir() {
    }

    @And("cikan reddetme kutusuna yes'e tiklanir")
    public void cikanReddetmeKutusunaYesETiklanir() {
    }

    @Then("reddedildigine dair yazi kontrol edilir.")
    public void reddedildigineDairYaziKontrolEdilir() {
    }
}
