import java.util.Scanner;

public class kv {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        while (count * count <= a){
            System.out.println(count*count );
            count += 1;
        }
    }
}
