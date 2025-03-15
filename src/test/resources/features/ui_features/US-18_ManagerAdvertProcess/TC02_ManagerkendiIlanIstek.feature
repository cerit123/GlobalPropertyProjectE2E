@US-18 @Manager
  Feature: İlan İstekleri

    Scenario: Manager kendi ilan isteklerini görüntüleyebilir

      Given Manager olarak giris yapilir.
      When Soldaki profil menusunden  "My Tour Requests" sekmesi tiklanir
      And "My Responses" listesi acilir.
      Then "My Responses" listesindeki guest  goruntulenebiliyor mu kontrol edilir.
