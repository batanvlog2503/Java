package buoi7;

import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr  =new ArrayList<>();
       
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(0,15);

        // dùng set để thay đổ
        arr.set(1, 132);
        System.out.println(arr.size());

        for(int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        // arr.clear();
        for(int x : arr){
            System.out.print(x + " ");
        }
        //
        if(arr.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        arr.remove(1); // xóa vị trí
        arr.remove((Object)(3));
        // xóa phần tử nếu có nhiều phần tử
        // nó sẽ xóa vị trí dầu tiên
        // contains kiểm tra phần tử đó có chứa trong list k

        System.out.println(arr.contains(1));

        // object

        Object[] b = arr.toArray();

        for(Object x : b){
            System.out.print(x + " ");
        }
        System.out.println();

        //indexOf() tìm vị trí phần tử đầu tiên của 

        System.out.println(arr.indexOf(2));

        // foreach

        
    }
}
