package Lesson_39.code.HomeWork;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        PrimeNumber primeNumber = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Число является простым " + primeNumber.isPrime(8));
    }
}
