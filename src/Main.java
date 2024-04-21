import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1__________________________________________________________________________");

        int[] weight = new int[3]; // Запись массива вариант 1
        weight[0] = 1; // присваиваем значение массиву
        weight[1] = 2;
        weight[2] = 3;

        double[] weightD = {1.57, 7.654, 9.986}; // Запись массива вариант 2


        int[] weightArbitrary = new int[3];
        weightArbitrary[0] = 0;
        weightArbitrary[1] = 1;
        weightArbitrary[2] = 2;

        System.out.println("\nЗадача №2__________________________________________________________________________");

        System.out.println("\nВариант 1");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(weightD));
        System.out.println(Arrays.toString(weightArbitrary));

        System.out.println("\nВариант 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]+ ",");
        }

        System.out.println("\nВариант 3");

        for (int i = 0; i < weightD.length; i++) { // выводим все значание массива в строку
            System.out.print(weightD[i]);
            if (i != weightD.length -1){ //используем для печати запятой
                System.out.print(", ");

            }
        }



        System.out.println("\nЗадача №3__________________________________________________________________________");
        System.out.println("\nВариант 1");
        int i;
        for (i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ",");
        }
        System.out.println("\n");

        for (i = weightD.length - 1; i >= 0; i--) {
            System.out.print(weightD[i] + ",");
        }

        System.out.println("\n");

        System.out.println("\nВариант 2");

        for (i = weightArbitrary.length - 1; i >= 0; i--) {
            System.out.print(weightArbitrary[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }


        System.out.println("\n\nЗадача №4__________________________________________________________________________");

        for (i = 0; i < weight.length; i++) { // прохо по массиву
            if (weight[i] % 2 != 0) { // если значение массив не четный
                weight[i]++; // тогда мы увеличиваем значение на +1
            }
            System.out.print(weight[i] + " ");
        }


    }
}
