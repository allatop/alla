package HW6M;

import java.util.Scanner;

public class six {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a > 0) {
            count += a;
            a = sc.nextInt();
        }
        System.out.println(count);
    }
}
