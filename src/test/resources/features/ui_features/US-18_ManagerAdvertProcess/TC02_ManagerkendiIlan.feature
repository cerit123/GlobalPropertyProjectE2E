@US-18 @Manager @UI
  Feature: Manager kendi ilanının randevu isteklerini gorebilmeli

    Scenario: Manager kendi ilanının randevu isteklerini gorebilmeli

      Given Manager olarak giris yapilir.
      And Profil menusunden  My Tour Requests sekmesi tiklanir
      And My Responses listesi acilir.
      Then My Respopnses listesindeki guest goruntulenebiliyor mu kontrol edilir.
