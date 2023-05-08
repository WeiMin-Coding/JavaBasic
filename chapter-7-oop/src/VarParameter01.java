import java.util.Arrays;

public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        int sum = hspMethod.sum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
}

class HspMethod {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int sum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    public int sum(int... nums) {
        System.out.println(Arrays.toString(nums));
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}