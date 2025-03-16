package GetlandEstate.stepdefs;

import GetlandEstate.pages.ContactMessagesPage;
import GetlandEstate.pages.DashboardPage;
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

import java.util.List;

public class US20ManagerDisplayContactStepdefs {

    ContactMessagesPage contactMessagesPage = new ContactMessagesPage();
    DashboardPage dashboardPage = new DashboardPage();
//TC-01
//    @Given("Sisteme Manager olarak giriş yapilir")
//    public void sistemeManagerOlarakGirişYapilir() {
//    }

    @When("Contact mesajları sayfasına gidilir")
    public void contactMesajlarıSayfasınaGidilir() {

        ReusableMethods.waitForSecond(2);
        dashboardPage.contactMessages.click();

    }

    @And("Mesajları görüntüle")
    public void mesajlarıGörüntüle() {
        ReusableMethods.waitForSecond(2);
        contactMessagesPage.message.click();

    }

    @And("Bir mesaj silinir")
    public void birMesajSilinir() {
        ReusableMethods.waitForSecond(2);
        contactMessagesPage.deleteButton.click();

    }

    @Then("Mesajin silindigi dogrulanir")
    public void mesajinSilindigiDogrulanir() {

    }

//TC02


//    @Given("Sisteme Manager olarak giriş yapilir")
//    public void sistemeManagerOlarakGirişYapilir() {
//    }

    @And("Bir mesaj okundu olarak işaretlenir")
    public void birMesajOkunduOlarakIşaretlenir() {

        contactMessagesPage.markReadButton.click();
    }

    @Then("Mesajin okundu olarak isaretlendigi dogrulanir")
    public void mesajinOkunduOlarakIsaretlendigiDogrulanir() {

    }

//TC03

    @And("Belirli bir kelime ile arama yapilir")
    public void belirliBirKelimeIleAramaYapilir() {
        contactMessagesPage.searchBox.click();
        contactMessagesPage.searchBox.sendKeys(ConfigReader.getProperty("john.doe"));
    }

    @Then("Arama sonuclarinin listelendigi dogrulanir")
    public void aramaSonuclarininListelendigiDogrulanir() {
        List<WebElement> sonuc = Driver.getDriver().findElements(By.xpath("//span[contains(text(), 'John')] "));
        Assert.assertFalse(sonuc.isEmpty());
    }


//TC04

    @And("Filter butonuna tiklanir")
    public void filterButonunaTiklanir() {
        contactMessagesPage.filterButton.click();
    }

    @And("Start Date alanian tarih girilir")
    public void startDateAlanianTarihGirilir() {
        contactMessagesPage.dropdownStartDate.sendKeys(ConfigReader.getProperty("12/03/2025"));

    }

    @And("End Date alanian tarih girilir")
    public void endDateAlanianTarihGirilir() {
        contactMessagesPage.dropdownEndDate.sendKeys(ConfigReader.getProperty("13/03/2025"));
    }

    @And("Onay butonuna basilir")
    public void onayButonunaBasilir() {
        contactMessagesPage.applyFiltersButton.click();
    }

    @Then("Belirlitilen tarih araligindaki arama sonuclarinin listelendigi dogrulanir")
    public void belirlitilenTarihAraligindakiAramaSonuclarininListelendigiDogrulanir() {
        List<WebElement> sonuc2 = Driver.getDriver().findElements(By.xpath("//span[@class='email' and text()='john.doe@example.com']"));
        Assert.assertFalse(sonuc2.isEmpty());
    }
/////////






}
