package task1task2;

import java.util.Scanner;

public class three {
    public static void  main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (( a > b ) && (a > c)) {
            System.out.print(a);
        }
        if ((b>a) && (b>c)) {
            System.out.print(b);
        }
        if ((c>a) && (c>b)) {
            System.out.print(c);
        }

    }
}
