@US-1@Admin
  Feature: US-16_AdminCreatReport test
    Scenario:Populer ilanlarin raporunu olusturabilmelidir


      Given Rapor butonuna tiklanir
      And  En Populer ilanlar kisminda miktar kismi secilir
      And Rapor olusturma butonuna tiklanir
      Then  Rapor  populer ilanlar raporu basariyla olustugu gosterilir
      And Sayfa kapatilir



