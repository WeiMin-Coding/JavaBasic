public class TestPerson {
    public static void main(String[] args) {
        Persion5 weiMin = new Persion5("WeiMin", 55);
        Persion5 weiMin1 = new Persion5("WeiMin", 55);

        boolean res = weiMin.compareTo(weiMin1);
        System.out.println(res);
    }
}

class Persion5 {
    String name;
    int age;

    Persion5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Persion5 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}