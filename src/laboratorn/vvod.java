package laboratorn;

import java.util.Scanner;

public class vvod {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int count = 0;
        int a = sc.nextInt();
        while (a > 0){
            b += a;
            count+=1;
            a = sc.nextInt();
        }
        System.out.println(b/count);
    }
}
