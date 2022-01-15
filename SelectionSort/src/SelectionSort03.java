/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName SelectionSort03.java
 * @Description 循环不变量为 arr[ i ..n) 已排序 ， arr[0 .. i)未排序
 * @createTime 2022年01月15日 11:40:00
 */
public class SelectionSort03 {

    public static void sort(int[] arr){

        // 遍历数组
        for (int i = arr.length -1 ; i >= 0; i --) {
            // 寻找数组中最小的数，并记录他的索引位置
            int minIndex = i;
            for (int j = i; j >= 0 ; j --) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,6,5};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }
}
