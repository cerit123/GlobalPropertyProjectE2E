package GetlandEstate.stepdefs;

import GetlandEstate.pages.*;
import GetlandEstate.utilities.ActionsUtils;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US18stepDefs {
    HomePage homePage= new HomePage();

    LoginPage loginPage= new LoginPage();
    DashboardPage dashboardPage= new DashboardPage();
    MyTourRequestsPage myTourRequestsPage=new MyTourRequestsPage();

    @Given("Homepage e tiklanir.")
    public void homepageETiklanir() {
        //ActionsUtils.scrollDown()
        loginPage.loginButton.click();
        ActionsUtils.scrollLeft();
        ActionsUtils.scrollDown();
        loginPage.mailButton.sendKeys(ConfigReader.getProperty("manager"));
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password2"));
        loginPage.login.click();
        dashboardPage.backToSite.click();
    }

    @When("Istenilen ilan a tiklanir")
    public void ıstenilenIlanATiklanir() {
        homePage.profilButton.click();
        myTourRequestsPage.myTourRequests.click();
        myTourRequestsPage.myRequests.click();
        myTourRequestsPage.actionUpdateButton.click();

    }

    @And("Schedule a Tour kismindan tur tarihi secilir.")
    public void scheduleATourKismindanTurTarihiSecilir() {
        myTourRequestsPage.tourDateChoose.sendKeys(ConfigReader.getProperty("date"));
    }

    @And("Schedule a Tour kismindan  tur saati secilir.")
    public void scheduleATourKismindanTurSaatiSecilir() {
        ReusableMethods.ddmVisibleText(myTourRequestsPage.timeBooking,"18:00");
        myTourRequestsPage.timeBooking.click();
    }

    @And("Submit a tour request butonu  tiklanir.")
    public void submitATourRequestButonuTiklanir() {
        myTourRequestsPage.updateChoose.click();

    }

    @Then("Tour Requestin gonderildigi dogrulanir.")
    public void tourRequestinGonderildigiDogrulanir() {
        Assert.assertTrue(myTourRequestsPage.tourRequestCreatedSuccessfully.isDisplayed());
    }

    //TC02


    @Given("Manager olarak giris yapilir.")
    public void managerOlarakGirisYapilir() {
        loginPage.loginButton.click();
        ActionsUtils.scrollLeft();
        ActionsUtils.scrollDown();
        loginPage.mailButton.sendKeys(ConfigReader.getProperty("manager"));
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password2"));
        loginPage.login.click();
        dashboardPage.backToSite.click();

    }

    @And("Profil menusunden  My Tour Requests sekmesi tiklanir")
    public void profilMenusundenMyTourRequestsSekmesiTiklanir() {

        homePage.profilButton.click();
        myTourRequestsPage.myTourRequests.click();
        myTourRequestsPage.myRequests.click();
    }

    @And("My Responses listesi acilir.")
    public void myResponsesListesiAcilir() {
    }

    @Then("My Respopnses listesindeki guest goruntulenebiliyor mu kontrol edilir.")
    public void myRespopnsesListesindekiGuestGoruntulenebiliyorMuKontrolEdilir() {
    }
}

