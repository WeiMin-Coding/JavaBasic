/**
 * 数组的细节
 */
public class ArrayDetail {
    public static void main(String[] args) {
        // 1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理，不能存放不同的类型
        int[] arr1 = {1, 2, 3, 60};

        // 2. 数组中的元素可以是任何数据类型，包括基本数据类型和引用类型，但是不能混用
        double doubleArr[] = new double[2];
        String stringArr[] = new String[4];
        Object objectArr[] = new Object[5];
        objectArr[0] = new ArrayDetail();
    }
}
