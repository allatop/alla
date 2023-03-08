package task1task2;

import java.util.Scanner;

public class nine {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt();
        if (n <= k){
            System.out.print(m*2);
        }
        if ((n > k)&&(n%k == 0)){
            System.out.print(m*2*2);
        }
        if ((n > k)&&(n%k != 0)){
            System.out.print(n/k*m*2+m);
        }

    }
}
