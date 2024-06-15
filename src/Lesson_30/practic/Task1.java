package Lesson_30.practic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task1 {
    //создайте коллекцию которая будет содержать 30 случайных чисел,
    // напишите метод который удаляет из этой коллекции все числа
    // , которые больше 50, при решении не использовать создание новой коллекции
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Original Collection: " + numbers);
        Integer maxValue = 50;

       Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 50) {
                iterator.remove();
            }
        }

            System.out.println("New Collection : " + numbers);
        }

    }

