package buoi4;

import java.util.Scanner;
public class function {
    // int long float char double boolean : void

    public static void helloWorld(){
        System.out.println("thanhtan dang hoc ptit");
    }
    public static void helloWorld1(int n, long m, char c){
        System.out.println(n + " " + m +  " " + c );
        n++;
    }

    public static int getValue(int n){
        return n * 20;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        helloWorld();

        int n = 1;
        helloWorld1(n, 2, '3');
        System.out.println(n);
        int x = getValue(n);
        System.out.println(x);
    }
}
