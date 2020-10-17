import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание 2. Случайности расходятся
 * - Создать массив на 5 элементов типа int и вывести на экран
 * - Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
 * - Найти среднее значение в каждом массива и вывести их на экран
 */

public class Task2 {
    public static void main(String[] args) {

        int[] nums = new int[5];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        final Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.println("Массив чётных чисел: " + even.toString());
        System.out.println("Массив нечётных чисел: " + odd.toString());
        System.out.println("Среднее значение массива чётных чисел: " + calculateAverage(even));
        System.out.println("Среднее значение массива нечётных чисел: " + calculateAverage(odd));
    }

    private static Integer calculateAverage(ArrayList<Integer> arrayList) {
        Integer sum = 0;
        for (Integer e : arrayList) {
            sum += e;
        }
        return sum / (arrayList.size());
    }
}
