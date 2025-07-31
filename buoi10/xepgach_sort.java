package buoi10;

import java.util.Scanner;


public class xepgach_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
            
        }

        int ans = 1;
        int docung = a[0];

        for(int i = 1;i < n;i++){
            if(docung <= 0){
                break;
            }

            ans++;
            docung = Math.min(a[i], docung - 1);

        }
        System.out.println(ans);
    }
}
