package task1task2;

import java.util.Scanner;

public class eight {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if ((a-b)==(c-d)){
            System.out.print("yeees");
        }else{
            System.out.print("no");
        }

    }
}
