package GetlandEstate.stepdefs;

import GetlandEstate.pages.AdminManagerRaporPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US16CreatReportStepdefs {

    AdminManagerRaporPage adminManagerRaporPage=new AdminManagerRaporPage();
    @Given("Siteye gidilir")
    public void siteyeGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Admin olarak giris yapilir")
    public void adminOlarakGirisYapilir() {
    }

    @And("Raporlar sayfasina gidilir")
    public void raporlarSayfasinaGidilir() {
    }

    @And("Rapor butonuna tiklanir")
    public void raporButonunaTiklanir() {
    }

    @And("Start date kismina gecerli veri girilir")
    public void startDateKisminaGecerliVeriGirilir() {
    }

    @And("End date kismina gecerli veri girilir")
    public void endDateKisminaGecerliVeriGirilir() {
    }

    @And("Category kismina gecerli veri girilir")
    public void categoryKisminaGecerliVeriGirilir() {
    }

    @And("Advert type kismina gecerli veri grilir")
    public void advertTypeKisminaGecerliVeriGrilir() {
    }

    @And("Status kismina gecerli veri girilir")
    public void statusKisminaGecerliVeriGirilir() {
    }

    @And("Rapor olustur butonuna tiklanir")
    public void raporOlusturButonunaTiklanir() {
    }

    @Then("Rapor basariyla olustugu gosterilir")
    public void raporBasariylaOlustuguGosterilir() {
    }

    @And("En Populer ilanlar kisminda miktar kismi secilir")
    public void enPopulerIlanlarKismindaMiktarKismiSecilir() {

    }

    @And("{string} sekmesine gidilir")
    public void sekmesineGidilir(String arg0) {
    }

    @And("Kullanicilar kismi{string} olarak secilir")
    public void kullanicilarKismiOlarakSecilir(String arg0) {
    }

    @And("Raporu Olustur butonuna tiklanir")
    public void raporuOlusturButonunaTiklanir() {
    }

    @Then("Admin kullanici bilgisiyle raporun olusturuldugu  gorulur")
    public void adminKullaniciBilgisiyleRaporunOlusturulduguGorulur() {
    }
}
