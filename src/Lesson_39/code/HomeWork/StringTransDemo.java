package Lesson_39.code.HomeWork;

public class StringTransDemo {
    public static void main(String[] args) {
        StringTrans toUpperCase = (input) -> input.toUpperCase();

        String originalString = "Привет";
        String transString = toUpperCase.trans(originalString);

        System.out.println("Обычная строка: " + originalString);
        System.out.println("Строка в верхнем регистре: " + transString);

    }
}
