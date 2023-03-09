package laboratorn;

import java.util.Scanner;

public class countt {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 0;
        while (a <= b){
            if ((a%3==0)&&(a%5!=0)){
                count +=1;
            }
            a+=1;
        }
        System.out.println(count);

    }
}
