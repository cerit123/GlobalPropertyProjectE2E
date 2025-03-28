package GetlandEstate.stepdefs.stepdefs;

import GetlandEstate.pages.ContactPage;
import GetlandEstate.pages.HomePage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US19CustomerSendMesageStepdefs {

    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();

    @Given("Kullanici sayfaya gider")
    public void kullaniciSayfayaGider() {

    }

    @When("Contact sekmesi tiklanir")
    public void contactSekmesiTiklanir() {
        homePage.ContactButton.click();

    }

    @And("Acilan pencereye gecerli bir first name girilir")
    public void acilanPencereyeGecerliBirFirstNameGirilir() {

        contactPage.firstNameBox.sendKeys(ConfigReader.getProperty("contactfirstName"));
    }

    @And("Acilan pencereye gecerli bir last name girilir")
    public void acilanPencereyeGecerliBirLastNameGirilir() {

        contactPage.LastNameBox.sendKeys(ConfigReader.getProperty("contactlastName"));
    }

    @And("Gecerli bir email adresi girilir")
    public void gecerliBirEmailAdresiGirilir() {

        contactPage.eMailBox.sendKeys(ConfigReader.getProperty("contactemail"));
    }

    @And("Acilan pencereye gecerli bir mesaj girilir")
    public void acilanPencereyeGecerliBirMesajGirilir() {

        contactPage.massageBox.sendKeys("gecerli mesaj");
    }

    @And("Send butonuna tiklanir")
    public void sendButonunaTiklanir() {
        //ReusableMethods.waitForSecond(3);
        contactPage.sendButton.click();
    }

    @Then("Mesaj gonderildigini dogrular")
    public void mesajGonderildiginiDogrular() {
        ReusableMethods.visibleWait(contactPage.successMassage,5);
     Assert.assertTrue(contactPage.successMassage.isDisplayed());

    }
}
