public class ConstructorDetail {
    public static void main(String[] args) {
        Persion3 p1 = new Persion3("WeiMin", 80);
        Persion3 p2 = new Persion3("WeiMin");

        Dog dog = new Dog();
    }
}

class Dog {
    Dog() {

    }

    Dog(String dName) {

    }
}

class Persion3 {
    String name;
    int age;
    Persion3(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    Persion3(String pName) {
        name = pName;
    }
}
