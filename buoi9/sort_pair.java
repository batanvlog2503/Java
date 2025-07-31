package buoi9;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort_pair {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] a = new int[n][2];

        for(int i = 0;i < n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();

        }

        Arrays.sort(a, new Comparator<int []>(){
            @Override
            public int compare(int[] o1, int[] o2){
                int kc1 = o1[0] * o1[0] + o1[1] * o1[1];
                int kc2 = o2[0] * o2[0] + o2[1] * o2[1];

                if(kc1 != kc2){
                    return kc1 - kc2;
                }else{
                    if(o1[0] == o2[0]){
                        return o1[1] - o2[1];
                    }
                    return o1[0] - o2[0];
                }
            }
        });
    }
}
