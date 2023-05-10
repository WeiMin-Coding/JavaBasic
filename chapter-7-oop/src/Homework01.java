/**
 * 需求：定义方法max，实现求某个double数组的最大值，并返回
 */
public class Homework01 {
    public static void main(String[] args) {
        double[] arr = {1.1, 5.4, 66, 88.5, 44, 41.1, 11};
        Exercise exercise = new Exercise(arr);
        double max = exercise.max();
        System.out.println("Max Value: " + max);
    }
}

class Exercise {
    double[] arr;
    double maxValue;

    public Exercise() {
    }

    public Exercise(double[] arr) {
        this.arr = arr;
    }

    public double max(double[] arr) {
        if (arr.length == 0) return 0.0;
        if (arr.length <= 1) return arr[0];

        this.maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > this.maxValue) this.maxValue = arr[i];
        }

        return this.maxValue;
    }

    public double max() {
        if (this.arr.length == 0) return 0.0;
        if (this.arr.length <= 1) return this.arr[0];

        this.maxValue = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] > this.maxValue) this.maxValue = this.arr[i];
        }

        return this.maxValue;
    }
}
