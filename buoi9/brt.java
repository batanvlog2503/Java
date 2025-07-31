package buoi9;

import java.util.Scanner;

public class brt {
    public static void main(String[] args) {
        // bài tập brt
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a= new int[n];

        int ans = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 1;i < n;i++){
            if(a[i] - a[i - 1] < ans){
                ans = a[i] - a[i - 1];
                count = 1;
            }else if(a[i] - a[i - 1] == ans){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
