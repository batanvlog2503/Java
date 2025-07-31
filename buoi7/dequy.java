package buoi7;

import java.util.Scanner;
public class dequy {
    public static int S(int n){
        if(n == 1){
            return 1;
        }else{
            return n + S(n - 1); // nếu là 1^2 +2^ thì là n^2 + S(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = S(5);
        System.out.println(res);
        int n = sc.nextInt();

        int[] a = {3, 1, 2, 4, 5};
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
