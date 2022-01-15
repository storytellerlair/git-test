/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName SortingHelper.java
 * @Description 排序帮助类
 * @createTime 2022年01月15日 10:29:00
 */
public class SortingHelper {
    private SortingHelper(){}

    /**
     * 检测是否排序成功
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName,E[] arr){
        
    }

}
