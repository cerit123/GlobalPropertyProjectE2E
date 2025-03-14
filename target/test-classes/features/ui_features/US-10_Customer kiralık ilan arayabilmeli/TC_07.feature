
@US-10m @UI @Costumer
Feature:
 Scenario:Price Range, Advert Type, Category, Country, City, District bölümlerini girerek özel arama yapabilmeli(positive)
   Given  search box ın üzerindeki rent butonuna tıklanır
   And    search box ın altındaki istenilen emlak seçilir
   And    search butonuna tıklanır
   And    gelen ürünlerden bir tanesi üzerine tıklayarak açılır
   And    contact number kutusundan görünürlüğü açılır
   Then   send mail kutusundan görünürlüğü açılır
   Then   contact number ve mail görünür olur


