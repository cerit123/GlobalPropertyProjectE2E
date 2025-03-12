package GetlandEstate.stepdefs;

import GetlandEstate.pages.SearchPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US10Stepdefs {
    SearchPage searchPage= new SearchPage();
    @Given("sayfaya gidilir")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("search box ın üzerindeki rent butonuna tıklanır")
    public void searchBoxInÜzerindekiRentButonunaTıklanır() {
        searchPage.rentButton.click();
    }

    @And("search box ın altındaki istenilen emlak seçilir")
    public void searchBoxInAltındakiIstenilenEmlakSeçilir() {
        searchPage.houseButton.click();
    }

    @And("search butonuna tıklanır")
    public void searchButonunaTıklanır() {
        searchPage.searchButton.click();
    }

    @And("açılan pencerede seçilen ürünün geldiği görünür")
    public void açılanPenceredeSeçilenÜrününGeldiğiGörünür() {
        Assert.assertTrue(searchPage.totalFoundText.isDisplayed());
    }

    @Then("sayfa kapatılır")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }



    @And("açılan sol pencerede Price Range bölümünde min kutusuna geçerli bir data girilir")
    public void açılanSolPenceredePriceRangeBölümündeMinKutusunaGeçerliBirDataGirilir() {
    }

    @And("açılan sol pencerede Price Range bölümünde max kutusuna geçerli ve min kutusundaki değerden büyük bir data girilri")
    public void açılanSolPenceredePriceRangeBölümündeMaxKutusunaGeçerliVeMinKutusundakiDeğerdenBüyükBirDataGirilri() {
    }

    @And("Advert Type, Category, dropdownlarında all seçeneği seçilir")
    public void advertTypeCategoryDropdownlarındaAllSeçeneğiSeçilir() {
    }

    @And("Country,City,District  dropdown ından herhangi bir seçenek seçilir")
    public void countryCityDistrictDropdownIndanHerhangiBirSeçenekSeçilir() {
    }

    @Then("arama sonucunun başarılı olduğu görülür")
    public void aramaSonucununBaşarılıOlduğuGörülür() {
    }


}
