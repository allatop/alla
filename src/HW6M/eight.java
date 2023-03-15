package HW6M;

import java.util.Scanner;

public class eight {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int count = 1;

        while (b < n) {
            b*=a;
            a = sc.nextInt();
            count += 1;
        }
        System.out.println(b);
        System.out.println(count);
    }
}
