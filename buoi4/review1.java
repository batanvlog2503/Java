package buoi4;

import java.util.Scanner;
public class review1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // double res = 1.0;
        // double gt = 1;

        // for(int i = 1;i <= n;i++){
        //     gt *= i;

        //     res += (double)1 /gt;
        // }

        // System.out.printf("%.4f", res);

        while(n >= 10){
            int tong = 0;
            while(n !=0 ){
                tong += n % 10;
                n /= 10;
            }

            n = tong;
        }

        System.out.println(n);
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)(64 + i) + " ");
            }
            System.out.println("");
        }
        int x = 0;

        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i % 2 == 0){
                    char t = (char)(96 + j + x);
                    System.out.print(t);
                }else{
                    char t = (char)(64 +j + x);
                    System.out.print(t);
                }
            }
            x++;
            System.out.println();
        }
    }
}
