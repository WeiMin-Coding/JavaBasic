public class VarScopeDetail {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.say();

        T2 t2 = new T2();
        t2.test();
        t2.test2(person1);
    }
}

class T2 {
    public void test() {
        Person1 person1 = new Person1();
        System.out.println(person1.name);
    }

    public void test2(Person1 person1) {
        System.out.println(person1.name);
    }
}

class Person1 {
    public int age = 20;
    String name = "Jack";

    public void say() {
        String name = "King";
        System.out.println("Person1.say() name: " + name);
    }

    public void hi() {
        String address = "北京";
        // String address = "123";
        String name = "WeiMin";
    }
}
