@US-13 @Manager

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini kabul edebilmelidir


    Given siteye geri don kismina tiklamalidir
    When profile tiklamalidir
    And Tur Taleplerime tiklamalidir
    And Tur Cevaplarim listesi goruntulenir.
   And onaylanma kismina tiklanir
    And cikan sekmedeki evet kutusuna tiklanir
    Then onaylandigina dair yazi kontrol edilir.
