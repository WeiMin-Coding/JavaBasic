public class Method01 {
    public static void main(String[] args) {
        Person01 weimin = new Person01();
        weimin.speak();
        weimin.cal01();
        weimin.cal02(1000);
        int sum = weimin.getSum(1, 2);
        System.out.println(sum);
    }
}

class Person01 {
    String name;
    int age;

    public void speak() {
        System.out.println("我是一个好人！");
    }

    // 需求：实现从1到100的计算结果
    public void cal01() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println("Result: " + result);
    }

    public void cal02(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("Result: " + result);
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }
}
