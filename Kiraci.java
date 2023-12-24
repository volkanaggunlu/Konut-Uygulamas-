public class Kiraci extends EvSahibi{
    private String kiraciIsim;//Kiracının ismi
    private String kiraciSoyIsim;//Kiracının soyismi
//Yapıcı metod
  Kiraci(String kiraciIsim,String kiraciSoyIsim,String evSahibiIsim,String evSahibiSoyisim,int evSayisi){
      super(evSahibiIsim,evSahibiSoyisim,evSayisi);
      this.kiraciIsim=kiraciIsim;
      this.kiraciSoyIsim=kiraciSoyIsim;
  }

//Get ve Set.
    public String getKiraciIsim() {
        return kiraciIsim;
    }

    public void setKiraciIsim(String kiraciIsim) {
        this.kiraciIsim = kiraciIsim;
    }

    public String getKiraciSoyIsim() {
        return kiraciSoyIsim;
    }

    public void setKiraciSoyIsim(String kiraciSoyIsim) {
        this.kiraciSoyIsim = kiraciSoyIsim;
    }
//Kiracıya ait bilgilerin görüntülendiği displayInfo metodu.
public void displayInfo() {
      System.out.println("Kiracıya ait bilgiler\n");
    System.out.println("Kiracının ismi ve soyismi: " + getKiraciIsim() + getKiraciSoyIsim());
    System.out.println("Kiralanan evin sahibinin ismi ve soyismi: "+getEvSahibiIsim() + getEvSahibiSoyisim());

    }
}