@US-16
Feature:  US-16_AdminCreatReport test

  Scenario: Kullanici bilgilerine gore rapor olusturabilmelidir
    Given  Siteye gidilir
    When Profile tiklanir
    And Kontrol Paneline tiklanir
    And Raporlar sayfasina gidilir
    And Rapor butonuna tiklanir
    And Kullanicilar kismi Admin olarak secilir
    And Raporu Olustur butonuna tiklanir
    Then Admin kullanici bilgisiyle raporun olusturuldugu  gorulur
    And Sayfa kapatilir



