public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.calculate(1.1, 1.2);
        myCalculator.calculate(1, 2);
    }
}

class MyCalculator {
    public int calculate(int n1, int n2) {
        System.out.println("calculate(int n1, int n2)");
        return n1 + n2;
    }

    public double calculate(int n1, double n2) {
        System.out.println("calculate(int n1, double n2)");
        return n1 + n2;
    }

    public double calculate(double n1, double n2) {
        System.out.println("calculate(double n1, double n2)");
        return n1 + n2;
    }

    public int calculate(int n1, int n2, int n3) {
        System.out.println("calculate(int n1, int n2, int n3)");
        return n1 + n2 + n3;
    }
}