public class MethodExercise02 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        Persion persion = new Persion();
        persion.name = "WeiMin";
        MyTools2 myTools2 = new MyTools2();
        myTools2.print(arr1);
        Persion persion1 = myTools2.copyPerson(persion);
        System.out.println(persion + " " + persion.name);
        System.out.println(persion1 + " " + persion1.name);
        System.out.println(persion.hashCode());
        System.out.println(persion1.hashCode());
        System.out.println(persion == persion1);
    }
}

class MyTools2 {
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Persion copyPerson(Persion persion) {
        Persion newPersion = new Persion();
        newPersion.name = persion.name;
        return newPersion;
    }
}
