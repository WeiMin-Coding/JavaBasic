public class MethodParmeter01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        BB bb = new BB();
        bb.swap(a, b);
        System.out.println(a + " " + b);
    }
}

class BB {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
