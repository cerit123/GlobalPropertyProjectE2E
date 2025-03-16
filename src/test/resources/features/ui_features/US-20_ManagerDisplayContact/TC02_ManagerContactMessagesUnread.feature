@US20 @Manager @UI @E2E
Feature:

  Scenario: Manager Contact mesajları okundu olarak isaretleyebilmelidir

    Given Manager olarak giris yapilir
    When Contact mesajları sayfasına gidilir
    And Bir mesaj okundu olarak işaretlenir
    Then Mesajin okundu olarak isaretlendigi dogrulanir

