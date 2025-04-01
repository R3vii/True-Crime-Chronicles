public class Car extends Vehicle{
    private int passengerCapacity;

    public Car(String brand, String model, int year, double maxSpeed, Engine engine, int passengerCapacity) {
        super(brand, model, year, maxSpeed, engine);
        this.passengerCapacity = passengerCapacity;
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Pojemność pasażerska: "+ passengerCapacity+ "osób" );
    }
}
