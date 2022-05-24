package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask3 {

    // 3. Проверить, является ли заданное слово палиндромом.

    public static void main(String[] args) {

        String s = "Мадам";

        checkIfPalindrome(s);
    }

    public static void checkIfPalindrome(String word) {

        StringBuilder sb = new StringBuilder(word);
        Boolean b = false;

        if (sb.reverse().toString().equalsIgnoreCase(word)) {
            b = true;
        }
        System.out.println(b);
    }
}
