public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        T t = new T();
        t.f1(arr);

    }
}

class T {
    public void f1(int... nums) {
        System.out.println(nums.length);
    }

    public void f2(String str, double... nums) {

    }

//    public void f2(int... nums, int... nums) {
//
//    }
}