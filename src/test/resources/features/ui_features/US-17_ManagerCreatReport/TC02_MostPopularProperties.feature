@UI@US-17
Feature: US-17_ManagerCreatReport test
  Scenario: Manager Populer ilanlarin raporunu olusturabilmelidir
    Given Manager olarak  Siteye gidilir
    When Manager olarak giris yapilir
    And Manager olarak Raporlar sayfasina gidilir
    And Manager olarak En Populer ilanlar kisminda miktar kismi secilir
    And Manager olarak Rapor olustur butonuna tiklanir
    Then Manager olarak  Rapor basariyla olustugu gosterilir
    And Sayfa kapatilir



