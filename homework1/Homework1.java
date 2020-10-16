import java.util.Scanner;

/**
 * 2.	Написать программу, в которой есть две переменные типа Integer со значениями.
 * Значения можно указать в коде программы или ввести с клавиатуры или взять из аргументов.
 * 3.	Если первое число больше второго – написать на экран «Число %s больше %s».
 * 4.	Если первое число меньше второго – написать на экран «Число %s меньше %s».
 * 5.	В любом случае, вывести на экран сумму чисел.
 **/

class Homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        if (num1 > num2) {
            output(num1, num2);
        } else {
            output(num2, num1);
        }
    }

    private static void output(int a, int b) {
        int sum = a + b;
        System.out.printf("Число %d больше %d", a, b);
        System.out.println("\nСумма: " + sum);
    }
}