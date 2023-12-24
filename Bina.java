public class Bina extends Konut {

    private int numberofFloors; //Kat Sayısı.
//Yapıcı metod.
    public Bina(String evAdresi, int numberofFloors) {
        super(evAdresi);
        this.numberofFloors = numberofFloors;
    }
//Kat bilgisinin görüntülendiği displayInfo metodu.
    @Override
    public void displayInfo() {

        System.out.println("Bina Kat Sayısı Bilgisi : " + numberofFloors);
    }
}