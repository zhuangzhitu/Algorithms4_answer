import java.util.Arrays;


/**
 *  第一章
 *  1.1.39习题答案 随机匹配
 * @ Created by zzh on 2016/9/11.
 */
public class RandomMatching {
    public RandomMatching() {
        // TODO Auto-generated constructor stub
    }

    private static int M = 1000000;//定义随机数范围6位

    public static int[] RandomArray(int N) {
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(M);//生成随即数组
        }
        return a;
    }

    public static void main(String[] args) {   // TODO Auto-generated method stub
        int T = StdIn.readInt();
        for (int i = 10; i <= 1000000; i = i * 10) {
            StdOut.print("i= " + i + ":   ");
            int[] a = new int[i];
            int[] b = new int[i];
            int cnt = 0;
            for (int j = 0; j < T; j++) {
                a = RandomArray(i);
                Arrays.sort(a);
                b = RandomArray(i);
                Arrays.sort(b);
                for (int k = 0; k < i; k++) {
                /* if(k%5==0)
                 //{ StdOut.println();}
                 StdOut.print(" a[ "+k+"]=: "+a[k]);
                   StdOut.print(" b[ "+k+"]=: "+b[k]);*/
                    if (BinarySearch.rank(b[k], a) == -1)//调用二分查找
                        cnt++;
                }
            }
            StdOut.println("avergae times: " + cnt / T);
        }
    }
}
