@US02 @UI @E2E
Feature: US2_UserLogin Test
  Scenario: Login butonu email ve password girilmeden tiklanabilir olmamali

    Given Siteye gidilir
    When Login sekmesine tiklanir
    And  Email kutucugu bos birakilir
    And  Password bos birakilir
    Then Login butonunun tiklanamadigi dogrulanir












