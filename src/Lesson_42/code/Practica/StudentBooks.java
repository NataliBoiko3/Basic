package Lesson_42.code.Practica;

import java.util.*;

public  class StudentBooks {
    public static void main(String[] args) {
        Student student1 = new Student("Victor");
        student1.addBook("Java ");
        student1.addBook("HTML");
        student1.addBook("CSS");

        Student student2 = new Student("Victoria");
        student2.addBook(" Java*");
        student2.addBook("Peiton");


// второй вариант решения с стримом в задании

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);


        Set<String> uniqueBooks = new HashSet<>();
        for (Student student : students) {
            for (String book : student.getBooksRead()) {
                if (!book.contains("HTML")) {
                    uniqueBooks.add(book);
                }
            }
        }

        System.out.println("Список книг :");
        for (String book : uniqueBooks) {
            System.out.println(book);
        }
    }
}



