@US-16
  Feature: US-16_AdminCreatReport test
    Scenario:Populer ilanlarin raporunu olusturabilmelidir
      Given  Siteye gidilir
      When Profile tiklanir
      And Kontrol Paneline tiklanir
      And Raporlar sayfasina gidilir
      And Rapor butonuna tiklanir
      And  En Populer ilanlar kisminda miktar kismi secilir
      And Rapor olustur butonuna tiklanir
      Then  Rapor basariyla olustugu gosterilir
      And Sayfa kapatilir



