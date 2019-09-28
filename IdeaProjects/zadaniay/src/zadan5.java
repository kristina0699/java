import java.util.Scanner;

public class zadan5 {
    public static void main(String args[]) {
        System.out.print("Введите числа: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int n = num;
        if (n<=100) {
            int rev = 0, rmd;
            while (num > 0) {
                rmd = num % 10;
                rev = rev * 10 + rmd;
                num = num / 10;
            }
            if (rev == n)
                System.out.println("Число " + n + " - палиндром ");
            else
                System.out.println("Число " + n + " - не палиндром");
        }
        else
            System.out.println("Вы ввели большое число ");
    }
}