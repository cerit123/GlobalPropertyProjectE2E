@US-13 @UI

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini kabul edebilmelidir

    Given Siteye gidilir.
    When Manager olarak  giris yapilir.
    And anasayfaya tikla
    And sag ust profilden tur taleplerine tikla
    And acilan sekmedeki tur cevaplarima tikla
    And randevu istegindeki kabul et tiklanir
    Then randevu istegini kabul et "evet "tiklanir