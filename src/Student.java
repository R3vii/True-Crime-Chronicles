public class Student extends Osoba{
    String nrAlbumu;
    String kierunek;

    public Student(String imie, int wiek, Adres adres, String nrAlbumu, String kierunek) {
        super(imie, wiek, adres);
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "nrAlbumu='" + nrAlbumu + '\'' +
                ", kierunek='" + kierunek + '\'' +
                '}';
    }
}
