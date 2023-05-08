public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod1 hspMethod1 = new HspMethod1();
        String s = hspMethod1.showScore("WeiMin", 100, 100, 100, 100);
        System.out.println(s);
    }
}

class HspMethod1 {
    public String showScore(String name, double... scores) {
        int res = 0;
        for (int i = 0; i < scores.length; i++) {
            res += scores[i];
        }
        return name + "有" + scores.length + "门课 总成绩：" + res;
    }
}
