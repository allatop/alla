package HW23M;

import java.util.Scanner;

public class lostcard {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int summa = 0;
        for (int i = a; i <= b; i++) {
            summa += i;
        }
        System.out.println(summa);
    }
}
