
<<<<<<< HEAD
@US-10a @UI
=======
@UI @Manager @US-10a
>>>>>>> master
Feature:
 Scenario Outline: Search kısmından istediği emlağı seçip satılık olarak genel arama yapabilmeli
   Given search box ın üzerindeki rent butonuna tıklanır
   And   search box ın altındaki istenilen "<emlakTürü>" seçilir

   And   search butonuna tıklanır
   And   açılan pencerede seçilen ürünün geldiği görünür
   Then  sayfa kapatılır
   Examples:
     | emlakTürü |
     | HOUSE        |
     | APARTMENT    |
     | OFFICE       |
     | VILLA        |
     | LAND         |
     | SHOP         |

