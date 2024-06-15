package Lesson_39.code.HomeWork;

public class SumOfNumbersDemo {
    public static void main(String[] args) {

        SumOfNumbers sumOfNumbers = (x,y) -> { return x + y;};
        System.out.println("Сумма элементов = " + sumOfNumbers.result(5,9));
    }
}
