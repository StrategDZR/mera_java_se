package lesson4task2;

import lesson4task1.Fruit;

import java.util.Arrays;

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
        Arrays.fill(arrayOfFabricsWithRandomType, getRandomFabric()); //возможно, я неправильно понял задание

        Fruit[] arrayOfFruitsFromAllFabrics = new Fruit[20];
        for (int i = 0; i < arrayOfFruitsFromAllFabrics.length; i += 2) {
            AbstractFabric rndFabric = getRandomFabric();
            arrayOfFruitsFromAllFabrics[i] = rndFabric.makeFruit();
            arrayOfFruitsFromAllFabrics[i + 1] = rndFabric.makeFruit();
        }
    }

    public static AbstractFabric getRandomFabric() {
        int rndIndex = (int) Math.floor(1 + (5 - 1) * Math.random());
        AbstractFabric rndFabric;

        switch (rndIndex) {
            case 1:
                rndFabric = new ThinOrangeFactory();
                break;
            case 2:
                rndFabric = new RedApplesFactory();
                break;
            case 3:
                rndFabric = new GreenApplesFactory();
                break;
            case 4:
                rndFabric = new LongPineapplesFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rndIndex);
        }
        return rndFabric;
    }
}
