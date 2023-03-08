package task1task2;

import java.util.Scanner;

public class six {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
        if ((b*b - 4*a*c) < 0) {
            System.out.print("нет корней");
        }
        if ((b*b - 4*a*c) == 0) {
            System.out.print("1");
        }
        if ((b*b - 4*a*c) > 0) {
            System.out.print("2");
        }
    }
}
