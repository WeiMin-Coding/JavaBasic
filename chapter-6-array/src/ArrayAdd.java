import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组的扩容
 * 需求：实现动态给数组添加元素效果，实现对数组的扩容。
 */

public class ArrayAdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.print(Arrays.toString(arr));
            System.out.print("当前数组长度为: " + arr.length + " ");
            System.out.print("请输入需要添加的元素: ");
            int addNum = scanner.nextInt();
            int newArr[] = new int[arr.length + 1];
            newArr[arr.length] = addNum;
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.print("添加成功！ " + Arrays.toString(arr) + " 是否扩容数组长度? y/n ");
            String key = scanner2.nextLine();
            if (key.equals("n")) {
                break;
            }
        }
    }
}
