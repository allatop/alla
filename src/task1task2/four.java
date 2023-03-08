package task1task2;

import java.util.Scanner;

public class four {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%4 == 0) {
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
