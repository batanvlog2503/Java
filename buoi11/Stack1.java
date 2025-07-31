package buoi11;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        // su dung st.peek() xem phan tu dau tien
        // pop khác peek ở chỗ pop vừa xem vừa lấy ra luôn
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.isEmpty());
    }
}
