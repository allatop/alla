package task1task2;

import java.util.Scanner;

public class two {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), min = sc.nextInt(), sec = sc.nextInt();
        if ( (h*60*60 + min * 60) >= sec ){
            System.out.print("успел");
        }else{
            System.out.print("опоздал");
        }
    }
}
