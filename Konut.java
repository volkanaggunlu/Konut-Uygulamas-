public abstract class Konut {//Abstract olarak tanımlanmış Konut sınıfı.
    private String evAdresi;//Ev Adres bilgisini tutan değişken.
//Yapıcı metod
    public Konut(String evAdresi) {
        this.evAdresi=evAdresi;
    }
//Getter ve Setter kavramları.
    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
//Ev adresinin bilgisi için oluşturulan displayInfo metodu.

    public void displayInfo(){

    }

};