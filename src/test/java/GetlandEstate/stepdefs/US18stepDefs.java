package GetlandEstate.stepdefs;

import GetlandEstate.pages.DashboardPage;
import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.pages.MyTourRequestsPage;
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


    }

