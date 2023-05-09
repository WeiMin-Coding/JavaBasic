public class Constructor01 {
    public static void main(String[] args) {
        Persion2 persion2 = new Persion2("WeiMin", 99);
        System.out.println("persion2 name: " + persion2.name);
        System.out.println("persion2 age: " + persion2.age);
    }
}

class Persion2 {
    String name;
    int age;

    public Persion2(String pName, int pAge) {
        System.out.println("构造器被调用，完成对象的属性初始化。");
        name = pName;
        age = pAge;
    }
}
