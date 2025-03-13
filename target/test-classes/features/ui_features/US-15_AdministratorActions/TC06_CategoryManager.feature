@US-15@UI
Feature: Admin Kategori Yönetimi

  Scenario: Admin kategori bilgilerini günceller
    Given Siteye gidilir
    When Log in butonuna tıklanılır
    And Admin bilgileri girilir
    And Kategori sekmesine tıklanılır
    And Kategori ismi girilir
    Then Girilen kategori adının arama sonuçlarında görüntülendiği doğrulanır
    When Edit butonuna tıklanır
    And Başlık alanına farklı bir isim girilir
    And Güncelle butonuna tıklanılır
    Then Kategori başarıyla güncellendiği doğrulanır

