@US-15@UI

Feature: Admin İlan Türü Yönetimi Test

  Scenario: Admin yeni bir ilan türü ekler
    Given Siteye gidilir
    When Log in butonuna tıklanılır
    And Admin bilgileri girilir
    And İlan türü sekmesine tıklanılır
    And Add New butonuna tıklanır
    And İlan türü girilir
    And Oluştur butonuna tıklanılır
    Then "İlan türü başarıyla oluşturuldu" mesajı görüntülenmelidir
