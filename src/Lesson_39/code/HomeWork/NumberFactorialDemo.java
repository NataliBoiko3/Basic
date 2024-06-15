package Lesson_39.code.HomeWork;

public class NumberFactorialDemo {
    public static void main(String[] args) {
        //Напишите функциональный интерфейс для вычисления факториала числа.
        NumberFactorial numberFactorial = (n) -> {
            int res1 = 1;
            for (int i = 1; i <= n; i++) {
                res1 *= i;
            }
            return res1;
        };
        System.out.println("Факториал числа равен " + numberFactorial.res1(5));
        }

    }