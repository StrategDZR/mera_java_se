/*
Задание 1. Цифровая персонализация
- Создать класс Person с двумя полями типа String: firstName, lastName
- создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
- Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
- Создать метод toString() который возвращает человека в формате "Фамилия, Имя"

 в методе main
- Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
- Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
- Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
- Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"
 */

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName();
    }

    private static String getRandomValueFromArray(String[] arr) {
        Random rnd = new Random();
        int rndIndex = rnd.nextInt(arr.length);
        return arr[rndIndex];
    }

    public static void main(String[] args) {

        String[] names = new String[]{"Misha", "Masha", "Kolya", "Ivan", "Philimon"};
        String[] surnames = new String[]{"Ivanov", "Petrov", "Sidorov", "Kolkin", "Baggins", "Svenson"};
        Person[] persons = new Person[50];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(getRandomValueFromArray(names), getRandomValueFromArray(surnames));
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Человек №%d - %s\n", i, persons[i].toString());
        }
    }
}
