public class VarScope {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        cat1.hi();
        cat1.cry();
        cat1.eat();
    }
}

class Cat1 {
    int age = 10;
    double weight;

    public void hi() {
        int num = 1;
        String address = "北京的猫";
        System.out.println("num: " + num);
        System.out.println("Address: " + address);
        System.out.println("Weight: " + weight);
    }

    public void cry() {
        int n = 10;
        String name = "Jack";
        System.out.println("Cat1.cry() age: " + age);
    }

    public void eat() {
        System.out.println("Cat1.eat() age: " + age);
    }
}