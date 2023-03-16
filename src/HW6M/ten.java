package HW6M;

import java.util.Scanner;

public class ten {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c ="*";
        int i = 1;
        int j = 1;
        while (i <= n) {
            System.out.println(" ".repeat(n-i)+ c.repeat(j) );
            i++;
            j+=2;
        }
    }
}
