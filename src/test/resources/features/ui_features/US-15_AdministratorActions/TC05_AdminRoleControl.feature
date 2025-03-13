@US-15@UI
Feature: Admin Kullanıcı Rol Yönetimi

  Scenario: Admin kullanıcıya farklı bir rol atar
  //  Given Siteye gidilir
  //  When Log in butonuna tıklanılır
  //  And Admin bilgileri girilir
    And Kullanıcılar sekmesine tıklanılır
    And Search kutusuna kullanıcı adı girilir
    And Search butonuna tıklanır
    Then Girilen kullanıcı adının arama sonuçlarında görüntülendiği doğrulanır
    When Edit butonuna tıklanır
    And Roller butonuna tıklanır
    And Kullanıcı için farklı bir rol seçilir
    And Güncelle butonuna tıklanılır
    Then Kullanıcı rolünün başarıyla değiştiği doğrulanır

