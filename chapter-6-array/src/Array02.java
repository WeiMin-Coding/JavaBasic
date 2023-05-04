import java.util.Arrays;
import java.util.Scanner;

/**
 * 需求：输入5个成绩，将5个数据存入到数组中
 */

public class Array02 {
    public static void main(String[] args) {
        double scores[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入" + (i + 1) + "元素的值: ");
            scores[i] = scanner.nextDouble();
        }

        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "个元素的值：" + scores[i]);
        }
    }
}
