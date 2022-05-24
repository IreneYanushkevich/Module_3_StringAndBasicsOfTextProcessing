package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask1 {

    // 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public static void main(String[] args) {

        String s = "We need   to  count           the  largest  number of consecutive spaces in    this line  .";

        System.out.println("The largest number of consecutive spaces = " + countSpaces(s));
    }

    public static int countSpaces(String line) {

        String[] words = line.split(" ");
        int max = Integer.MIN_VALUE;
        int count = 0;


        for (int i = 0; i < words.length; i++) {

            if (words[i].isEmpty()) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max + 1;
    }
}
