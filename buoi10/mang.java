package buoi10;
import java.util.Scanner;

public class mang {
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1 ,1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        int[][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] e = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = sc.nextInt();

            }
        }
        int dem = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                boolean check = true;
                for(int k = 0;k < 8;k++){
                    int i1 = i + dx[k];
                    int j1 = j + dy[k];

                    if(i1 >= 0 && j1 >= 0 && i1 < n && j1 < n){
                        if(a[i1][j1] >=  a[i][j]){
                            check = false;
                            break;
                        }
                    }
                }
                if(check == true){
                    dem++;
                }
            }

        }
        System.out.println(dem);
    }
}
