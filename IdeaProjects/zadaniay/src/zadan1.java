import java.util.Scanner;

public class zadan1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.print("Число  " + n + " -  ");
            int i;

            if (n % 2 == 0)
                System.out.print(" четное ");

            else
                System.out.print(" нечетное");

            for (i = 2; i < n; i++) {
                if (n % 2 == 0) {
                    System.out.print(" и составное");
                    return;
                }

            }
            System.out.print(" и простое");

        }
        else
            System.out.println("Ошибка. Вы ввели не целое число");

    }
}