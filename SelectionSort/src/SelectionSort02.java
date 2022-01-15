import java.util.Comparator;

/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName SelectionSort.java
 * @Description 选择排序 （原地排序）
 * @createTime 2022年01月14日 21:29:00
 */
public class SelectionSort02 {
    private SelectionSort02(){}
    public static <E extends Comparable<E>> void sort(E[] arr){

        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n)中的最小值对应的索引
            // 首先默认认为 第 i 个数是最小的
            int minIndex = i;
            // 从 i  开始往后找
            for (int j = i; j < arr.length; j++) {
                // 找到 比 i 位置上的数小的数就记录他的索引
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            // 交换位置
            swap(arr,i,minIndex);
        }
    }
    /**
     * 将最小的数放在最前位置
     * @param arr
     * @param i
     * @param minIndex
     */
    private static <E> void swap(E[] arr, int i, int minIndex) {
        E temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,4,2,3,6,5};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Student[] students = {
                new Student("tom",98),
                new Student("jerry",100),
                new Student("haiyang",80)
        };

        SelectionSort02.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
