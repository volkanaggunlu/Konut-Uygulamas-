public class Daire extends Konut implements Comparable<Daire> {
    private int odaSayisi; // Daire'nin Oda Sayısı private olarak tanımlandı.
    private int daireNumarasi;//Daire Numarası
    private int numberofFloors; //Kat mumarası

    //Yapıcı Daire metodu
    public Daire(String evAdresi, int odaSayisi, int daireNumarasi, int numberofFloors) {
        super(evAdresi);//Konut sınıfından evAdresi super ile alınır
        this.odaSayisi = odaSayisi;
        this.daireNumarasi = daireNumarasi;
        this.setNumberofFloors(numberofFloors);
    }

    //Daire Numaralarının karşılaştırılması
    public int compareTo(Daire daire) {
        return this.getDaireNumarasi() - daire.daireNumarasi;
    }

    ;

    //Tüm getter ve setterlar aşağıdaki gibidir.
    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getDaireNumarasi() {
        return daireNumarasi;
    }

    public void setDaireNumarasi(int daireNumarasi) {
        this.daireNumarasi = daireNumarasi;
    }

    public int getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(int numberofFloors) {
        this.numberofFloors = numberofFloors;
    }

    //displayInfo içine Daire bilgileri yazılır. Soyut Konut sınıfından Override edilir.
    @Override
    public void displayInfo() {
        System.out.println("Daire Bilgileri\n");
        System.out.println("Adres Bilgisi : " + getEvAdresi());//Adres Bilgisi.
        System.out.println("Oda Sayısı : " + getOdaSayisi());//Oda Sayısı Bilgisi.
        System.out.println("Daire Numarası : " + getDaireNumarasi());//Daire Numarası Bilgisi.
        System.out.println("Kat Numarası : " + getNumberofFloors());//Kat Numarası Bilgisi.
    }
}
