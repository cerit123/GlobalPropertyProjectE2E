@UI
Feature: US-17_ManagerCreatReport test

  Scenario:Gecersiz tarih araligi sectiginde hata mesaji almalidir

    Given Manager olarak Siteye gidilir
    When Manager olarak giris yapilir
    And Manager olarak Raporlar sekmesine gidilir
    And Manager olarak Start date kismina  gecerli  bir veri girilir
    And Manager olarak End date kismina "Start date " kisminda once bir tarih girilir
    And Manager olarak Category kismi secilir
    And Manager olarak Advert type kismi secilir
    And Manager olarak Status kismi secilir
    And Manager olarak Raporu Olustur butonuna tiklanir
    Then Manager olarak Raporun basariyla olusturulmadigi ve hata mesaji alindigi gorulur
    And Sayfa kapatilir
