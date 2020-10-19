package lesson4task1;

/*
1. Фруктовая неоднозначность
Создать класс Fruit со свойством "вес" типа int и методом toString
Создать наследники:
Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20

переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)

создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
 */
public class Main {
    public static void main(String[] args) {
        Fruit[] arrayOfFruits = new Fruit[4];
        for (Fruit fruit: arrayOfFruits) {
            fruit = getRandomFruit();
            System.out.println(fruit.toString());
        }
    }

    public static Fruit getRandomFruit() {
        int rndIndex = (int) Math.floor(1 + (4 - 1) * Math.random());
        Fruit rndFruit;
        
        switch (rndIndex){
            case 1:
                rndFruit = new Apple();
                break;
            case 2:
                rndFruit = new Orange();
                break;
            case 3:
                rndFruit = new Pineapple();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rndIndex);
        }
        return rndFruit;
    }
}
