@US21 @UI @E2E @Admin
Feature:

  Scenario: Admin Contact mesajları görebilmeli ve silebilmelidir

    Given Contact mesajları sayfasına gidilir
    When Mesajlar görüntülenir
    And Bir mesaj silinir
    Then Mesajin silindigi dogrulanir

