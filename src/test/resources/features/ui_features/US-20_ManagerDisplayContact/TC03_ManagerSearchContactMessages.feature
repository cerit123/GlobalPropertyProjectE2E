@US20 @Manager @UI @E2E
Feature:

  Scenario: Manager belirli bir kelime ile contact mesaji aratabilmeli

    Given Manager olarak giris yapilir
    When Contact mesajları sayfasına gidilir
    And Belirli bir kelime ile arama yapilir
    Then Arama sonuclarinin listelendigi dogrulanir

