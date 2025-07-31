package buoi6;

import java.util.Scanner;
public class mangdanhdau {
    public static int[] cnt = new int[1000001];
    public static boolean doiXung(int a[], int n){
        int l = 0, r = n - 1;
        while(l <= r){
            if(a[l] != a[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void reverseArray(int a[], int n){
        int l = 0, r = n -1;
        while(l <= r){
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }
    public static int countNt(int n){
        int muMax = Integer.MIN_VALUE;
        
        int ans = 0;
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                int mu = 0;
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                if(mu > muMax){
                    ans = i;
                    muMax = mu;
                }
            }
        }
        if(n > 1){
            if(muMax < 1){
                muMax = 1;
                ans = n;
            }
        }
        return ans;
    }
    public static long gt(int n){
        
        long ans = 1;
        for(int i = 1;i <= n;i++){
            ans *= i;
        }
        return ans;
    }

    public static long ckn(int n, int k){
        return gt(n) / (gt(k) * gt(n -k));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[10001];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            cnt[a[i]] = 1;
        }
        int dem = 0;
        for(int i = 0 ;i <= 1000000;i++){ // có thể thay maxArray
            if(cnt[i] == 1){
                dem++;
            }
        }
        System.out.println(dem);

        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print(ckn(i, j) + " ");
            }
            System.out.println();
        }
    }
}
