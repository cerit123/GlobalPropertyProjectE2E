@UI
Feature: US-16_AdminCreatReport test

  Scenario:Eksik bilgi ile rapor olusturma yapildiginda hata mesaji almalidir


    Given Raporlar sekmesine gidilir
    When Start date kismina  bos birakilir
    And End date kismina gecerli bir veri girlir
    And Category kismi secilir
    And Advert type kismi secilir
    And Status kismi secilir
    And Raporu Olusturun butonuna tiklanir
    Then Raporun basariyla olusturulmadigi ve hata mesaji alindigi gorulur
    And Sayfa kapatilir







