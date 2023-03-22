package HW23M;

import java.util.Scanner;

public class proizvedchisl {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 1;
        for (int a = sc.nextInt(); a != 0; a/=10) {
            summa *= (a%10);
        }

        System.out.println(summa);
    }
}
