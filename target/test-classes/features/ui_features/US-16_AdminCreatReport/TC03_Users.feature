@UI
Feature:  US-16_AdminCreatReport test

  Scenario: Kullanici bilgilerine gore rapor olusturabilmelidir
    Given Siteye gidilir
    When Admin olarak giris yapilir
    And "Raporlar" sekmesine gidilir
    And Kullanicilar kismi" Admin" olarak secilir
    And Raporu Olustur butonuna tiklanir
    Then Admin kullanici bilgisiyle raporun olusturuldugu  gorulur



