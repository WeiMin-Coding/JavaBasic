public class ArithmeticOperatorExrcise02 {
    public static void main(String[] args) {
        // 1. 需求：加入还有59天放假，请问合计xx个星期零xx天
        // 2. 思路分析
        // 2.1 使用int变量存放天数days
        // 2.1 一个星期=days/7 天=days % 7
        int days = 259;
        int week = days / 7;
        int day = days % 7;
        System.out.println(days + "合计" + week + "个星期" + day + "天");
    }
}