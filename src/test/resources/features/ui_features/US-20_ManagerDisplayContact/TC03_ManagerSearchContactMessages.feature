@US20 @UI @E2E
Feature:

  Scenario: Manager belirli bir kelime ile contact mesaji aratabilmeli

    Given Sisteme Manager olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Belirli bir kelime ile arama yapilir
    Then Arama sonuclarinin listelendigi dogrulanir

