@UI@US-1
Feature: US-17_ManagerCreatReport test

  Scenario:Eksik bilgi ile rapor olusturma yapildiginda hata mesaji almalidir

    Given Manager olarak  Siteye gidilir
    When Manager olarak profile giris yapilir
    And Manager olarak Kontrol Paneline tiklanir
    And Manager olarak Raporlar sayfasina gidilir
    And  start date kismina  bos birakilir
    And end date kismina gecerli veri girilir
    And category kismina gecerli veri girilir
    And advert type kismina gecerli veri grilir
    And Manager olarak Status kismi secilir
    And Manager olarak Raporu Olustur butonuna tiklanir
    Then Manager olarak Raporun basariyla olusturulmadigi ve hata mesaji alindigi gorulur
    And Sayfa kapatilir







