package task1task2;

import java.util.Scanner;

public class seven {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
        if (((a+b)>c)&&((a+c)>b)&&((b+c)>a)) {
            System.out.print("yeeees");
        }else{
            System.out.print("no way bro");
        }
    }
}
