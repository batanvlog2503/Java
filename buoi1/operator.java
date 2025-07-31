package buoi1;

public class operator {
    public static void main(String[] args) {
        int a = 1000, b = 300;
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        float thuong = (float)a /b;
        // ep kieu
        int du = a % b;
        System.out.println(tong + " " + hieu + " " + tich + " " + thuong +  " " + du);


        int n = 10000, m = 1000000;

       long i = (long)n * m;
        System.out.println(i);
        int x = Math.min(n, m);
        int y = Math.max(n, m);
        int z = Math.abs(n);
        System.out.println(Math.sqrt(n));
        float h = Math.pow(2, 10);

        // ceil, floor, round, cbrt

    }
}
