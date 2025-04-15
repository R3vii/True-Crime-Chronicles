package Inheritance;

public class Main {
    public static void main(String[] args){
//        Zwierze zwierze = new Pies("Reksio");
//        zwierze.wydajDzwiek();
//        zwierze.info();


        FiguraGeometryczna figura = new Kwadrat(); {
            System.out.println("Pole kwadratu wynosi = "+figura.Pole());
            System.out.println("Obwód kwadratu wynosi = "+figura.Obwod());
        }

        Kwadrat kwadrat = new Kwadrat(); {
            System.out.println("Pole kwadratu wynosi = "+kwadrat.Pole());
            System.out.println("Obwód kwadratu wynosi = "+kwadrat.Obwod());
        }

    }
}
