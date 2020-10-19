import java.util.ArrayList;
import java.util.Random;

/*
 * Задание 3. Противоположности притигиваются
 * - Создайте два массива на 7 элементов.
 * - Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться
 * ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
 * Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
 * - Выведите оба массива на экран
 * - Создайте новый массив на 7 элементов.
 * Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.
 */

public class Task3 {
    public static void main(String[] args) {

        final int ARR_SIZE = 7;
        ArrayList<Integer> positiveArr = new ArrayList<>();
        ArrayList<Integer> negativeArr = new ArrayList<>();
        ArrayList<Integer> sumArr = new ArrayList<>();
        Random random = new Random();

        while (!(negativeArr.size() >= ARR_SIZE && positiveArr.size() >= ARR_SIZE)) {
            int value = random.nextInt();

            if (value > 0 && positiveArr.size() <= ARR_SIZE) {
                positiveArr.add(value);
            } else if (value < 0 && negativeArr.size() <= ARR_SIZE) {
                negativeArr.add(value);
            }
        }

        for (int i = 0; i < ARR_SIZE; i++) {
            sumArr.add(i, positiveArr.get(i) + negativeArr.get(i));
        }

        System.out.println("Массив положительных чисел: " + positiveArr.toString());
        System.out.println("Массив отрицательных чисел: " + negativeArr.toString());
        System.out.println("Суммарный массив: " + sumArr.toString());
    }
}

