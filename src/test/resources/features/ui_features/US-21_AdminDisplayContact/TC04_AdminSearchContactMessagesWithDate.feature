@US20 @UI @E2E @Admin
Feature:

  Scenario: Admin Okunan ve okunmayan mesajlar içerisinde tarih aralığı vererek arama yapabilmeli

    Given Sisteme Admin olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Belirli bir kelime ile arama yapilir
    Then Arama sonuclarinin listelendigi dogrulanir
