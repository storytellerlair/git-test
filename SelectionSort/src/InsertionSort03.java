/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName InsertionSort03.java
 * @Description 插入排序的其他的实现方式
 * @createTime 2022年01月15日 14:53:00
 */
public class InsertionSort03 {
    private InsertionSort03(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        // 反向比较
        for (int i = arr.length - 1; i >= 0; i --) {
            // 记录当前位置上的 数
            E t = arr[i];
            int j;
            // 比较 i 往后一个的数与i位置上的数的大小
            for (j = i; j < arr.length - 1 && t.compareTo(arr[j + 1]) > 0; j ++){
                    arr[j] = arr[j + 1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args) {
        Integer [] arr = {1,4,2,3,6,5};

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
