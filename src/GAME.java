import java.util.Random;
import java.util.Scanner;

public class GAME {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int i = random.nextInt(100);
            System.out.println("Вы хотите сыграть в игру?");
            String answ = sc.next();
            if ("да".equals(answ)) {
                System.out.println("Введите число от 1 до 100");
                //System.out.println(i);
                int n = sc.nextInt();
                while (n != i) {
                    if (n < i) {
                        System.out.println("Ваше число меньше");
                        n = sc.nextInt();
                    }
                    if (n > i) {
                        System.out.println("Ваше число больше");
                        n = sc.nextInt();
                    }
                }
                if (n == i) {
                    System.out.println("Вы выиграли");
                }
            } else {
                System.out.println("Конец");
                break;
            }
        }

    }
}
