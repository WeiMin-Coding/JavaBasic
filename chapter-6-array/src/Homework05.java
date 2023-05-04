import java.util.Arrays;
import java.util.Random;

public class Homework05 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(99);
            arr[i] = randomNum;
        }

        int maxValue;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    maxValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = maxValue;
                }
            }
        }

        int sum = 0;
        boolean findNum = false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 8) {
                findNum = true;
            }
        }

        System.out.println(Arrays.toString(arr) +
                "\n Max Index: " + 0 +
                "\n Max Value: " + arr[0] +
                "\n Avg: " + (sum / arr.length) +
                "\n Find 8? " + findNum);
    }
}
