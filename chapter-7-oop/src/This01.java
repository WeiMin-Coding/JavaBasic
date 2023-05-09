public class This01 {
    public static void main(String[] args) {
        Dog2 daHuang = new Dog2("DaHuang", 5);
        daHuang.info();
    }
}

class Dog2 {
    String name;
    int age;

    public Dog2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }

    public void info() {
        System.out.println(this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }
}
