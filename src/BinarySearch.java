import java.util.Arrays;

/**
 * @ Created by zzh on 2016/8/30.
 * @二分查找
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //被查找的键要么不存在，要么必存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;

    }

    public static void print(int[] array, String warn) {
        System.out.println(warn);
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] array = {1, 4, 2, 6, 7, 3, 5, 9, 8};


        BinarySearch.print(array, "数组排序前的结果:");

        Arrays.sort(array);// Arrays中的静态方法sort()对数组排序
        BinarySearch.print(array, "数组排序后的结果:");

        int m = BinarySearch.rank(6, array);
        if (m != -1)
            System.out.println("\n找到6的数值的索引:" + m);
        else
            System.out.println("\n找不到这个数");
    }


}
