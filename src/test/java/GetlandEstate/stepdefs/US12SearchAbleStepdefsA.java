package GetlandEstate.stepdefs;

import GetlandEstate.pages.SearchPage;
import GetlandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US12SearchAbleStepdefsA {
    SearchPage searchPage = new SearchPage();
    Select advertTypeDropDown=new Select(searchPage.advertTypeDropDown);
    Select countryDropDown=new Select(searchPage.countryDropDown);
    Select cityDropDown=new Select(searchPage.cityDropDown);
    Select categoryDropDown=new Select(searchPage.categoryDropDown);
    Select districtDropDown=new Select(searchPage.districtDropDown);

    @When("{string} kismina aranmak istenen emlak yazılır")
    public void kisminaAranmakIstenenEmlakYazılır(String ev) {
        searchPage.searchBox.sendKeys(ev);

    }

    @And("Arama butonuna tiklanir")
    public void aramaButonunaTiklanir() {
        searchPage.searchButton.click();
    }

    @Then("İlanlar sayfasının açıldığı doğrulanır.")
    public void i̇lanlarSayfasınınAçıldığıDoğrulanır() {
        Assert.assertTrue(searchPage.totalFoundText.isDisplayed());
    }

//===============================================================================================

    @When("Search kisminda bulunan arama butonuna tiklanir")
    public void searchKismindaBulunanAramaButonunaTiklanir() {
        searchPage.searchButton.click();
    }

    @And("Acilan pencerede Price Range, Advert Type, Category, Country, City, District bölümleri gorulur.")
    public void acilanPenceredePriceRangeAdvertTypeCategoryCountryCityDistrictBölümleriGorulur() {

    }


    @And("Price Range bolumunde bulunan Min box bolumune gecerli bir data girilir.")
    public void priceRangeBolumundeBulunanMinBoxBolumuneGecerliBirDataGirilir() {
        searchPage.minPriceRange.sendKeys("100");
    }

    @And("Price Range bolumunde bulunan Max box bolumune gecerli bir data girilir.")
    public void priceRangeBolumundeBulunanMaxBoxBolumuneGecerliBirDataGirilir() {
        searchPage.maxPriceRange.sendKeys("200");
        advertTypeDropDown.selectByVisibleText("All");
        categoryDropDown.selectByVisibleText("All");

        ReusableMethods.ddmValue(searchPage.advertTypeDropDown,"All");
        ReusableMethods.ddmValue(searchPage.categoryDropDown,"All");

        countryDropDown.selectByVisibleText("All");

        ReusableMethods.ddmValue(searchPage.countryDropDown,"All");
    }

    @Then("Price Range bolumunde bulunan Min box ve Max box bolumlerine gecerli bir data girilebildigi dogrulanir.")
    public void priceRangeBolumundeBulunanMinBoxVeMaxBoxBolumlerineGecerliBirDataGirilebildigiDogrulanir() {
        Assert.assertTrue(searchPage.totalFoundText.isDisplayed());
    }

    @And("Price Range bolumunde bulunan Min box bolumune gecersiz bir data girilir.")
    public void priceRangeBolumundeBulunanMinBoxBolumuneGecersizBirDataGirilir() {

    }

    @Then("Search arama butonuna tiklandiginda uyari vermelidir.")
    public void searchAramaButonunaTiklandigindaUyariVermelidir() {
    }
}
