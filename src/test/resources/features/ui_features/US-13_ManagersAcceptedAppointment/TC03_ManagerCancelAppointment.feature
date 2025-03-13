@US-13 @UI

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini red edebilmelidir

    Given Siteye gidilir.
    When Manager olarak  giris yapilir.
    And anasayfaya tikla
    And sag ust profilden tur taleplerine tikla
    And acilan sekmedeki tur cevaplarima tikla
    And randevu istegini reddetmek icin carpi isaretine tiklar
    Then randevu istegini reddetmek "evet "tikla