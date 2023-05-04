public class Object01 {
    public static void main(String[] args) {
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.color);

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.color);
    }
}

class Cat {
    String name;
    String color;
    int age;

    private void run() {
        System.out.println(this.name + " Run...");
    }
}
