package buoi11;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer {
    public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Tách token bằng StringTokenizer
        StringTokenizer st = new StringTokenizer(s, " !,?._'@");

        // Đếm số token
        int n = st.countTokens();

        // Tạo mảng chứa token
        String[] tokens = new String[n];

        // Lấy token đưa vào mảng
        for (int i = 0; i < n; i++) {
            tokens[i] = st.nextToken();
        }

        // In ra
        System.out.println(n);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
}
