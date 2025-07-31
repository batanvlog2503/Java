package buoi1;
import java.util.Scanner;

public class HocLapTrinh {
    public static void main(String[] args) {
     
        int a = 1;
        long e = 123312313123123123L;
        float b = 12301930213f;
        double c = 123.4231d;
        boolean check = true;
        char kitu = '#';
        // comment 
        /* thanh tân đep trai    */
        System.out.println(a);
        System.out.println(b);
        System.out.print(c + "\n");

        System.out.println(kitu);
        // bỏ ln là k xuống dòng
        int x = 100, y = 200, z = 300;
        System.out.println(x + " " + y + " " + z);
        System.out.println(x + y + z);

        System.out.printf("%.2f\n", b );
        // string s;
        String s = "thanh tan dang hoc ptit";
        
        Scanner sc = new Scanner(System.in); // scanner sc không phải là nhập chỉ là công cụ hỗ trợ nhập
        
        int n = sc.nextInt(); // next() mới là nhappj
        System.out.println(n);

        float f = sc.nextFloat();
        System.out.println(f);

        double d = sc.nextDouble();
        System.out.println(d);

        sc.nextLine(); // loại bỏ enter sau khi nhập double

        char j = sc.nextLine().charAt(0);
        System.out.println(j);

        String str = sc.nextLine();
        System.out.println(str);
        // nextInt(), nextFloat(), nextDouble(), nextLong();
    }
}
