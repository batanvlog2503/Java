package buoi8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        // hoặc có thể dùng
        //TreeMap<Character, Integer> map1 = new TreeMap<>(Comparator.reverseOrder());


        for(int i = 0;i < n;i++){
            char c = sc.next().charAt(0);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        System.out.println(map.firstKey() + " " + map.get(map.firstKey()));
        System.out.println(map.lastKey() + " " + map.get(map.lastKey()));

        Set<Map.Entry<Character, Integer>> set = map.entrySet();

        // for(Map.Entry<Character, Integer> entry : set){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        // bây giờ tôi muốn duyệt từ cuối đến đầy

        System.out.println();

        ArrayList<Map.Entry<Character, Integer>> arr = new ArrayList();
        for(Map.Entry<Character, Integer> entry : set){
            arr.add(entry);

        }

        for(int i = arr.size() - 1;i >= 0;i--){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
        
    }
}
