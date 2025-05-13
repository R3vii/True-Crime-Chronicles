public class Main {

//    public enum TrafficLight{
//        RED(30), YELLOW(5), GREEN(25);
//        private final int durationInSeconds;
//
//        TrafficLight(int durationInSeconds) {
//            this.durationInSeconds = durationInSeconds;
//        }
//
//        public int getDurationInSeconds() {
//            return durationInSeconds;
//        }
//        //metody
//
//
//    }
//    public enum Day {
//        poniedziałek, wtorek, środa, czwartek, piątek, sobota, niedziela
//    }
//
//    public static void main(String[] args) {
//        Day today = Day.środa;
//
//        switch (today){
//            case poniedziałek -> System.out.println("Początek tygodnia");
//            case piątek -> System.out.println("Koniec tygodnia");
//            default -> System.out.println("Inny dzień");
//        }
//
//        for (TrafficLight light: TrafficLight.values()){
//            System.out.println(light+ "  lasts "+light.getDurationInSeconds()+ " seconds");
//            System.out.println(light.name() + " ma indeks: "+light.ordinal());
//        }
//
//
//
//    }

// ================== ↑↑↑ SKRYPT ZROBIONY NA ZAJĘCIACH ↑↑↑ ==================


    public enum Swiatlo{
        CZERWONE("Stój!"), ŻÓŁTE("Uwaga!"), ZIELONE("Jedź!");
        private String komunikat;

        Swiatlo(String komunikat) {
            this.komunikat = komunikat;
        }

        public String getKomunikat() {
            return komunikat;
        }
    }

    



    public static void main(String[] args) {
        Swiatlo teraz = Swiatlo.CZERWONE;

        switch (teraz){
            case CZERWONE -> System.out.println("Stój");
            case ŻÓŁTE -> System.out.println("Uwaga");
            case ZIELONE -> System.out.println("Jedź");
       }


    }



}