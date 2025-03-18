package ClassExample;

public class Samochod {
    //pola klasy
    public String marka, model;
    public int rokProdukcji;
    Pojazd typPojazdu;

    public Samochod(String bugatti, String chino, int rokProdukcji, String osobowy) {
    }
    //metoda


    public void view(){
        System.out.println("Samochód:\n"+
                "Marka: "+ marka+"\tModel: "+model
                +"\tRok produkcji+ "+rokProdukcji);
    }

    public Samochod(){
        this.marka = "";
        this.model = "";
        this.rokProdukcji = 0;
    }

    public Samochod(String marka) {
        this.marka = marka;
    }

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;

    }

    public Samochod(String marka, String model, int rokProdukcji, Pojazd typPojazdu){
        this.typPojazdu = typPojazdu;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }
}
