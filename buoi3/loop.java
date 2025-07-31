package buoi3;

public class loop {
    public static void main(String[] args) {
        outer: for(int i = 1;i <= 5;i++){
            in: for(int j = 1;j <= 4;j++){
                if(i == 1 && j == 2){
                    break outer; // break in;
                }
            }
        }
        // return; kết thúc ngay lập tức

        int i = 0;
        while(i < 5){
            System.out.println("PTIT");
            i++;
        }
    }
}
