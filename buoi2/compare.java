package buoi2;

import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(10 < 20);
        System.out.println(10 != 20);
        // logic

        int x = 20;

        System.out.println((x >=35 && x <= 36));
         System.out.println((x >=35 || x <= 36));
         System.out.println(!(x < 10));

         int n = 100;
         System.out.println(n++);
         System.out.println(n);

         int i = 10 < 20 ? 10 : 20;
         System.out.println(i);

         if(i >= 10){
            System.out.println("tan hoc khmt1");
         }else{
            System.out.println("tan hoc khmt2");
         }

         switch (i) {
             case 1, 10, 23, 4, 8:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            
            default:
                System.out.println("ERROR");
                 // nhánh cuối cùng
        }

        char c = 'A';
        c += 32;
        System.out.println(c);
        System.out.println((int)c);
        if(Character.isLowerCase(c)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        //uppercase, isdigit, isalphabet

        c = Character.toUpperCase(c);
        // chuyển kí tự

        System.out.println(c);
        System.out.println(++c);
    }
}
