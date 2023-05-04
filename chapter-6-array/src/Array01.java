public class Array01 {
    public static void main(String[] args) {
        // 需求：一个养鸡场有6只鸡，它们的体重分别是3kg、5kg、1kg、3.4kg、2kg、50kg。请问这六只鸡的总体重是多少？平均体重是多少？
        double chicken1 = 3;
        double chicken2 = 5;
        double chicken3 = 1;
        double chicken4 = 3.4;
        double chicken5 = 2;
        double chicken6 = 50;

        double totalWeight = chicken1 + chicken2 + chicken3 + chicken4 + chicken5 + chicken6;
        double avgWeight = totalWeight / 6;

        System.out.println("普通方式实现-总体重：" + totalWeight);
        System.out.println("普通方式实现-平均体重：" + avgWeight);

        System.out.println("数组实现");

        // 1. 定一个数组，double[]表示double类型的数组
        // 2. {3, 5, 1, 3.4, 2, 50} 表示数组的值，依次表示数组的第几个元素
        double[] chickens = {3, 5, 1, 3.4, 2, 50};

        // 通过数组实现需求
        // 遍历数组得到数组的所有元素的和
        totalWeight = 0;
        for (int i = 0; i < chickens.length; i++) {
            totalWeight += chickens[i];
            System.out.println("第" + (i + 1) + "个元素的值=" + chickens[i]);
        }
        avgWeight = totalWeight / 6;
        System.out.println("数组实现-总体重：" + totalWeight);
        System.out.println("数组实现-平均体重：" + avgWeight);
    }
}
