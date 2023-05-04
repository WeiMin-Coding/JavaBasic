import java.util.Arrays;

/**
 * 需求：创建一个char类型的26个元素数组，分别放置'A'-'Z，使用for循环访问所有元素并打印出来
 * 提示：char类型数据元算：'A' + 1 = 'B'
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        char charArray[] = new char[26];
//        charArray[0] = 'A';
//
//        for (int i = 1; i < charArray.length; i++) {
//            charArray[i] = (char) (charArray[i - 1] + 1);
//            System.out.println(charArray[i]);
//        }
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('A' + i);
        }

        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
