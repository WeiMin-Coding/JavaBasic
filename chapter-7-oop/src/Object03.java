public class Object03 {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.name = "WeiMin";
        Persion b;
        b = persion;
        b = null;
        System.out.println(persion.name);
        System.out.println(b.name);
    }
}

class Persion {
    String name;
}
