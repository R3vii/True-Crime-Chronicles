package Inheritance;

public abstract class Zwierze {
    private String nazwa;
    public Zwierze(String imie){
        this.nazwa = nazwa;
    }

    abstract void wydajDzwiek(); // metoda abstrakcyjna

    public void info(){
        System.out.println("Zwierze o nazwie: "+ nazwa);
    }
}
