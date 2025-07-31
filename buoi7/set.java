package buoi7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        // set là container phần tử duy nhất
        // tốc độ tìm kiếm nhanh O(1)
        // không lưu thứ tự xuất hiện ngẫu nhiên
        // chỉ lưu kiểu đối tượng

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        //set1.removeAll(set2) xóa phần tử set2 trong set1
        for(int x : set){
            System.out.print(x + " ");
        }

        // remove trong set
        set.remove(2); // xóa luông phần tử đó

        // contains kiểm tra sự tồn tại của 1 phần tử
        System.out.println(set.contains(3));

        // clear(), isEmpty
        int[] a = {1, 2, 5, 1, 2, 3, 1, 4};
        // llinked set và hashset O(1)
        // lưu thứ tự lúc thêm vào
        LinkedHashSet<Integer> linkset = new LinkedHashSet<>();
        for(int x : a){
            linkset.add(x);
        }
        for(int x : linkset){
            System.out.print(x  + " ");
        }
        System.out.println();

        // treeset có thứ tự tăng dần log(n)
        // tìm kiếm chậm hơn o(log(n))

        TreeSet<Integer> treeset = new TreeSet<>();
        for(int x : a){
            treeset.add(x);
        }
        for(int x : treeset){
            System.out.print(x +  " ");
        }
        //floor(x) tra ve phân tử lớn nhất <= x trả về null neus k tồn tại
        //ceil(x) ---------------- nhỏ nhất  >= x trả về null nếu k tồn tại
        //first() trả vef phần tử đầu tiên trong set
        // last() trả về phần tử cuối trong set
        // lower(x) trả về phần tử lớn nhất nhỏ hơn x hoặc trả về null
        // higher(x)  trả về phần tử nhỏ nhất lớn hơn x hoặc trả về null
    }
}
