package laboratorn;

import java.util.Scanner;

public class run {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        int count = 1;
        while (a < b){
            a += a/10;
            count+=1;

        }
        System.out.println(count);

    }
}
