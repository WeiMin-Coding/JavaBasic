public class RecursionExercise02 {
    public static void main(String[] args) {
        Ac1 ac1 = new Ac1();
        ac1.peach(11);
    }
}

class Ac1 {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1&& day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day 在1-10");
            return -1;
        }
    }
}
