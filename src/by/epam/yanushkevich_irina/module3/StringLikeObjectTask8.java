package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask8 {


    /* 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
          Случай, когда самых длинных слов может быть несколько, не обрабатывать. */

    public static void main(String[] args) {

        String s = "Find the longest word in the line";

        findLongestWord(s);
    }

    public static void findLongestWord(String line) {

        String[] words = line.split(" ");
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > max) {

                max = words[i].length();
                index = i;
            }
        }
        System.out.println("The longest word: " + words[index]);
    }
}
