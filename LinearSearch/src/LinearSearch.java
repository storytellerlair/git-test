/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName LinearSearch.java
 * @Description TODO
 * @createTime 2022年01月12日 21:37:00
 */
public class LinearSearch {

    private LinearSearch(){}
    // 泛型方法的定义
    public static <E> int search(E[] data,E target){
        for (int i = 0; i < data.length; i++) {
            // 因为参数成了引用类型，不能使用 == 进行比较
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 100000;
        Integer[] data = ArrayGenerator.generateOrderedArray(n);

        long startTime = System.nanoTime();
        LinearSearch.search(data, n);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println(time + "s");
//        System.out.println(res);
//
//        int res2 = LinearSearch.search(data, 666);
//        System.out.println(res2);
//
//        Student[] students = {new Student("Tom"),new Student("jerry"),new Student("haiyang")};
//
//        int res3 = LinearSearch.search(students, new Student("haiyang"));
//        System.out.println(res3);

    }
}
