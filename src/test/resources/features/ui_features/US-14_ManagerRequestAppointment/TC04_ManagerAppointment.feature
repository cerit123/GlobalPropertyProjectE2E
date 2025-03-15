

  Feature:
    Scenario:

      Given Siteye geri don kismina tiklanir
      When Sayfanin asagisindan ilan secilir
      And ilana tiklanir
      And Tur tarihi girilir
      And Gecersiz Tur saati saati secilir
      And Tur talebi gonder kutusu tiklanir
      Then Tur Talebi gonder tusuna basilmadigi dogrulanir

