package HW6M;

import java.util.Scanner;

public class nine {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c ="*";
        int j = 1;
        while (j <= n) {
            System.out.println( c.repeat(j) );
            j++;
        }
    }
}
