
@US-10 @UI
Feature:
 Scenario: Search kısmından istediği emlağı seçip satılık olarak genel arama yapabilmeli
   Given sayfaya gidilir
   And search box ın üzerindeki rent butonuna tıklanır
   And search box ın altındaki istenilen emlak seçilir
   And search butonuna tıklanır
   And  açılan pencerede seçilen ürünün geldiği görünür
   Then sayfa kapatılır


