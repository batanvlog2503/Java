package buoi5;

import java.util.Scanner;
public class mang1chieu {
    public static void main(String[] args) {
        // ban đầu là số 0
        int[] e = new int[100];
        long[] b = new long[1001];
        float[] c = new float[1002];
        long[] F = new long[1002];

        F[1] = 1;
        F[2] = 2;
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += a[i];
        }
        System.out.println(sum);
        int minVal = Integer.MAX_VALUE;
        System.out.println(minVal);
        for(int i = 0;i < n - 1;i++){
            System.out.println(a[i] + a[i + 1] + " ");
            // in tổng 2 số
        }
        for(int i = 0;i < n - 2;i++){
            System.out.println(a[i] + a[i + 1] + a[i + 2] + " ");
        }

        int tmp = a[n - 1];
        for(int i = n - 1;i >= 1;i--){
            a[i] = a[i - 1];
        }
        a[0] = tmp;
        for(int i = 0;i < n;i++){
            System.out.println(a[i]);
        }
    }
}
