package buoi11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
public class string {
    // public static string upper(String s){
    //     String res ="";
    //     for(int i = 0;i < s.length();i++){
    //         res += Character.toUpperCase(s.charAt(i));

    //     }
    //     return res;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "28tech java";
        System.out.println(s.length());  
        for(int i = 0;i < s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
       // String s1 = sc.next(); // lay tu dau tien
        int n = sc.nextInt();
        sc.nextLine();

        String s2 = sc.nextLine();
        System.out.println(n + " " + s2);
        //  hàm lowerCase và Uppercase
        s = s.toLowerCase();
        String t = s.toUpperCase();
        System.out.println(t);
        System.out.println(s);

        // nối chuỗi hoặc s.concat(t)
        String st = s  +t;
        System.out.println(st);
        int alpha= 0 , special = 0, digit = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                digit++;
            }else if(Character.isAlphabetic(c)){
                alpha++;
            }else{
                special++;
            }
        }

        System.out.println(digit + " " + alpha + " " + special);

        // hafm compareto
        // 2 xaua bawnfg nhau tra ve 0 s < t tra ve -1 va s > t tra ve 1
        System.out.println(s.compareTo(t));

        System.out.println(s.compareToIgnoreCase(t));

        // hafm tach xau xau con

        String sub = s.substring(5); // di tu 5 den het
        String subSe = s.substring(5, 7);

        System.out.println(sub + "-----" + subSe);
        //

        // contains kieerm tra su ton tai

        System.out.println(s.contains("28tech"));

        // chuuyen so thanh xau

        String convert = "" + n;
        System.out.println(convert);

        // chuyen xau thanh so

        // parseInt();

        String s3 = "12313";
        int n1 = Integer.parseInt(s3);
        System.out.println(n1 + 1);

        String[] arr = {"apple", "samsung", "fb", "google"};

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " " + arr[i].charAt(0)+ " ");

        }
        System.out.println();
        HashSet<String> set = new HashSet<>();
        for(String x : arr){
            set.add(x);

        }
        System.out.println(set.size());

        // tach xau \\s+;
        String str1 = "28tech    di   hoc   lap   trinh";
        String[] str2 = str1.split("\\s+");
        for(int i = 0;i < str2.length;i++){
            System.out.print(str2[i] + " ");
        }

        Arrays.sort(str2, new Comparator<String>() {
            public int compare(String a, String b){
                if(a.length() != b.length()){
                    return a.length() - b.length();
                }else{
                    return a.compareTo(b);
                    
                }
            }
        });
        // chhuyeern luon thanh xau in thuong
        // String s = sc.nextLine().toLowerCase();
        // su dung stringtokenizeer
        // có dấu nào tách dấu đó
        String tan = "thanh tan dep tria";
        StringTokenizer token = new StringTokenizer(tan, " ");

        while(token.hasMoreTokens()){
            System.out.print(token.nextToken() + " ");
        }

    }
}
