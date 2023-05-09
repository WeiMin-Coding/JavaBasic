public class ConstructorExercise {
    public static void main(String[] args) {
        Persion4 p1 = new Persion4();
        System.out.println(p1);

        Persion4 p2 = new Persion4("WeiMin", 2222);
        System.out.println(p2);
    }
}

class Persion4 {
    String name;
    int age;
    Persion4() {
        age = 88;
    }

    Persion4(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    @Override
    public String toString() {
        return "Persion4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
