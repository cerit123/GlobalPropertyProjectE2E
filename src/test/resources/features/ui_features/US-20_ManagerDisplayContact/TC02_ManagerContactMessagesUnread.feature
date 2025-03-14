@US20 @UI @E2E
Feature:

  Scenario: Manager Contact mesajları okundu olarak isaretleyebilmelidir

    Given Sisteme Manager olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Bir mesaj okundu olarak işaretlenir
    Then Mesajin okundu olarak isaretlendigi dogrulanir

