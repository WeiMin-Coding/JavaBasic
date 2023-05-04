import java.util.Arrays;

/**
 * 冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {24, 69, 80, 57, 13};
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (arr.length - i) + "轮 " + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
