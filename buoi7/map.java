package buoi7;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class map {
    public static void main(String[] args) {
        // map key values
        // có thể tìm kiếm nhanh 
        // không thể cùng key value có thể cùng giốngư

        // hashMap không có thứ tự
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // put(key, value)
        map.put(3, 5);
        map.put(1, 2);
        map.put(1, 5);
        map.put(2, 4);
        map.put(3, 4);

        System.out.println(map.size());
        System.out.println(map.get(3)); // lấy phần tử từ key

        System.out.println(map.isEmpty());
        // map.clear()

        // kiểm tra sự tồn tại của key, value
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(5));

        map.remove(1); // xóa key nhé

        map.replace(3,15);

        // cách duyệt trong map

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        for(Map.Entry<Integer, Integer> entry : set){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }

        LinkedHashMap<Integer, Integer> map1  =  new LinkedHashMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>();

        // giống linkedset và treeset
        // bài tập đếm tần sútaa

        int[] a = {1, 1, 2, 1,2, 3, 1, 2};

        HashMap<Integer, Integer> map3= new HashMap<>();

        for(int x : a){
            if(map3.containsKey(x)){
                int fre = map3.get(x);
                fre += 1;
                map3.put(x, fre);
            }else{
                map3.put(x, 1);
            
            }
        }

        Set<Map.Entry<Integer, Integer>> entry_set = map3.entrySet();
        for(Map.Entry<Integer, Integer> entry : entry_set){
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println();
        }

        // với treemap sẽ có firstKey() và lastKey()
        // char ducowjc gọi là Character
    }
}
