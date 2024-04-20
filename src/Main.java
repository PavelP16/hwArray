import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1__________________________________________________________________________");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weightD = new double[3];
        weightD[0] = 1.57;
        weightD[1] = 7.654;
        weightD[2] = 9.986;

        int[] weightArbitrary = new int[3];
        weightArbitrary[0] = 0;
        weightArbitrary[1] = 1;
        weightArbitrary[2] = 2;

        System.out.println("\nЗадача №2__________________________________________________________________________");

        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(weightD));
        System.out.println(Arrays.toString(weightArbitrary));

        System.out.println("\nЗадача №3__________________________________________________________________________");

        int i;
        for (i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ",");
        }
        System.out.println("\n");

        for (i = weightD.length - 1; i >= 0; i--) {
            System.out.print(weightD[i] + ",");
        }

        System.out.println("\n");

        for (i = weightArbitrary.length - 1; i >= 0; i--) {
            System.out.print(weightArbitrary[i] + ",");
        }


        System.out.println("\nЗадача №4__________________________________________________________________________");

        for (i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
            System.out.print(weight[i] + " ");
        }


    }
}
