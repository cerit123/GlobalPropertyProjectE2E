@US20 @UI @E2E @Admin
Feature:

  Scenario: Admin Contact mesajları görebilmeli ve silebilmelidir

    Given Sisteme Admin olarak giriş yapilir
    When Contact mesajları sayfasına gidilir
    And Mesajlar görüntülenir
    And Bir mesaj silinir
    Then Mesajin silindigi dogrulanir

