@UI@US-17
  @Costumer
Feature: US-17_ManagerCreatReport test

  Scenario: Yetkisiz kullanici ile rapor olusturma yapilmamalidir

    And profil kismina gidilir
    And kontrol Paneli  sekmesine gidilir
    Then kontrol Paneli  sekmesinin olmadigi gorulur
    And Sayfa kapatilir



