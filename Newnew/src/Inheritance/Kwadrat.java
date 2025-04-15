package Inheritance;

public class Kwadrat implements FiguraGeometryczna {
    double bok = 4;

    @Override
    public double Pole() {
        return bok*bok;
    }

    @Override
    public double Obwod() {
        return 4*bok;
    }
}
