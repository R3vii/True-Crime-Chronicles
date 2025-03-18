import Zadanie.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Oliwer","Strzałka",20);
        Osoba osoba2 = new Osoba("Marian",55);
        Osoba osoba3 = new Osoba();

        osoba1.pokazDane();
        osoba2.pokazDane();
        osoba3.pokazDane();
    }
}