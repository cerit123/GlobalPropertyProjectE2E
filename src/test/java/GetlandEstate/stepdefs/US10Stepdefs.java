package GetlandEstate.stepdefs;

import GetlandEstate.pages.SearchPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
<<<<<<< HEAD
=======
import GetlandEstate.utilities.ReusableMethods;
>>>>>>> master
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
<<<<<<< HEAD

public class US10Stepdefs {
    SearchPage searchPage= new SearchPage();
    Select advertTypeDropDown=new Select(searchPage.advertTypeDropDown);
    Select countryDropDown=new Select(searchPage.countryDropDown);
    Select cityDropDown=new Select(searchPage.cityDropDown);
    Select categoryDropDown=new Select(searchPage.categoryDropDown);
    Select districtDropDown=new Select(searchPage.districtDropDown);
    @Given("sayfaya gidilir")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("search box ın üzerindeki rent butonuna tıklanır")
    public void searchBoxInÜzerindekiRentButonunaTıklanır() {
        searchPage.rentButton.click();
    }

=======

import java.util.Random;

public class US10Stepdefs {

    SearchPage searchPage= new SearchPage();
   // Select advertTypeDropDown=new Select(searchPage.advertTypeDropDown);
 //  Select countryDropDown=new Select(searchPage.countryDropDown);
 //  Select cityDropDown=new Select(searchPage.cityDropDown);
 //  Select categoryDropDown=new Select(searchPage.categoryDropDown);
 //  Select districtDropDown=new Select(searchPage.districtDropDown);
  //  @Given("sayfaya gidilir")
  //  public void sayfayaGidilir() {
  //      Driver.getDriver().get("http://64.227.123.49/");
  //  }
//
    @Given("search box ın üzerindeki rent butonuna tıklanır")
    public void searchBoxInÜzerindekiRentButonunaTıklanır() {
        searchPage.rentButton.click();
    }

>>>>>>> master
    @And("search box ın altındaki istenilen {string} seçilir")
    public void searchBoxInAltındakiIstenilenSeçilir(String emlaktürü) {
        WebElement propertyButton = Driver.getDriver().findElement(By.xpath("//button[contains(text(), '" + emlaktürü + "')]"));
        propertyButton.click();
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
        searchPage.minPriceRange.sendKeys("100");
    }

    @And("açılan sol pencerede Price Range bölümünde max kutusuna geçerli ve min kutusundaki değerden büyük bir data girilri")
    public void açılanSolPenceredePriceRangeBölümündeMaxKutusunaGeçerliVeMinKutusundakiDeğerdenBüyükBirDataGirilri() {

        searchPage.maxPriceRange.sendKeys("200");
    }

    @And("Advert Type, Category, dropdownlarında all seçeneği seçilir")
    public void advertTypeCategoryDropdownlarındaAllSeçeneğiSeçilir() {
<<<<<<< HEAD
     advertTypeDropDown.selectByVisibleText("All");
     categoryDropDown.selectByVisibleText("All");
=======
        ReusableMethods.ddmValue(searchPage.advertTypeDropDown,"All");
        ReusableMethods.ddmValue(searchPage.categoryDropDown,"All");
>>>>>>> master

    }

    @And("Country,City,District  dropdown ından herhangi bir seçenek seçilir")
    public void countryCityDistrictDropdownIndanHerhangiBirSeçenekSeçilir() {
<<<<<<< HEAD
        countryDropDown.selectByVisibleText("All");
=======
       ReusableMethods.ddmValue(searchPage.countryDropDown,"All");
>>>>>>> master

    }

    @Then("arama sonucunun başarılı olduğu görülür")
    public void aramaSonucununBaşarılıOlduğuGörülür() {
        Assert.assertTrue(searchPage.totalFoundText.isDisplayed());
    }


    @And("açılan sol pencerede Price Range bölümünde min kutusuna negatif değer yazılır")
    public void açılanSolPenceredePriceRangeBölümündeMinKutusunaNegatifDeğerYazılır() {
        searchPage.minPriceRange.sendKeys("-100");
    }

    @And("açılan sol pencerede Price Range bölümünde max kutusu boş bırakılır")
    public void açılanSolPenceredePriceRangeBölümündeMaxKutusuBoşBırakılır() {
    }

    @And("Advert Type, Category, Country dropdownlarında all seçeneği seçilmelidir")
    public void advertTypeCategoryCountryDropdownlarındaAllSeçeneğiSeçilmelidir() {
<<<<<<< HEAD
        advertTypeDropDown.selectByVisibleText("All");
        categoryDropDown.selectByVisibleText("All");
        countryDropDown.selectByVisibleText("All");
=======
        ReusableMethods.ddmValue(searchPage.advertTypeDropDown,"All");
        ReusableMethods.ddmValue(searchPage.categoryDropDown,"All");
        ReusableMethods.ddmValue(searchPage.countryDropDown,"All");

>>>>>>> master
    }

    @And("City ve District  dropdownları boş olmalıdır")
    public void cityVeDistrictDropdownlarıBoşOlmalıdır() {
    }

    @Then("uyarı mesajı görülmelidir")
    public void uyarıMesajıGörülmelidir() {
        Assert.assertTrue(searchPage.errorMassage.isDisplayed());
<<<<<<< HEAD
=======
    }

    @And("açılan sol pencerede Price Range bölümünde min kutusuna bir değer girilir")
    public void açılanSolPenceredePriceRangeBölümündeMinKutusunaBirDeğerGirilir() {
        searchPage.minPriceRange.sendKeys("100");
    }

    @And("açılan sol pencerede Price Range bölümünde max kutusuna miinimum değerden küçük bir değer girilir")
    public void açılanSolPenceredePriceRangeBölümündeMaxKutusunaMiinimumDeğerdenKüçükBirDeğerGirilir() {
    searchPage.maxPriceRange.sendKeys("50");
    }


    @And("search box ın altındaki istenilen emlak seçilir")
    public void searchBoxInAltındakiIstenilenEmlakSeçilir() {
        searchPage.villaButton.click();
    }

    @And("gelen ürünlerden bir tanesi üzerine tıklayarak açılır")
    public void gelenÜrünlerdenBirTanesiÜzerineTıklayarakAçılır() {
        if (!searchPage.propertiesList.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(searchPage.propertiesList.size());
            searchPage.propertiesList.get(randomIndex).click();
        } else {
            throw new RuntimeException("No property images found!");
        }
        
    }

    @And("açılan ürün sayfasında description bilgileri görünür")
    public void açılanÜrünSayfasındaDescriptionBilgileriGörünür() {
        Assert.assertTrue(searchPage.Description.isDisplayed());
    }

    @And("açılan ürün sayfasında DETAILSbilgileri görünür")
    public void açılanÜrünSayfasındaDETAILSbilgileriGörünür() {
        Assert.assertTrue(searchPage.Details.isDisplayed());
    }

    @Then("açılan ürün sayfasında LOCATION bilgileri görünür")
    public void açılanÜrünSayfasındaLOCATIONBilgileriGörünür() {
        Assert.assertTrue(searchPage.Location.isDisplayed());
    }

    @And("açılan ürün sayfasında resim bilgileri görünür")
    public void açılanÜrünSayfasındaResimBilgileriGörünür() {
        Assert.assertTrue(searchPage.image.isDisplayed());
>>>>>>> master
    }
}
