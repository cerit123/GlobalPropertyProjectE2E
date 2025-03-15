

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini red edebilmelidir

    Given siteye geri don kismina tiklamalidir
    When profile tiklamalidir
    And Tur Taleplerime tiklamalidir
    And Tur Cevaplarim listesi goruntulenir.
    And onaylanma kismina tiklanir
    And cikan sekmedeki reddetmek kutusuna tiklanir
    Then reddedildigine dair yazi kontrol edilir.
