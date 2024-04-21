
public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача №1____________________________________________________________________________");

        int[] expenses = {15_000, 20_000, 25_000, 30_000, 35_000};

        int sumExpenses = 0;
        for (int expens : expenses) {
            sumExpenses += expens;
        }
        System.out.printf("«Сумма трат за месяц составила %s рублей».\n", sumExpenses);


        System.out.println("\nЗадача №2____________________________________________________________________________");

        int[] expensesMaxMin = {5_000, 20_000, 25_000, 30_000, 40_000};

        int minEpenses = expensesMaxMin[0];
        int maxEpenses = expensesMaxMin[0];

        for (int i : expensesMaxMin) {
            if (i > maxEpenses) {
                maxEpenses = i;
            }
            if (i < minEpenses) {
                minEpenses = i;
            }
        }
        System.out.printf("«Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей».\n",
                minEpenses
                , maxEpenses);


        System.out.println("\nЗадача №3____________________________________________________________________________");

        int[] sum = {7_000, 11_000, 16_000, 20_000, 27_000};

        int averageSum = 0;
        for (int salary : sum) {
            averageSum += salary;
        }
        int averageSalary = averageSum / sum.length;
        System.out.printf("«Средняя сумма трат за месяц составила %s рублей».\n", averageSalary);


        System.out.println("\nЗадача №4____________________________________________________________________________");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }

}

