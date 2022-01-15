/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName InsertionSort01.java
 * @Description 插入排序(自己实现)
 * @createTime 2022年01月15日 12:08:00
 */
public class InsertionSort01 {
    private InsertionSort01(){}

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // 从 i 开始往前找 找到比 当前 i 还小的值就交换位置
            for (int j = i; j > 0; j --) {
                    if (arr[j - 1] < arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,4,2,3,6,5};

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
