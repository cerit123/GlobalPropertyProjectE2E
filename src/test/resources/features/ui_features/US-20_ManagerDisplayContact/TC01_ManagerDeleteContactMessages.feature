@US20 @Manager @UI @E2E
Feature:

  Scenario: Manager Contact mesajları görebilmeli ve silebilmelidir

    Given Manager olarak giris yapilir
    When Contact mesajları sayfasına gidilir
    And Mesajları görüntüle
    And Bir mesaj silinir
    Then Mesajin silindigi dogrulanir

