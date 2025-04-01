public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, String model, int year, double maxSpeed, Engine engine, double loadCapacity) {
        super(brand, model, year, maxSpeed, engine);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Pojemność pasażerska: "+ loadCapacity + "osób" );
    }
}
