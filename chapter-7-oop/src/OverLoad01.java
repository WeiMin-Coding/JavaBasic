public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.calculate();
    }
}

class MyCalculator {
    public void calculate() {

    }
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}
