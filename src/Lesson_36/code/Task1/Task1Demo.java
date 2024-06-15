package Lesson_36.code.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1Demo {
    public static void main(String[] args) {
        Task1<String, Integer> task1 = new Task1<>("Hi",7);
        System.out.println(task1);

       Task1<Double,String> task2 = new Task1<>(5.17, "jeck");
        System.out.println(task2);

        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Hi Hi");

        Task1<List<String>, String> task3 = new Task1<>(list, "Example");
        System.out.println(task3);
    }
}
