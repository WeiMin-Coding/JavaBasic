public class Homework02 {
    public static void main(String[] args) {
        String[] strArr = {"asdasdasd", "asdasd", "cccccc"};
        A02 a02 = new A02();
        int res = a02.find(strArr, 'c');
        System.out.println(res);
    }
}

class A02 {
    String[] strArr;

    public int find(String[] strArr, char str) {
        int strIndex = -1;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == str) {
                    strIndex = i;
                }
            }
        }

        return strIndex;
    }
}