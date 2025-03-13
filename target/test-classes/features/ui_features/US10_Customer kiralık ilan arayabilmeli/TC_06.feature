
<<<<<<< HEAD
@US-10 @UI
Feature:
 Scenario:Price Range, Advert Type, Category, Country, City, District bölümlerini girerek özel arama yapabilmeli(positive)
   Given  search box ın üzerindeki rent butonuna tıklanır
   And    search butonuna tıklanır
   And    açılan sol pencerede Price Range bölümünde min kutusuna geçerli bir data girilir
   And    açılan sol pencerede Price Range bölümünde max kutusuna geçerli ve min kutusundaki değerden büyük bir data girilri
   And    Advert Type, Category, dropdownlarında all seçeneği seçilir
   And    Country,City,District  dropdown ından herhangi bir seçenek seçilir
   Then   search butonuna tıklanır
   Then   arama sonucunun başarılı olduğu görülür
=======
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

>>>>>>> master

