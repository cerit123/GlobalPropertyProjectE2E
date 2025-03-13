@UI
Feature: US-17_ManagerCreatReport test

  Scenario: Yetkisiz kullanici ile rapor olusturma yapilmamalidir
    Given Manager olarak Siteye gidilir
    When farkli bir kullanici ile giris yapilir
    And profil kismina gidilir
    And kontrol Paneli  sekmesine gidilir
    Then kontrol Paneli  sekmesinin olmadigi gorulur
    And Sayfa kapatilir



