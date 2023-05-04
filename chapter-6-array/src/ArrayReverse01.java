import java.util.Arrays;

/**
 * 数组反转方式一
 */

public class ArrayReverse01 {
    public static void main(String[] args) {
        int arr[] = {11, 23, 33, 44, 55, 66};

        int temp;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}