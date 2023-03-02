package task1task2;

import java.util.Scanner;

public class three {
    public static void  main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if ( b != 0 ){
            System.out.print(a/b);
        }else{
            System.out.print("error");
        }
}
}
