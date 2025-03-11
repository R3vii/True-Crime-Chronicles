public class TaskArr {

    public static void TaskArr1(){
        InputData input = new InputData();
        System.out.println("Podaj początek przedziału: ");
        int a = input.InputInt();
        System.out.println("Podaj koniec przedziału: ");
        int b = input.InputInt();
        System.out.println("Podaj ilość elementów tablicy: ");
        int ilosc = input.InputInt();

        int[]arr = RandomValue.RandValueArr(a,b,ilosc);
        float suma = 0;
        System.out.println("Elementy tablicy: ");
        for (int item:arr) {
            System.out.println(item + " ");
            suma+=item;
        }
        System.out.println("Suma elementów tablicy: "+ suma);
        System.out.println("Średnia elementów tablicy: "+ (suma/ arr.length));
    }
}
