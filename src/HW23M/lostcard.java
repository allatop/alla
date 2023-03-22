package HW23M;

import java.util.Scanner;

public class lostcard {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int summa = 0;
        for (int i = 0; i <= a; i++) {
            summa += i;
        }
        for (int i = 0; i < a-1; i++){
            int b = sc.nextInt();
            summa -= b;
        }
        System.out.println(summa);
    }
}
