public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;
    Engine engine;

    public Vehicle(String brand, String model, int year, double maxSpeed, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }



    public void displayInfo(){
        System.out.println("****** Pojazd *******"+
                "\nMarka: "+brand+
                "\nModel: "+model+
                "\nRok produkcji: "+year+
                "\nMax prędkość: "+maxSpeed
        );
    }
}
