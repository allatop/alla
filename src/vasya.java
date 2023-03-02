import java.util.Scanner;

public class vasya {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( a >= 18 ){
            System.out.print("yes");
        }else{
            System.out.print("nope");
        }
    }
}
