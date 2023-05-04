public class ArithmeticOperatorExrcise03 {
    public static void main(String[] args) {
        // 需求：定义一个变量保存华氏温度，华氏温度转换摄氏度的公式为：5/9*(华氏温度-100)
        // 请求出华氏温度对应的摄氏温度。[234.5]
        double fahrenheit = 234.5;
        double temperature = 5.0 / 9.0 * (fahrenheit - 100);
        System.out.println(fahrenheit + "=>" + temperature);
    }
}