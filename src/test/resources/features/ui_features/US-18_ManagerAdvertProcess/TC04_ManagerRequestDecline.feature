@US-18 @Manager
Feature: US018_Manager ilanlar ile ilgili islem yapar

    Scenario: Manager ilanlar ile ilgili islem yapar

    Given Manager olarak giris yapilir.
    When Manager olarak giris yapilir.
    And Soldaki manager menusunden  My Tour Requests sekmesi tiklanir
    And My Responsesdaki ilanda silme(x) tusuna basar
    Then Tour request declined mesajinin gorundugu dogrulanir


