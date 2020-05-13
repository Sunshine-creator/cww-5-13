package cww513;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(please enter your year:);
//        int n =1;
//        int result = 0;
//        while (n<101){
//            result+=n;
//            n++;
//        }
//        System.out.println(result);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int toGuess= random.nextInt(100);
        while (true){
            System.out.println("请输入要输入的数字：（1-100）");
            int num = scanner.nextInt();
            if(num<toGuess){
                System.out.println("再试一次，低了！");
            }else if(num>toGuess){
                System.out.println("再试一次，高了！");
            }else {
                System.out.println("恭喜，猜对了！");
                break;
            }
        }
        scanner.close();
    }
}
