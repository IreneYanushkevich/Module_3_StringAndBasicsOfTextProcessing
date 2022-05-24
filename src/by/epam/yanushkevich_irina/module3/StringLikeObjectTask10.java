package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask10 {

    /* 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
           вопросительным знаком. Определить количество предложений в строке X. */

    public static void main(String[] args) {

        String s = "A line consists of several sentences. " +
                "Every sentence ends with a dot, exclamation point or question mark! " +
                "Determine the number of sentences per line?";

        System.out.println("The number of sentences per line = " + countSentences(s));
    }

    public static int countSentences(String line) {

        int count = 0;

        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == '!') {
                count++;
            }
        }
        return count;
    }
}
