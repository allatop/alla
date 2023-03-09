import java.util.Scanner;

public class del {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        while (b <= a){
            if (a%b == 0){
                System.out.println(b);
                break;
            }
            b += 1;
        }
    }
}
