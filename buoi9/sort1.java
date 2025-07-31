package buoi9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class sort1 {
    public static int even(int n){
        int count =0;
        while(n !=0 ){
            int r =  n % 10;
            if(r % 2 == 0){
                count++;
            }

            n /= 10;
        }
        return count;
    }
     public static int odd(int n){
        int count =0;
        while(n !=0 ){
            int r =  n % 10;
            if(r % 2 == 1){
                count++;
            }

            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < n;i++){

            int x = sc.nextInt();
            arr.add(x);

        }
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(even(o1) != even(o2)){
                    return even(o1) - even(o2);
                }else{
                    return o1 - o2;
                }
            }
        });
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
