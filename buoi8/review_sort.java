package buoi8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
// sử dụng cái j thì cứ Java.util.Comparator
public class review_sort {
    public static int count_odd(int n){
        int count = 0;
        while(n !=0 ){
            int r = n % 10;
            if(r % 2 == 1){
                count++;
            }
            n /= 10;
        }
        return count;
    }    
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList();

        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            arr.add(x);

        }

        Collections.sort(arr, new Comparator<Integer>() {
            @Override

            public int compare(Integer o1, Integer o2){
                if(count_odd(o1) != count_odd(o2)){
                    return count_odd(o2) - count_odd(o1); 
                }else{
                    return o1 - o2;
                }
            }
        });

        for(int x : arr){
            System.out.print(x + " ");
        }

        // mảng 2 chiều hoặc là pair
        Integer[][] a = new Integer[n][2];
        for(int i = 0;i < n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2){
                if(o1[0] != o2[0]){
                    return o1[0] - o2[0];
                }else{
                    return o1[0] - o2[0];
                }
            }
        } );
    }
    for(int i = 0;i < n;i++){
        System.out.println(a[i][0] + " " + a[i][1]);
        
    }
}
