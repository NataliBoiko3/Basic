package Lesson_39.code.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class MergingListsDemo {
    public static void main(String[] args) {


    //Напишите функциональный интерфейс для объединения двух списков в один
    List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);

    List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

    MergingLists<Integer> merger = (l1, l2) -> {
        List<Integer> mergedList = new ArrayList<>(l1);
        mergedList.addAll(l2);
        return mergedList;
    };


        List<Integer> mergedList = merger.merge(list1, list2);
        System.out.println("Merged List: " + mergedList);
}

}