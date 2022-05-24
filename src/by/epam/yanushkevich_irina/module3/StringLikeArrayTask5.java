package by.epam.yanushkevich_irina.module3;

public class StringLikeArrayTask5 {

    /* 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
          Крайние пробелы в строке удалить. */

    public static void main(String[] args) {

        String s = "          This   line  needs to     be edited   ";

        System.out.print("Result: " + deleteExtraSpaces(s));
    }

    public static String deleteExtraSpaces(String expression) {

        return expression.trim().replaceAll("\\s+", " ");
    }
}

