/**
 * 需求：求出一个数组的和以及数组的平均值
 */
public class ArrayExercise03 {
    public static void main(String[] args) {
        double[] chickens = {3, 5, 1, 3.4, 2, 50};
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < chickens.length; i++) {
            sum += chickens[i];
        }
        avg = sum / (chickens.length + 1);
        
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
