package GetlandEstate.stepdefs;

import GetlandEstate.pages.AdminManagerRaporPage;
import GetlandEstate.pages.DashboardPage;
import GetlandEstate.pages.HomePage;
import GetlandEstate.pages.LoginPage;
import GetlandEstate.utilities.ConfigReader;
import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.ReusableMethods;
import GetlandEstate.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US16_17CreatReportStepdefs {

    AdminManagerRaporPage adminManagerRaporPage = new AdminManagerRaporPage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    HomePage homePage=new HomePage();

    //TC-01-----------
    @Given("Rapor butonuna tiklanir")
    public void raporButonunaTiklanir() {
        dashboardPage.reports.click();
    }

    @And("Start date kismina gecerli veri girilir")
    public void startDateKisminaGecerliVeriGirilir() {
        adminManagerRaporPage.startDate.sendKeys(ConfigReader.getProperty("startDate"));
    }

    @And("End date kismina gecerli veri girilir")
    public void endDateKisminaGecerliVeriGirilir() {
        adminManagerRaporPage.endDate.sendKeys(ConfigReader.getProperty("endDate"));
    }

    @And("Category kismina gecerli veri girilir")
    public void categoryKisminaGecerliVeriGirilir() {
        adminManagerRaporPage.category.click();
        ReusableMethods.ddmValue(adminManagerRaporPage.category,"1");
    }

    @And("Advert type kismina gecerli veri grilir")
    public void advertTypeKisminaGecerliVeriGrilir() {
        adminManagerRaporPage.type.click();
        ReusableMethods.ddmVisibleText(adminManagerRaporPage.type,"All");
    }

    @And("Status kismina gecerli veri girilir")
    public void statusKisminaGecerliVeriGirilir() {
        adminManagerRaporPage.status.click();
        ReusableMethods.ddmVisibleText(adminManagerRaporPage.status,"All");
        WaitUtils.waitFor(3);
    }


    //TC02-----------------------------
    @And("Rapor olustur butonuna tiklanir")
    public void raporOlusturButonunaTiklanir() {
        adminManagerRaporPage.reportButton1.click();
        WaitUtils.waitFor(1);

    }

    @Then("Rapor basariyla olustugu gosterilir")
    public void raporBasariylaOlustuguGosterilir() {
        Assert.assertTrue(adminManagerRaporPage.raporExcel.isDisplayed());
    }



    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }


    @And("En Populer ilanlar kisminda miktar kismi secilir")
    public void enPopulerIlanlarKismindaMiktarKismiSecilir() {
    }

    @And("Rapor olusturma butonuna tiklanir")
    public void raporOlusturmaButonunaTiklanir() {
    }

    @Then("Rapor  populer ilanlar raporu basariyla olustugu gosterilir")
    public void raporPopulerIlanlarRaporuBasariylaOlustuguGosterilir() {
    }

    //TC03----------------------------

    @Given("Manager olarak profil butonuna tiklanir")
    public void managerOlarakProfilButonunaTiklanir() {
    }

    @And("Mnager olarak kontrol paneline tiklanir")
    public void mnagerOlarakKontrolPanelineTiklanir() {
    }

    @When("Kullanicilar kismi Admin olarak secilir")
    public void kullanicilarKismiAdminOlarakSecilir() {
    }

    @And("Raporu Olustur butonuna tiklanir")
    public void raporuOlusturButonunaTiklanir() {
    }

    @Then("Admin kullanici bilgisiyle raporun olusturuldugu  gorulur")
    public void adminKullaniciBilgisiyleRaporunOlusturulduguGorulur() {
    }


   //TC04-------------

    @Given("Profile tiklanir")
    public void profileTiklanir() {
    }

    @When("Kontrol Paneline tiklanir")
    public void kontrolPanelineTiklanir() {
    }

    @And("Start date kismina gecerli bir veri girilir")
    public void startDateKisminaGecerliBirVeriGirilir() {
    }

    @And("End date kismina gecerli bir veri girlir")
    public void endDateKisminaGecerliBirVeriGirlir() {
    }

    @And("Status kismi secilir")
    public void statusKismiSecilir() {
    }

    @And("Raporu Olusturmak icin butona tiklanir")
    public void raporuOlusturmakIcinButonaTiklanir() {
    }

    @Then("Tur istekleri listelenir ve rapor basariyla olusturulur")
    public void turIstekleriListelenirVeRaporBasariylaOlusturulur() {
    }

//TC05-----------------
    @Given("Raporlar sekmesine gidilir")
    public void raporlarSekmesineGidilir() {
    }

    @When("Start date kismina  bos birakilir")
    public void startDateKisminaBosBirakilir() {
    }

    @And("Category kismi secilir")
    public void categoryKismiSecilir() {
    }

    @And("Advert type kismi secilir")
    public void advertTypeKismiSecilir() {
    }

    @And("Raporu Olusturun butonuna tiklanir")
    public void raporuOlusturunButonunaTiklanir() {
    }

    @Then("Raporun basariyla olusturulmadigi ve hata mesaji alindigi gorulur")
    public void raporunBasariylaOlusturulmadigiVeHataMesajiAlindigiGorulur() {
    }



    @And("End date kismina {string} kisminda once bir tarih girilir")
    public void endDateKisminaKismindaOnceBirTarihGirilir(String arg0) {
    }
}
