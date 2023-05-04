import java.util.Arrays;
import java.util.Scanner;

/**
 * 查找
 * 顺序查找
 */
public class SeqSearch {
    public static void main(String[] args) {
        String[] arrStr = {"白眉鹰王", "金毛狮王", "青翼蝠忘", "紫衫龙王"};

        while (true) {
            int flag = 1;
            System.out.print(Arrays.toString(arrStr));
            System.out.print(" 请输入需要查找的值：");
            Scanner scanner = new Scanner(System.in);
            String inputStr = scanner.nextLine();
            for (int i = 0; i < arrStr.length; i++) {
                if (inputStr.equals(arrStr[i])) {
                    flag = 0;
                    System.out.println("查找成功！" + arrStr[i] + " " + i);
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("查找失败！");
            }
        }

    }
}
