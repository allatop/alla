import java.util.Scanner;

public class factor {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pr = 1;
        for (int i = 1; i <= a; i++) {
            pr *= i;
        }
        System.out.println(pr);
    }
}
