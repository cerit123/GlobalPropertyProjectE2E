@US2 @UI @E2E
  Feature: US2_UserLogin Test

    Scenario: Kullanici siteye kayit oldugu email adresiyle login yapabilmelidir

      # Given Siteye gidilir
      When Login sekmesine tiklanir
      And Siteye kaydolunan email adresi girilir
      And Kullanici password girilir
      And Login sekmesine tiklanir
      Then Kullanicinin profilini gorebildigi dogrulanir

