@US20 @UI @E2E
Feature:

  Scenario: Manager Contact mesajları görebilmeli ve silebilmelidir

    Given Sisteme Manager olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Mesajları görüntüle
    And Bir mesaj silinir
    Then Mesajin silindigi dogrulanir

