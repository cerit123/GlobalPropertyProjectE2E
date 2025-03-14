@US03 @UI @E2E
Feature: US3_CustomerProfileUpdate Test
  Scenario: Kullanici My Profile altindaki profil bilgilerini gorebilmeli ve degistirebilmeli

    Given Siteye gidilir
    When Login sekmesine tiklanir
    And Profil butonuna tiklanir
    And My Profile sekmesine tiklanir
    And First name/Last name/ Phone/ email guncellenir
    And Update butonuna tiklanir
    Then Profil bilgilerinin degistirildigi dogrulanir












