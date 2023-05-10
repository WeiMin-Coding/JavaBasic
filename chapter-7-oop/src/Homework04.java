public class Homework04 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};
        A03 a03 = new A03();
        int[] ints = a03.copyArr(intArr);
        System.out.println(ints.hashCode());
    }
}

class A03 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length + 1];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        System.out.println("Old Arr: " + oldArr.hashCode() +
                " " +
                "New Arr: " + newArr.hashCode());
        return newArr;
    }
}
