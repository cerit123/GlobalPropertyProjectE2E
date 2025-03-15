@US-13 @Manager

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini gorebilmelidir

    Given siteye geri don kismina tiklamalidir
    When profile tiklamalidir
    And Tur Taleplerime tiklamalidir
    And Tur Cevaplarim kismi tiklanir.
    Then Tur Cevaplarim listesindeki isim,durum,tur tarihi ,saat goruntulenebiliyor mu  kontrol edilir.