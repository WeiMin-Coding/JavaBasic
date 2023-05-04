import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组缩容
 */
public class ArrayReduce {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        while (true) {
            // 用户输入
            System.out.print(Arrays.toString(arr) + " 是否需要缩容: y/n ");
            Scanner scanner = new Scanner(System.in);
            String inputScanner = scanner.nextLine();
            if (inputScanner.equals("n")) {
                break;
            }
            // 1. 判断长度是否可以缩容
            if (arr.length <= 1) {
                System.out.println("当前只剩下最后一个元素，无法再缩减数组长度！！");
                break;
            }
            // 2. 新建一个数组，将除了最后一个元素以外的元素全部新增到新数组中
            int arrNew[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
    }
}
