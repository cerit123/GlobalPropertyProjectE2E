@US21 @UI @E2E @Admin
Feature:

  Scenario: Admin belirli bir kelime ile contact mesaji aratabilmeli

    Given Contact mesajları sayfasına gidilir
    When Belirli bir kelime ile arama yapilir
    Then Arama sonuclarinin listelendigi dogrulanir
