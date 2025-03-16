@US-19 @Customer
Feature: Users Contact Message Send
Scenario: Send Message


  And   Acilan pencereye gecersiz bir first name girilir(rakam)
  And   Acilan pencereye gecerli bir last name girilir
  And   Gecerli bir email adresi girilir
  And   Acilan pencereye gecerli bir mesaj girilir
  And   Send butonuna tiklanir
  Then  Mesajin gonderilmedigi dogrulanir