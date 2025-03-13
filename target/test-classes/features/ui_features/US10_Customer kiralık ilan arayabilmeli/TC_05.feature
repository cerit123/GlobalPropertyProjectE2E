
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
  Scenario:Price Range max box ına min değerinden küçük  değer girldiğinde hata mesajı vemeli (negative)
    Given  sayfaya gidilir
    And    search box ın üzerindeki rent butonuna tıklanır
    And    search butonuna tıklanır
    And    açılan sol pencerede Price Range bölümünde min kutusuna bir değer girilir
    And    açılan sol pencerede Price Range bölümünde max kutusuna miinimum değerden küçük bir değer girilir
    And    Advert Type, Category, Country dropdownlarında all seçeneği seçilmelidir
    And    City ve District  dropdownları boş olmalıdır
    Then   search butonuna tıklanır
    Then   uyarı mesajı görülmelidir
    Then   sayfa kapatılır
>>>>>>> master

