package HW23M;

import java.util.Scanner;

public class age {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double summa = 0.0;
        double count = 0.0;
        for (int i= 0; i < n; i++) {
            String name = sc.next();
            double a = sc.nextDouble();
            summa +=a;
            count +=1;
        }

        System.out.println(summa/count);
    }
}
