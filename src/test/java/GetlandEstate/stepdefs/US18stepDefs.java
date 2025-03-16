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

public class US18stepDefs {
    HomePage homePage= new HomePage();

    LoginPage loginPage= new LoginPage();
    DashboardPage dashboardPage= new DashboardPage();
    MyTourRequestsPage myTourRequestsPage=new MyTourRequestsPage();

    @Given("Homepage e tiklanir.")
    public void homepageETiklanir() {

            Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginPage.loginButton.click();
        ActionsUtils.scrollLeft();
        ActionsUtils.scrollDown();
        loginPage.mailButton.sendKeys(ConfigReader.getProperty("manager"));
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password2"));
        loginPage.login.click();

        //ActionsUtils.scrollDown()
        ReusableMethods.waitForSecond(3);
        //homePage.controlPannelButton.click();
        dashboardPage.backToSite.click();
        homePage.profilButton.click();
        homePage.profilButton.click();
        myTourRequestsPage.myTourRequests.click();
    }

    @When("Istenilen ilan a tiklanir")
    public void ıstenilenIlanATiklanir() {
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
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginPage.loginButton.click();
        ActionsUtils.scrollLeft();
        ActionsUtils.scrollDown();
        loginPage.mailButton.sendKeys(ConfigReader.getProperty("manager"));
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("password2"));
        loginPage.login.click();

    }

    @When("Soldaki profil menusunden  {string} sekmesi tiklanir")
    public void soldakiProfilMenusundenSekmesiTiklanir(String arg0) {
        homePage.profilButton.click();
    }

    @And("{string} listesi acilir.") //My Tour Requests
    public void listesiAcilir(String arg0) {
        homePage.profilButton.click();
        myTourRequestsPage.myResponses.click();

    }

    @Then("{string} listesindeki guest  goruntulenebiliyor mu kontrol edilir.")
    public void listesindekiGuestGoruntulenebiliyorMuKontrolEdilir(String arg0) {
        Assert.assertTrue(myTourRequestsPage.guest.isDisplayed());
    }

    //TC04

    @And("Soldaki manager menusunden  My Tour Requests sekmesi tiklanir")
    public void soldakiManagerMenusundenMyTourRequestsSekmesiTiklanir() {
        homePage.profilButton.click();
        dashboardPage.tourRequests.click();
        myTourRequestsPage.myResponses.click();

    }

    @And("My Responsesdaki ilanda silme\\(x) tusuna basar")
    public void myResponsesdakiIlandaSilmeXTusunaBasar() {
        myTourRequestsPage.actionDeleteButton.click();
    }

    @Then("Tour request declined mesajinin gorundugu dogrulanir")
    public void tourRequestDeclinedMesajininGorunduguDogrulanir() {
        //Assert.assertTrue(myTourRequestsPage..isDisplayed());
    }
}

