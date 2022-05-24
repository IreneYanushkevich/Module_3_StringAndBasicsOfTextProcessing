package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask6 {

    // 6. Из заданной строки получить новую, повторив каждый символ дважды.

    public static void main(String[] args) {

        String s = "We need to repeat every character twice";

        System.out.print("New line: ");
        repeatEveryChar(s);
    }

    public static void repeatEveryChar(String line) {

        StringBuilder sb = new StringBuilder(line);

        for (int i = 0; i < sb.length(); i += 2) {
            sb.insert(i, sb.charAt(i));
        }
        deleteExtraSpaces(sb.toString());
    }

    public static void deleteExtraSpaces(String expression) {

        String[] words = expression.split(" ");

        for (String arg : words) {

            if (!arg.isEmpty()) {
                System.out.print(arg + " ");
            }
        }
    }
}
