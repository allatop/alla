import java.util.Scanner;

public class dvoichka {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i>0; i = i/2) {
            System.out.print(i%2);
        }

    }
}
