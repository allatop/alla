import java.util.Scanner;

public class now {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;
        for (int i = sc.nextInt(); true ; i=sc.nextInt()){
            if (i%7 == 0){
                break;
            }else{
                if (i%10 == 7){
                    summa+=i;
                }
            }

        }
        System.out.println(summa);
    }
}
