@US12
  Feature: Search Rent SaleAble
    Scenario: Search Rent SaleAble
      Given Siteye gidilir
      When "Search" kismina aranmak istenen emlak yazılır
      And Arama butonuna tiklanir
      Then İlanlar sayfasının açıldığı doğrulanır.