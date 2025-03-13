
<<<<<<< HEAD
@US-10 @UI
=======
@US-10 @UI @Costumer
>>>>>>> master
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

