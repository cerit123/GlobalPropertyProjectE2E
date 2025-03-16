@US2 @UI @E2E
Feature: US2_UserLogin Test
  Scenario: (.) Sembol olmadan email girildiğinde Invalid email hatası görünmelidir

    Given Siteye gidilir
    When Login sekmesine tiklanir
    And Email adresi . sembolu olmadan girilir
    And Kullanici password girilir
    And Login butonuna tiklanir
    Then Invalid email uyarisi geldigi dogrulanir









