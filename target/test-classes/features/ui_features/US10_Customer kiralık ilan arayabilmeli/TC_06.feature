
@US-10 @UI @Costumer
Feature:
 Scenario:Seçtiği emlak ile alakalı resim, Description, DETAILS, LOCATION bilgilerini görebilmeli
   Given  sayfaya gidilir
   When   search box ın üzerindeki rent butonuna tıklanır
   And    search box ın altındaki istenilen emlak seçilir
   And    search butonuna tıklanır
   And    gelen ürünlerden bir tanesi üzerine tıklayarak açılır
   And    açılan ürün sayfasında resim bilgileri görünür
   And    açılan ürün sayfasında description bilgileri görünür
   And    açılan ürün sayfasında DETAILSbilgileri görünür
   Then   açılan ürün sayfasında LOCATION bilgileri görünür


