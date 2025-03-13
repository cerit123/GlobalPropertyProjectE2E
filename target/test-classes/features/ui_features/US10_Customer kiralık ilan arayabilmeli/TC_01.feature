
<<<<<<< HEAD
@US-10a @UI
Feature:
 Scenario Outline: Search kısmından istediği emlağı seçip satılık olarak genel arama yapabilmeli
   Given sayfaya gidilir
   And search box ın üzerindeki rent butonuna tıklanır
   And search box ın altındaki istenilen "<emlakTürü>" seçilir

   And search butonuna tıklanır
   And  açılan pencerede seçilen ürünün geldiği görünür
   Then sayfa kapatılır
   Examples:
     | emlakTürü |
     | HOUSE        |
     | APARTMENT    |
     | OFFICE       |
     | VILLA        |
     | LAND         |
     | SHOP         |
=======
@UI
Feature:
 Scenario: Search kısmından istediği emlağı seçip satılık olarak genel arama yapabilmeli
   Given sayfaya gidilir
   And search box ın üzerindeki sale butonuna tıklanır
   And search box ın altındaki istenilen emlak seçilir
   And search butonuna tıklanır
   And  açılan pencerede seçilen ürünün geldiği görünür
   Then sayfa kapatılır

>>>>>>> master

