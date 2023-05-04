import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            index = arr.length;
        }

        int[] arrNew = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i == index) {
                arrNew[j] = insertNum;
                continue;
            }
            arrNew[i] = arr[j];
            j++;
        }

        System.out.println(Arrays.toString(arrNew));
    }
}
