package buoi10;
import java.util.Scanner;

public class count_island {
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1 ,1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int n = 0 , m = 0;
    public static int[][] a = new int[100][100];
    public static void dfs(int i, int j){
        a[i][j] = 0;

        for(int k = 0;k < 8;k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];

            if(i1 >= 0 && i1 < n && j1 < m && j1 >= 0 && a[i1][j1] == 1){
                dfs(i1, j1);
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                a[i][j] = sc.nextInt();

            }
        }

        int dem = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(a[i][j] == 1){
                    dem++;
                    dfs(i, j);
                }
            }
        }
    }
}
