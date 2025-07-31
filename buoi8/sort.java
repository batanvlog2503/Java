package buoi8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sort {
    public static int tong(int n){

        int sum = 0;
        while(n  != 0){
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {3, 1, 2, 4, 5, 10, 8, 7, 6};

        Arrays.sort(a);
        // Arrays.sort(a, 0, 3) từ 0 đến 2
        // Arrays cho mảng a[]
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : a){
            list.add(x);

        }
        Collections.sort(list);
        // sử dụng collections.sort()
        // sử dụng collections cho arraylist, list
        for(int x : list){
            System.out.print(x + " ");
        }

        // mảng không dùng được comparator
        Integer[] arr = {3, 1, 2, 4, 5, 10, 8, 7, 6};
        // mảng này sử dụng được
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            
            public int compare(Integer o1, Integer o2){
                if(o1 > o2){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        // duy trì thứ tự nhé như stable sort
        // nếu là Arraylist
        // Collections.sort(arr, new Comparator<Integer>())
        System.out.println();
        for(int x :  arr){
            System.out.print(x + " ");
        }
        // cách sort dùng comparator ngoài main
        import java.util.*;

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Comparator nằm ngoài main
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class Solution {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A", 20));
        list.add(new Student("B", 18));
        list.add(new Student("C", 22));

        Collections.sort(list, new AgeComparator());

        for (Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
    }
}
