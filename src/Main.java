import java.util.Arrays;

public class Main {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));

        //Задание №1
        int[] monthlyExpenses = arr;
        int sum = 0;
        for (int i : monthlyExpenses) {
            sum += i;
        }
        System.out.println("\nСумма трат за месяц составила " + sum + " рублей");

        //Задание №2
        System.out.println();
        int minSpend = 200_001;
        int maxSpend = 99_999;
        for (int i: monthlyExpenses){
            if (i < minSpend)
                    minSpend = i;
            else if (i > maxSpend)
                    maxSpend = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей. Максимальная сумма трат за день составила " + maxSpend + "рублей");

        //Задание №3
        System.out.println();
        float averageSpend = (float) sum / arr.length;
        System.out.println(averageSpend);
    }
}