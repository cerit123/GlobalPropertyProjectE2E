@US-15-UI
Feature: Admin Kullanıcı Güncelleme

  Scenario: Admin kullanıcı bilgilerini günceller
    Given Siteye gidilir
    When Log in butonuna tıklanılır
    And Admin bilgileri girilir
    And Kullanıcılar sekmesine tıklanılır
    And Search kutusuna kullanıcı adı girilir
    And Search butonuna tıklanır
    Then Girilen kullanıcı adının arama sonuçlarında görüntülendiği doğrulanır
    When Edit butonuna tıklanır
    And First Name ve Last Name alanında değişiklikler yapılır
    And Güncelle butonuna tıklanılır
    Then Girilen bilgilerin başarıyla güncellendiği doğrulanır
