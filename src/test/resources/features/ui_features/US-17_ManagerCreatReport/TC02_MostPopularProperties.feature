@UI
@US-17
@Manager
Feature: US-17_ManagerCreatReport test

  Scenario: Manager Populer ilanlarin raporunu olusturabilmelidir
    #Given Manager olarak profil butonuna tiklanir
    #And Mnager olarak kontrol paneline tiklanir
    And Manager olarak Raporlar sayfasina gidilir
    And Manager olarak En Populer ilanlar kisminda miktar kismi secilir
    And Manager olarak Rapor olustur butonuna tiklanir
    Then Manager olarak  Rapor basariyla olustugu gosterilir
    And Sayfa kapatilir



