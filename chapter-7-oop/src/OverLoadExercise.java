public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(10);
        methods.m(10);
        double max = methods.max(1.1, 2.3, 3.3);
        System.out.println(max);

        System.out.println(methods.max(10, 24));
    }
}

class Methods {
    public int m(int n1) {
        int res = n1 * n1;
        System.out.println(res);
        return res;
    }

    public int m(int n1, int n2) {
        int res = (n1 * n2);
        System.out.println(res);
        return res;
    }

    public String m(String s) {
        System.out.println(s);
        return s;
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double d1, double d2) {
        return d1 > d2 ? d1 : d2;
    }

    public double max(double d1, double d2, double d3) {
        return d1 > d2 ? (d1 > d3 ? d1 : d3) : (d2 > d3 ? d2 : d3);
    }
}
