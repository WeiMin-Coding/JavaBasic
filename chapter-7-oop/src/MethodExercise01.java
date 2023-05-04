public class MethodExercise01 {
    public static void main(String[] args) {
        AA aa = new AA();
        boolean b = aa.isOdd(5);
        System.out.println(b);
        aa.print(4, 4, '#');
    }
}

class AA {
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public void print(int row, int column, char str) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
