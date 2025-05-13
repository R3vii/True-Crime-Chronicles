public class Main {

    //Zadanie 2
    public enum PizzaSize{

        MALA(20, 19.99), SREDNIA(30,27.99), DUZA(40,32.99);

        private final int rozmiar;
        private final double cena;

        PizzaSize(int rozmiar, double cena) {
            this.rozmiar = rozmiar;
            this.cena = cena;
        }

        public int getRozmiar() {
            return rozmiar;
        }

        public double getCena() {
            return cena;
        }
    }

    public static void main(String[] args) {
        PizzaSize.DUZA.getCena();
        PizzaSize.DUZA.getRozmiar();
    }
}