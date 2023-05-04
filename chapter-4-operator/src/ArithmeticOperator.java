public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10 / 4); // 从数字看是2.5，然而在java中是2
        System.out.println(10.0 / 4);   // 2.5

        double d = 10 / 4;
        System.out.println(d);  // 2 java中：10 / 4 = 2， 2 => 2.0

        System.out.println(10 % 3);

        int i = 10;
        i++;
        ++i;
        System.out.println("i=" + i);

        /*
           作为表达式使用
           前++：++i先自增后赋值
           后++：i++先赋值后自增
        */
        int j = 8;
        // int k = ++j; // 等价于 j=j+1；k=j;
        int k = j++;    // k=j; j=j+1
        System.out.println("j=" + j + ", k=" + k);
    }
}
