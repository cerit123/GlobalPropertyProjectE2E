@US20 @UI @E2E @Admin
Feature:

  Scenario: Admin Contact mesajları okundu olarak isaretleyebilmelidir

    Given Sisteme Admin olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Bir mesaj okundu olarak işaretlenir
    Then Mesajin okundu olarak isaretlendigi dogrulanir

