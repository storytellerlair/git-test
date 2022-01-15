/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName InsertionSort02.java
 * @Description TODO
 * @createTime 2022年01月15日 12:14:00
 */
public class InsertionSort02 {
    private InsertionSort02(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        for (int i = 0; i < arr.length; i++) {
            // 将 arr[i] 找到合适的位置
            // 将当前的i 位置上的数 和它前面位置上数进行比较
//            for (int j = i ; j > 0 ; j --) {
//                // 如果当前位置上的数的值小于它前面位置上的数，则交换位置
//                if (arr[j].compareTo(arr[j - 1]) < 0){
//                    swap(arr,j,j - 1);
//                }else break;
//            }
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j --) {
                swap(arr,j,j - 1);
            }
        }
    }

    private static <E> void swap(E[] arr, int j, int i) {
        E temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {

    }

}
