@UI@US-1
Feature: US-16_AdminCreatReport test

  Scenario: Tur isteklerine gore rapor olusturabilmelidir

    Given Profile tiklanir
    When Kontrol Paneline tiklanir
    And Rapor butonuna tiklanir
    And Start date kismina gecerli bir veri girilir
    And End date kismina gecerli bir veri girlir
    And Status kismi secilir
    And Raporu Olusturmak icin butona tiklanir
    Then Tur istekleri listelenir ve rapor basariyla olusturulur







