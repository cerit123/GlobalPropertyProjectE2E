@UI@US-1
Feature: US-17_ManagerCreatReport test

  Scenario: Tur isteklerine gore rapor olusturabilmelidir
    Given Manager olarak  Siteye gidilir
    When Manager olarak giris yapilir
    And Manager olarak Raporlar sayfasina gidilir
    And Manager olarak Start date kismina gecerli bir veri girilir
    And Manager olarak End date kismina gecerli bir veri girlir
    And Manager olarak Status kismi secilir
    And Manager olarak Raporu Olustur butonuna tiklanir
    Then Manager olarak Tur istekleri listelenir ve rapor basariyla olusturulur
    And Sayfa kapatilir







