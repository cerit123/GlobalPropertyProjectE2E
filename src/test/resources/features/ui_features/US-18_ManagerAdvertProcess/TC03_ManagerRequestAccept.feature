@US-18 @Manager

Feature: US018_Manager ilanlar ile ilgili islem yapar
    Scenario: Manager kendi verdigi ilanlarin randevu isteklerini gorebilmeli


    When Soldaki manager menusunden  My Tour Requests sekmesi tiklanir
    And My Responses listesi acilir.
    And My Responsesdaki ilanda onay tusuna basar
    Then Tour Request approved yazisinin gorundugu dogrulanir
    And Sayfa kapatilir