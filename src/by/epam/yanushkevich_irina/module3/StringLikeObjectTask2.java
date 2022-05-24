package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask2 {

    // 2. В строке вставить после каждого символа 'a' символ 'b'.

    public static void main(String[] args) {

        String s = "We need to insert character 'b' after each character 'a' in this task ";

        System.out.println(insertSymbol(s));
    }

    public static StringBuilder insertSymbol(String line) {

        StringBuilder sb = new StringBuilder(line);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.insert(i + 1, 'b');
            }
        }
        return sb;
    }

    // another way:
   /* public static String insertSymbol(String line) {

        return line.replace("a", "ab");
    } */
}
