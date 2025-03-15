
@US-10m @UI
Feature:
 Scenario:Price Range, Advert Type, Category, Country, City, District bölümlerini girerek özel arama yapabilmeli(positive)
   Given  search box ın üzerindeki rent butonuna tıklanır
   And    search box ın altındaki istenilen emlak seçilir
   And    search butonuna tıklanır
   And    gelen ürünlerden bir tanesi üzerine tıklayarak açılır
   And    Schedule a tour bölümünde geçerli geçerli bir tarih seçilir
   And    Schedule a tour bölümünde geçerli geçerli bir saat seçilir
   And    Submit a tour request butonuna basılır
   Then   TourRequest created successfully yazısı görünür


