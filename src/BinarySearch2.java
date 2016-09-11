/**
 * 递归方法的二分查找
 *1.1.22习题答案
 * @ Created by zzh on 2016/9/11.
 */
public class BinarySearch2 {


    public static int rank(int key, int[] a, int lo, int hi, int time) {
    /*key是要寻找的值，lo和hi是查找范围，time记录递归深度，调用函数前应确保数组是有序的。*/
        for (int j = 1; j < time; j++)
            StdOut.print(" ");
        StdOut.print(time);
        StdOut.println();
        if (hi < lo)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, ++time);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi, ++time);
        else
            return mid;
    }
}
