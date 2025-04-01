public class Osoba {
    private String imie;
    private int wiek;
    private Adres adres;

    public Osoba(String imie, int wiek, Adres adres) {
        this.imie = imie;
        this.wiek = wiek;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", adres=" + adres +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
