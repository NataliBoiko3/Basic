package Lesson_39.code.HomeWork;

public class PalindromeDemo {
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = (input) -> {
            String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversedInput = new StringBuilder(sanitizedInput).reverse().toString();
            return sanitizedInput.equals(reversedInput);
        };


        System.out.println("Строка/слово является палиндромом: " + palindromeCheck.isPalindrome("detarrated"));
        System.out.println("Строка/слово является палиндромом: " + palindromeCheck.isPalindrome("hello"));
    }
}
