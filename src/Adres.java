public class Adres {
    private String miasto;
    private String ulica;
    private String numer;
    private String kodPocztowy;

    public Adres(String miasto, String ulica, String numer, String kodPocztowy) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.numer = numer;
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numer='" + numer + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }

}
