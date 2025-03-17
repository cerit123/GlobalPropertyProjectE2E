@US20 @Manager @UI @E2E
Feature:

  Scenario: Manager Okunan ve okunmayan mesajlar içerisinde tarih aralığı vererek arama yapabilmeli

    Given Manager olarak giris yapilir
    When Contact mesajları sayfasına gidilir
    And Filter butonuna tiklanir
    And Start Date alanian tarih girilir
    And End Date alanian tarih girilir
    And Onay butonuna basilir
    Then Belirlitilen tarih araligindaki arama sonuclarinin listelendigi dogrulanir

