//Apartman Yönetim Ssitemi
//Volkan AĞGÜNLÜ-1220505013

public class Main {
    public static void main(String[] args) {
        System.out.println("Konut Sistemi\n");
        //Belirlenmiş 2 adet daire için bilgilerin yazdırılması.
        Daire daire1 = new Daire("Lale Sok. ,Çiçek Mah. ,Papatya Apt", 4, 5, 5);
        daire1.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        System.out.println("-------------------");
        Daire daire2 = new Daire("Karaambar Sok., Yolcular Mah., Orkide Apt.", 5, 7, 4);
        daire2.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        System.out.println("-------------------");


        //Bina için adres ve kat sayısı bilgisi.
        Bina bina1 = new Bina("",8);
        bina1.displayInfo();//İlk bina için KAt bilgisi yazdırılır.
        Bina bina2= new Bina("g",4);
        bina2.displayInfo();//2. bina için KAT bilgisi yazdırılır.
        System.out.println("-------------------");


        //Belirlenen 2 Kiracı için bilgilerin yazdırılması.
        Kiraci kiraci1 = new Kiraci("Akın ", "Öztürk", "Aykut", " Elmas",3);
        Kiraci kiraci2 = new Kiraci("Aybüke ", "Kaya", "Serdar", " Şenboyar",1);
        kiraci1.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        kiraci2.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        System.out.println("-------------------");


        System.out.println("Bazı Ev sahiplerinin Bilgileri");
        //Belirlenen 3 Ev sahibi için bilgilerin yazdırılması.
        System.out.println("-------------------");
        EvSahibi evSahibi1 = new EvSahibi("Atalay", " Conkbayırı", 3);
        evSahibi1.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        System.out.println("-------------------");
        EvSahibi evSahibi2=new EvSahibi("Canan"," Arıburnu",2);
        evSahibi2.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.
        System.out.println("-------------------");
        EvSahibi evSahibi3= new EvSahibi("Yiğit","Eray",1);


        Daire daire3= new Daire("A Sokak B mah C Apt",3,7,4);
        evSahibi3.displayInfo();// Bilgileri displayInfo fonksiyonu ile yazdırırız.


        //Daire ekleme işlemi.
        evSahibi3.addApartment(daire1);
        evSahibi2.addApartment(daire2);
        evSahibi3.addApartment(daire3);
    }
}
