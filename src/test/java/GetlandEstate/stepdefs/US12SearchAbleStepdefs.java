package GetlandEstate.stepdefs;

import GetlandEstate.pages.SearchPage;
import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US12SearchAbleStepdefs {

    SearchPage searchPage= new SearchPage();
    Faker faker;
    Select advertTypeDropDown;
    Select  countryDropDown;
    Select  cityDropDown;
    Select  categoryDropDown;
    Select   districtDropDown;

    @Given("Siteye gidilir.")
    public void siteyeGidilir() {
    }

    @When("Search kisminda bulunan Rent butonuna tiklanir")
    public void searchKismindaBulunanRentButonunaTiklanir() {
        searchPage.rentButton.click();
    }

    @And("search box ın altındaki emlak {string} seçilir")
    public void searchBoxInAltındakiEmlakSeçilir(String emlakTürleri) {
        WebElement propertyButton = Driver.getDriver().findElement(By.xpath("//button[contains(text(), '" + emlakTürleri + "')]"));
        propertyButton.click();
    }

    @And("search butonuna tiklanir")
    public void searchButonunaTiklanir() {
        ReusableMethods.visibleWait(searchPage.searchButton,30);
        searchPage.searchButton.click();

    }

    @Then("acilan pencerede seçilen emlakın geldigi gorunur")
    public void acilanPenceredeSeçilenEmlakınGeldigiGorunur() {
        Assert.assertTrue(searchPage.totalFoundText.isDisplayed());
    }



   @Then("sayfa kapatilir.")
    public void sayfaKapatilir() {
        Driver.closeDriver();
   }
}
