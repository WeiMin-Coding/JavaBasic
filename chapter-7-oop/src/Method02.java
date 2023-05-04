public class Method02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        MyTools myTools = new MyTools();
        myTools.print(arr);
    }
}

class MyTools {
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
