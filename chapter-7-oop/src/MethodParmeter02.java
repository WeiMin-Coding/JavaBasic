import java.util.Arrays;

public class MethodParmeter02 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(Arrays.toString(arr));
        CC cc = new CC();
        cc.test100(arr);
        System.out.println(Arrays.toString(arr));

        C1 c1 = new C1();
        c1.name = "WeiMin";
        c1.age = 4433;
        cc.test200(c1);
        System.out.println(c1.name);

        int[][] arr1 = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        Persion persion = new Persion();
        persion.name = "WeiMin";
        System.out.println(persion + " " + persion.name);
        MyTools1 myTools1 = new MyTools1();
        myTools1.print(arr1);
        Persion persion1 = myTools1.copyPerson(persion);
        System.out.println(persion1 + " " + persion1.name);
    }
}

class CC {
    public void test100(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public void test200(C1 c1) {
//        c1.name = "Web";
        c1 = null;
    }
}

class C1 {
    String name;
    int age;
}

class MyTools1 {
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
