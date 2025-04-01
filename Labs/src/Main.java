import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("jak nowak",20,new
                Adres("Rzeszów","Rejtana","16C","35-959"));
        System.out.println(osoba.toString());

        Adres adres = new Adres("Rzeszów","Rejtana","16C","35-959");
        Osoba osoba1 = new Osoba("Janina Kowalska",21,adres);
        System.out.println(osoba1.toString());

        Student student = new Student("Jan Nowak",22,adres,"jn12345","Informatyka i Ekonometria");

    }
}