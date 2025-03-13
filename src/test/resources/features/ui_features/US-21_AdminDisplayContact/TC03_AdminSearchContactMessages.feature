@US20 @UI @E2E
Feature:

  Scenario: Admin belirli bir kelime ile contact mesaji aratabilmeli

    Given Sisteme Admin olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Belirli bir kelime ile arama yapilir
    Then Arama sonuclarinin listelendigi dogrulanir
