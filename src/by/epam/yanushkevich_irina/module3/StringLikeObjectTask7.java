package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask7 {

    /* 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
          "abc cde def", то должно быть выведено "abcdef". */

    public static void main(String[] args) {

        String s = "  abc cde    deeeef aachg k   ";

        deleteRepetitions(s);
    }

    public static void deleteRepetitions(String line) {

        StringBuilder sb = deleteExtraSpaces(line);

        for (int i = 0; i < sb.length(); i++) {

            for (int j = sb.length() - 1; j > i; j--) {

                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                }
            }
        }
        System.out.println(sb);
    }

    public static StringBuilder deleteExtraSpaces(String expression) {

        return new StringBuilder(expression.replace(" ", ""));
    }
}
