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
        System.out.println("\n");

        //Задание №1
        int[] monthlyExpenses = arr;
        int sum = 0;
        for (int i : monthlyExpenses) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nСумма трат за месяц составила " + sum + " рублей");
    }
}