package GetlandEstate.stepdefs;

import GetlandEstate.pages.AdminManagerRaporPage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.pages.UsersPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC05CustomerStepdefs {
    LoginPage loginPage = new LoginPage();
    UsersPage userpage = new UsersPage();
    AdminManagerRaporPage admin = new AdminManagerRaporPage();

    @When("Login sekmesine tiklanir")
    public void loginSekmesineTiklanir() {
        loginPage.loginButton.click();
    }

    @And("Siteye kaydolunan email adresi girilir")
    public void siteyeKaydolunanEmailAdresiGirilir() {

        loginPage.mailButton.sendKeys("admin@gmail.com");
    }

    @And("Kullanici password girilir")
    public void kullaniciPasswordGirilir() {

        loginPage.passwordButton.sendKeys("admin123!");
    }

    @Then("Login olundugu dogrulanir")
    public void loginOlunduguDogrulanir() {
        loginPage.login.click();
        Assert.assertTrue(loginPage.loginButton.isEnabled());
    }

    @And("Admin olarak giriş yapılabilmeliır")
    public void adminOlarakGirişYapılabilmeliır() {
    }

    // TC_02 ---------

    @And("Kullanıcı sekmesine tıklanır")
    public void kullanıcıSekmesineTıklanır() {

        userpage.users.click();
    }

    @Then("Oluşturulan kullanıcı bilgileri görülebilmeli")
    public void oluşturulanKullanıcıBilgileriGörülebilmeli() {

        //Assert.assertTrue(userpage..isDisplayed());

    }

    // TC_03 ----------

    @And("Rol seçme sekmesine tıklanır")
    public void rolSeçmeSekmesineTıklanır() {

        userpage.usersPageRole.click();
    }

    @Then("\"Customer roli seçilerek atanır")
    public void customerRoliSeçilerekAtanır() throws Throwable {
        userpage.rolesCustomer.click();

        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
    // TC_04 -------------

    @And("Günceleme sekmesine tıklanılır")
    public void güncelemeSekmesineTıklanılır() {
    }

    @Then("Günceleme yapıldığı doğrulanır.")
    public void güncelemeYapıldığıDoğrulanır() {
    }

    // TC_05 ---------
    @And("Delete sekmesine tıklanılır")
    public void deleteSekmesineTıklanılır() {

        userpage.deleteButton.click();
    }

    @Then("Oluşturulan kullanıcı silinebilir olmalı")
    public void oluşturulanKullanıcıSilinebilirOlmalı() {

        //Assert.assertTrue(userpage..isDisplayed());

    }

    // TC_06 ---------
    @Then("\"Admin rolu atamaya izin vermiyor")
    public void adminRoluAtamayaIzinVermiyor() throws Throwable {

        userpage.rolesAdmin.click();

        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
     // TC_07 -------
    @Then("\"Manager rolu atamaya izin vermiyor")
    public void managerRoluAtamayaIzinVermiyor() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}
