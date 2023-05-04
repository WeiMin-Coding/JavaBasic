public class RecursionExercise01 {
    public static void main(String[] args) {
        Ac ac = new Ac();
        int res = ac.getFibonacciNumber(7);
        System.out.println("Res: " + res);
    }
}

class Ac {
    public int getFibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        }
    }
}
