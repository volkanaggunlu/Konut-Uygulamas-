# Konut-Uygulaması


Java dilinde bir konut sistemi oluşturulmuştur.
Bu sistem içerisinde EvSahibi,Daire,Bina,Konut ve Kiracı ismindeki sınıflar bulunmaktadır.
Bina sınıfı binayı tanımlar ve soyut Konut sınıfından Adres bilgisini Miras alır.
Daire sınıfı daire tanımlamalarını yapar ve yine Konut sınıfından Adres bilgisini miras alır.
Kiracı sınıfı Kiracı bilgilerini içerir ve aynı zamanda kiralanan evin sahiplerinin bilgilerini EvSahibi sınıfından miras alarak(Extend) içinde bulundurur.
EvSahibi sınfıı ev sahiplerinin bilgilerini bulundurur.
Main sınıfında ise tüm Sınıflar .displayInfo ismindeki metod ile birlikte bilgilerin görüntülenmesi amacıyla çağrılmaktadır.




