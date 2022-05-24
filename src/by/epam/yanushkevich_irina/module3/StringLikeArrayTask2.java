package by.epam.yanushkevich_irina.module3;

public class StringLikeArrayTask2 {

    // 2. Замените в строке все вхождения 'word' на 'letter'.

    public static void main(String[] args) {

        String s = "Lets write the word two times: word, word";

        System.out.println(replaceWord(s, "word", "letter"));
    }

    public static String replaceWord(String expression,String instead, String insert) {

        return expression.replace(instead, insert);
    }
}
