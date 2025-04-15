package Inheritance;

public class Pies extends Zwierze {

    public Pies(String imie) {
        super(imie);
    }


    @Override
    public void wydajDzwiek() {
        System.out.println("Hau hau");
    }
}
