import java.util.Random;
import static java.lang.Integer.MAX_VALUE;

/**
 * Задание 1. Случайности складываются
 * - Создать массив на 10 чисел типа int
 * - Заполнить массив случайными числами, используя класс Random и функцию nextInt()
 * - Вывести массив на экран одной строкой, разделив элементы пробелом
 * - Посчитать сумму всех элементов и вывести на экран
 * - Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */
public class Task1 {
    public static void main(String[] args) {

        int[] nums = new int[10];
        final Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int min = MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
            sb.append(nums[i]).append(" ");
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        System.out.println("Массив одной строкой: " + sb);
        System.out.println("Сумма: " + sum);
        System.out.println("Индекс минимума: " + minIndex);
        System.out.println("Минимум: " + min);
    }
}
