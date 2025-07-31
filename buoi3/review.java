package buoi3;

import java.util.Scanner;

public class review {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt(), u1 = sc.nextInt();
    //     int d = sc.nextInt();

    //     long un = u1 + (long)(n - 1) * d;

    //     System.out.println((long)un);
    // }
    // public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    //     if(a == 0){
    //         if(b == 0){
    //             System.out.println("phuong trinh vo nghiem");
    //         }else{
    //             System.out.printf("%.2f", (float)-c/b);
    //         }
    //     }else{
    //         int delta = b * b - 4 * a * c;
    //         if(delta > 0){
    //             System.out.println("phuong trinh co 2 ng pb : ");
    //             float candelta = (float)Math.sqrt(delta);
    //             System.out.println((float)(-b + candelta) / (2 * a));
    //             System.out.println((float)(-b - candelta) / (2 * a));
    //         }else if(delta < 0){
    //             System.out.println("phuong trinh vo ng");

    //         }else{
    //             System.out.println("phuong trinh co nghiem kep");
    //             System.out.println((float)-b / (2 * a));
    //         }
    //     }
    // }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.NextInt();
          int k6 = sc.nextInt();

          int k256 = Math.min(k2, Math.min(k5, k6));
          int k32 = Math.min(k3, k2 - k256);

          System.out.println(k256 * 256 + k32 * 32);

    }
}
