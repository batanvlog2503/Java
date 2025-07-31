package buoi5;

import java.util.Scanner;
public class lythuyetdongdu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(), 

        // int MOD = (int)Math.pow(10, 9) + 7;

        // long tong = 0;

        // for(int i = 0;i < n;i++){
        //     int x = sc.nextInt();
        //     tong += x % MOD;
        //     tong %= MOD;
        // }
        // System.out.println(tong);
        // n ^ m % 10 ^ k

        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        
        long tich = 1;
        long mod = (int)Math.pow(10, k);
        for(int i = 1;i <= m;i++){
            tich *= (n % mod);
            tich %= mod;
        }

        System.out.println(tich);
    }
}
