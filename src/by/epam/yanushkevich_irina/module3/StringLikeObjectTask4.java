package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask4 {

    // 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

    public static void main(String[] args) {

        String s = "информатика";
        System.out.println(composeWord(s));
    }

    public static String composeWord(String word) {

        String t = String.copyValueOf(word.toCharArray(), 7, 1);
        String or = String.copyValueOf(word.toCharArray(), 3, 2);

        return t + or + t;

        // second way:
        // return word.charAt(7) + word.substring(3, 5) + word.charAt(7);
    }
}