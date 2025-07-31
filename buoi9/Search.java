package buoi9;
import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static boolean binary_search(int[] a, int n, int x ){
        int l = 0, r = n-1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] == x){
                return true;
                // r = m - 1 tìm phầm tử đầu tiên
                // l = m + 1 tìm phần tử cuối cùng
            }else if(a[m] < x){
                l = m + 1;
            }else{
                r = m -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
        if(binary_search(a, n, x)){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
        
        // ta có hàm Arrays.binarySearch(a, x)
        // hiểu đơn giản nó tìm thấy x nó sẽ trả về >= 0
        // còn k tìm thấy trả về -1
        // không cần tạo hàm tìm kiếm vì nó có sẵn
    }
}
