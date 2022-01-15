/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName ArrayGenerator.java
 * @Description TODO
 * @createTime 2022年01月13日 11:33:00
 */
public class ArrayGenerator {
    private ArrayGenerator(){}
    public static Integer[] generateOrderedArray(int n){
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
