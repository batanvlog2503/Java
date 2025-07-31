package buoi7;
// in ra các dãy tăng chặt dài nhất
import java.util.Scanner;
public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC  = sc.nextInt();

        for(int o = 1;o <= TC;o++){
            int n = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }

            int cnt = 1;
            int[] pos = new int[n];

            pos[0] = 0;
            int len = 1;
            int max_len = Integer.MIN_VALUE;
            for(int i = 1;i < n;i++){
                if(a[i] > a[i - 1]){
                    len++;
                }else{
                    if(len > max_len){
                        max_len = len;
                        pos[0] = i - len;
                        cnt = 1;

                    }else if(len == max_len){
                        pos[cnt] = i - len;
                        cnt++;
                    }
                    len = 1;
                }
            }
            if(len > max_len){
                max_len = len;
                pos[0] = n - len;
                cnt = 1;
            }else if(len  == max_len){
                pos[cnt] = n - len;
                cnt++;
            }

            for(int i = 0;i < cnt;i++){
                int start = pos[i];

                for(int j = 0;j < max_len;j++){
                    System.out.print(a[start + j] + " ");
                }
                System.out.println();
            }
        }
    }
}
