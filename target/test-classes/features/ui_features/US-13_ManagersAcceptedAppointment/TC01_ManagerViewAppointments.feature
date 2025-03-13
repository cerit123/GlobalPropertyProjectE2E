@US-13 @UI

Feature:US-13_Manager Accept Appointment Test

  Scenario:Manager randevu isteklerini gorebilmelidir

    Given Siteye gidilir.
    When Manager olarak  giris yapilir.
    And acilan sayfada "Tur Talepleri" sekmesi tiklanir
    And "Tur Taleplerim" listesi goruntulenir.
    Then "Tur Taleplerim" listesindeki isim,durum,tur tarihi ,saat goruntulenebiliyor mu  kontrol edilir.