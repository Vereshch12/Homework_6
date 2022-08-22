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
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");

        //Задание №4
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

        //Задание №5
        System.out.println("\n");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if ((i == j) || (i == matrix.length - 1 - j))
                    matrix[i][j] = 1;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание №6
        System.out.println();
        int[] arr1 = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr1));
        int[] auxiliaryArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
            auxiliaryArr[auxiliaryArr.length - 1 - i] = arr1[i];
        for (int i = 0; i < auxiliaryArr.length; i++)
            arr1[i] = auxiliaryArr [i];
        System.out.println(Arrays.toString(arr1));

        //Задание №7
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        int r; //вспомогательная переменная
        for (int i = 0; i < (arr1.length) / 2; i++){
            r = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = r;
        }
        System.out.println(Arrays.toString(arr1));

        //Задание №8
        System.out.println();
        int[] arrNum = {-6,2,5,-8,8,10,4,-7,12,1};
        boolean flag = false;
        for (int i = 0; i < arrNum.length / 2; i++){
            for (int j = arrNum.length - 1;j >= arrNum.length / 2; j--){
                if (arrNum[i] + arrNum[j] == -2) {
                    System.out.println(arrNum[i] + " " + arrNum[j]);
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }
    }
}