package laboratorn;

import java.util.Scanner;

public class mindl {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 2;
        while (a % count != 0){
                count +=1;
        }
        System.out.println(count);

    }
}
