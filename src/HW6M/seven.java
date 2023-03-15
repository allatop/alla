package HW6M;

import java.util.Scanner;

public class seven {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int b =x;
        while (b < n) {
            b+=x;
        }
        System.out.println(b);
    }
}
