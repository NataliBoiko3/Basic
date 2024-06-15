package Lesson_30.practic;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    //Дана коллекция стрингов, написать метод, который в  коллекции
    //заменяет все элементы , которые заменяют букву а на многоточие
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("avocado");
        strings.add("kiwi");
        strings.add("lemon");

       
        System.out.println("Original Collection: " + strings);


    }
}
