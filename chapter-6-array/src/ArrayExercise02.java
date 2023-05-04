/**
 * 需求：请求出一个数组double[]最大的值{4, -1.9, 10, 23}，并得到对应的下标
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
        double doubleArray[] = {4, -1.9, 10, 99, 23, 100};
        double maxValue = 0;
        int maxIndex = 0;
        for (int i = 1; i < doubleArray.length; i++) {
            if (doubleArray[i] > doubleArray[maxIndex]) {
                maxIndex = i;
                maxValue = doubleArray[maxIndex];
            }
        }
        System.out.println("Max Index: " + maxIndex);
        System.out.println("Max Value: " + maxValue);
    }
}
