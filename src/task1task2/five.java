package task1task2;

import java.util.Scanner;

public class five {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if ((a == 0)&&(b==0)) {
            System.out.print("inf");
        }
        if ((a == 0)&&(b!=0)) {
            System.out.print("0");
        }
        if (a == 1) {
            System.out.print("1");
        }
    }
}
