import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = new int[arr1.length];

        arr2 = arr1;
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
