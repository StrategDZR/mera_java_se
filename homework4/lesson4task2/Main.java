package lesson4task2;

import lesson4task1.Fruit;
import java.util.Arrays;
import static lesson4task2.AbstractFabric.getRandomFabric;

/*
2. Фруктовая абстрактность
Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
Создайте следующие подклассы:

ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
RedApplesFactory - которая создает только красные яблоки
GreenApplesFactory - которая создает только зеленые яблоки.
LongPineapplesFactory - которая создает только ананасы с длиной хвоста больше 10

Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFabric[] arrayOfFabricsWithRandomType = new AbstractFabric[10];
        Arrays.fill(arrayOfFabricsWithRandomType, getRandomFabric());
        System.out.println(Arrays.toString(arrayOfFabricsWithRandomType));

        Fruit[] arrayOfFruitsFromAllFabrics = new Fruit[20];
        for (int i = 0; i < arrayOfFruitsFromAllFabrics.length; i += 2) {
            AbstractFabric rndFabric = getRandomFabric();
            arrayOfFruitsFromAllFabrics[i] = rndFabric.makeFruit();
            arrayOfFruitsFromAllFabrics[i + 1] = rndFabric.makeFruit();
        }
        for (Fruit f : arrayOfFruitsFromAllFabrics) {
            System.out.println(f.toString());
        }
    }
}