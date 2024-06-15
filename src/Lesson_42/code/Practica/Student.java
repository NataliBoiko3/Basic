package Lesson_42.code.Practica;

import java.util.List;

public class Student {
    public String name;
    private List<String> booksRead;// set правильно использовать , так как нужно хранить уникальные названия

    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public List<String> getBooksRead() {
        return booksRead;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", booksRead=" + booksRead +
                '}';
    }
    public void addBook(String book) {
        booksRead.add(book);
}
}
