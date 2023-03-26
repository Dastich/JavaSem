package Seminar1.HW.tasks;
import java.util.Scanner;
public class Task1 {
    //Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    public static int triangleNumber(int number) {
        int result = number * (number + 1) / 2;
        return result;
    }
    //n! (произведение чисел от 1 до n)

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    //Вывести все простые числа от 1 до 1000( не смог выполнить, если возможно, подскажите алгоритм проверки условия :( )
    public static void simpleDigit() {
        int counter = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    counter++;
            }
            if (counter == 0) {
                System.out.println(i);
                counter = 0;
            }
        }
    }

    //Реализовать простой калькулятор Использовать сканнер: Scanner scanner = new Scanner(System.in); String enter = scanner.next(); int i = Integer.parseInt(ent
    public static int calculater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Сделайте выбор операции:1=+ , 2= - , 3= *, 4 = /");
        int resolve = scanner.nextInt();
        if (resolve==1) return a+b;
        if (resolve==2) return a-b;
        if (resolve==3) return a*b;
        if (resolve==4) return a/b;
        return 0;
    }
}




