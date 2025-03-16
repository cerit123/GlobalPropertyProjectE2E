package GetlandEstate.stepdefs;

import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.pages.MyProfilePage;
import GetlandEstate.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US3CustomerProfileUpdateStepdefs {
    LoginPage loginPage = new LoginPage();
    MyProfilePage saveButton = new MyProfilePage();
    MyProfilePage myProfilePage = new MyProfilePage();
    HomePage homePage=new HomePage();

//    @Given("sayfaya gidilir")
//    public void sayfayaGidilir() {
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//    }

//    @When("Login sekmesine tiklanir")
//    public void loginSekmesineTiklanir() {
//        loginPage.loginButton.click();
//    }

//    @And("Siteye kaydolunan email adresi girilir")
//    public void siteyeKaydolunanEmailAdresiGirilir() {
//        loginPage.mailButton.sendKeys(ConfigReader.getProperty("emailCostumer"));
//    }

    //@And("Kullanici password girilir")
    //public void kullaniciPasswordGirilir() {
        //loginPage.passwordButton.sendKeys(ConfigReader.getProperty("passwordCostumer"));
    //}

    @And("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {
        loginPage.login.click();
    }

    ReusableMethods reusableMethods = new ReusableMethods();
    WaitUtils waitUtils;

    public void setWaitUtils(WaitUtils waitUtils) throws InterruptedException {
        this.waitUtils = waitUtils;
        waitUtils.wait(5);
    }

    @And("My Profile sekmesine tiklanir")
    public void myProfileSekmesineTiklanir() {

        myProfilePage.myProfileButton.click();
    }

    @And("First name guncellenir")
    public void firstNameGuncellenir() {
        myProfilePage.firstName.sendKeys("Raymond");
    }

    @And("Last name guncellenir")
    public void lastNameGuncellenir() {
        myProfilePage.lastName.sendKeys("Sanchez");
    }

    @And("Phone guncellenir")
    public void phoneGuncellenir() {
        myProfilePage.phoneNumber.sendKeys("555-555-5555");
    }

    @And("Email guncellenir")
    public void emailGuncellenir() {
        myProfilePage.email.sendKeys("H2N9K@example.com");
    }
    @And("Update butonuna tiklanir")
    public void updateButonunaTiklanir() throws InterruptedException {
        myProfilePage.updateButton.click();
        waitUtils.wait(3);
    }

    @Then("Profil bilgilerinin degistirildigi dogrulanir")
    public void profilBilgilerininDegistirildigiDogrulanir() {

        Assert.assertTrue(myProfilePage.profileUpdatesuccessfullMessageisDisplayed());

    }

    @And("Change password sekmesine tiklanir")
    public void changePasswordSekmesineTiklanir() {
        myProfilePage.changePasswordButton.click();
    }

    @And("Current password girilir")
    public void currentPasswordGirilir() {
        myProfilePage.currentPassword.sendKeys(ConfigReader.getProperty("passwordCostumer"));
    }

    @And("Sistem gerekliliklerine gore New password girilir")
    public void sistemGerekliliklerineGoreNewPasswordGirilir() {
        myProfilePage.newPassword.sendKeys(ConfigReader.getProperty("newPasswordCostumer"));
    }

    @And("Confirm password kutucuguna yeni olusturulan password tekrar girilir")
    public void confirmPasswordKutucugunaYeniOlusturulanPasswordTekrarGirilir() {
        myProfilePage.confirmPassword.sendKeys(ConfigReader.getProperty("newPasswordCostumer"));
    }

    @And("Change butonuna tiklanir")
    public void changeButonunaTiklanir() throws InterruptedException {
        myProfilePage.changeButton.click();
        ReusableMethods.visibleWait(myProfilePage.changePasswordSuccessfullMessage, 5);
    }

    @Then("Password'un basarili bir sekilde degistirildigi dogrulanir")
    public void passwordUnBasariliBirSekildeDegistirildigiDogrulanir() {
        Assert.assertTrue(myProfilePage.changePasswordSuccessfullMessageisDisplayed());
    }

    @And("Profile photo sekmesine tiklanir")
    public void profilePhotoSekmesineTiklanir() {

        myProfilePage.profilePhoto.click();

    }

    @And("Select sekmesiyle yeni profil resmi secilir")
    public void selectSekmesiyleYeniProfilResmiSecilir() {
        WebElement uploadElement = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String filePath = "/Users/emresmac/Desktop/pexels-moose-photos-1586996.jpg";
        uploadElement.sendKeys("filePath");
    }

    @And("Save butonu tiklanir")
    public void saveButonuTiklanir() throws InterruptedException {
        saveButton.saveButton.click();
        ReusableMethods.visibleWait(myProfilePage.profilePhotoSuccessfullMessage, 5);

    }

    @Then("Profil resminin basarili bir sekilde eklendigi dogrulanir")
    public void profilResmininBasariliBirSekildeEklendigiDogrulanir() {
        Assert.assertTrue(myProfilePage.profilePhotoSuccessfullMessageisDisplayed());
    }

    @And("Delete Account sekmesine tiklanir")
    public void deleteAccountSekmesineTiklanir() {
        myProfilePage.deleteAccountButton.click();
    }

    @And("Silme islemini gerceklestirmek icin gerekli olan kullanici password'u girilir")
    public void silmeIsleminiGerceklestirmekIcinGerekliOlanKullaniciPasswordUGirilir() {
        myProfilePage.currentPassword.sendKeys(ConfigReader.getProperty("newPasswordCostumer"));
    }

    @And("Delete Account butonuna tiklanir")
    public void deleteAccountButonunaTiklanir() {
        myProfilePage.deleteAccountButton.click();
    }

    @And("{string} confirmation sorusu icin Yes tiklanir")
    public void confirmationSorusuIcinYesTiklanir(String arg0) {
        myProfilePage.yesButton.click();

    }

    @Then("Hesabin silindigi dogrulanir")
    public void hesabinSilindigiDogrulanir() {
        ReusableMethods.visibleWait(myProfilePage.deleteAccountSuccessfullMessage, 5);
        Assert.assertTrue(myProfilePage.deleteAccountSuccessfullMessageisDisplayed());
    }


}


