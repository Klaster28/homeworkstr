public class Main {
    public static void main(String[] args) {
        //Задача 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int rezult = a * (b + (c - d * e));
        System.out.println(rezult);
        int rezult1 = -rezult;

        //Задача 7
        int x = 5;
        int y = 7;
        y = y - x;
        x = x + y;
        y = x - y;
        System.out.println(x);
        System.out.println(y);

        // Задача 8
        int n = 543;
        int m = 1;
        m = (n % 100) / 10;
        System.out.println(m);



    }
}