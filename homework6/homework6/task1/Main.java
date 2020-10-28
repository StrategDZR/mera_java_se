package homework6.task1;
/*
Задание 1. Велосипеды и контейнеры

Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
Используйте обобщенный класс для этого (generic) с типом T.

- Реализуйте методы:
1. void add(T) - добавляет элемент  в коллекцию
2. boolean remove(T) - возвращает true, если элемент был найден и удален
3. T[] toArray() - возвращает массив из всех текущих элементов
4. int size()
5. T get(int) - взять элемент по индексу.

- Создайте класс Bicycle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
Переопределите equals и hashCode, который используют оба свойства велосипеда.

- Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
 Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
- Проверьте, что все методы работают правильно:
  1. Возьмите случайное число от 0 до 50.
  2. Удалите из коллекции все велосипеды со скоростью меньше этого случайного числа.


- Теперь создайте новый экземпляр MyArrayList
- Добавьте в него 10 случайных чисел от 1 до 10
- удалите все четные числа
- Выведите оставшиеся числа на экран.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int MAX_RANDOM_SPEED = 50;
    private static final int MAX_COUNT_OF_BICYCLES = 11;
    private static final int MAX_INT_VALUE = 10;

    public static void main(String[] args) {

        //заполнение листа с переполнением
        MyArrayList<Bicycle> bicycles = new MyArrayList<>();
        for (int i = 0; i < MAX_COUNT_OF_BICYCLES; i++) {
            Bicycle bike = new Bicycle();
            try {
                bicycles.add(bike);
                System.out.println("Count: " + i + "; " + bike.getInfo() + " was added.");
            } catch (MyArrayStoreException e) {
                System.err.println(e.getMessage());
                System.err.println("Count: " + i + "; " + bike.getInfo() + " was not added.");
            }
        }

        //удаление велосипедов со скоростью, меньше случайной
        int randomSpeed = new Random().nextInt(MAX_RANDOM_SPEED);
        for (int i = bicycles.size() - 1; i >= 0; --i) {
            Bicycle bike = bicycles.get(i);
            if (bike.getMaxSpeed() < randomSpeed) {
                bicycles.remove(bike);
            }
        }
        System.out.println("MyArrayList of bicycles with max speed more than " + randomSpeed + " km/h:");
        for (int i = 0; i < bicycles.size(); i++) {
            System.out.println("bike: " + bicycles.get(i).toString());
        }

        //лист с интами и удаление чётных значений
        MyArrayList<Integer> integers = new MyArrayList<>();
        for (int i = 0; i < MAX_INT_VALUE; i++) {
            int randomInt = new Random().nextInt(MAX_INT_VALUE);
            integers.add(randomInt);
        }
        System.out.println("MyArrayList of Integers: " + Arrays.toString(integers.toArray()));

        for (int i = integers.size() - 1; i >= 0; --i) {
            Integer integer = integers.get(i);
            if (integer % 2 == 0) {
                integers.remove(integer);
            }
        }
        System.out.println("MyArrayList of odd Integers: " + Arrays.toString(integers.toArray()));
    }
}
