public class Exercise01 {
    public static void main(String[] args) {
        double number = 100000;
        int number2 = 0;
        while (number >= 0) {
            if (number > 50000) {
                number = number - (number * 0.05);
            } else if (number <= 50000) {
                number = number - 1000;
            }

            number2 += 1;
        }

        System.out.println(number2);
    }
}
