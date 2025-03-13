@UI@US-17
Feature:  US-17_ManagerCreatReport test

  Scenario: Kullanici bilgilerine gore rapor olusturabilmelidir
    Given Manager olarak  Siteye gidilir
    When Manager olarak giris yapilir
    And Manager olarak Raporlar sayfasina gidilir
    And Manager olarak Kullanicilar kismi Manager olarak secilir
    And Manager olarak Raporu Olustur butonuna tiklanir
    Then Manager olarak Admin kullanici bilgisiyle raporun olusturuldugu  gorulur
    And Sayfa kapatilir



