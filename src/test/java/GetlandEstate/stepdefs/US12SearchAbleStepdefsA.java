package GetlandEstate.stepdefs;

import GetlandEstate.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12SearchAbleStepdefsA {
    SearchPage searchPage=new SearchPage();

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


}
