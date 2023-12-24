import java.util.ArrayList;

public class EvSahibi {
    private String evSahibiIsim;//Ev sahibinin ismi
    private String evSahibiSoyisim;//Ev sahibinin soyismi
    private int evSayisi;//Ev sahibinin sahip olduğu ev sayısı.
    private ArrayList<Daire> daireler; //Daire ekleme işlemi için kullanılan ArrayList.
//Yapıcı metod(constructor)
    EvSahibi(String evSahibiIsim, String evSahibiSoyisim, int evSayisi) {
        super();
        this.evSahibiIsim = evSahibiIsim;
        this.evSahibiSoyisim = evSahibiSoyisim;
        this.evSayisi = evSayisi;
        this.daireler =new ArrayList<>();
    }

    void addApartment(Daire daire) {
        daireler.add(daire);
        }


//Getter ve Setter ile kapsülleme.
    public String getEvSahibiIsim() {
        return evSahibiIsim;
    }

    public void setEvSahibiIsim(String evSahibiIsim) {
        this.evSahibiIsim = evSahibiIsim;
    }

    public String getEvSahibiSoyisim() {
        return evSahibiSoyisim;
    }

    public void setEvSahibiSoyisim(String evSahibiSoyisim) {
        this.evSahibiSoyisim = evSahibiSoyisim;
    }

    public int getEvSayisi() {
        return evSayisi;
    }

    public void setEvSayisi(int evSayisi) {
        this.evSayisi = evSayisi;
    }
//Ev sahibinin bilgilerinin görüntülenmesi için oluşturulmuş displayInfo metodu.
    public void displayInfo(){
            System.out.println("Ev Sahibine ait bilgiler\n");
            System.out.println("Ev Sahibinin ismi ve Soyismi: " + getEvSahibiIsim() + getEvSahibiSoyisim());
            System.out.println("Ev Sahibine ait evlerin sayısı: " + evSayisi);
    }
}
