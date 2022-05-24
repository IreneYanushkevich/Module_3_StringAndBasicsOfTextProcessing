package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask9 {

    /* 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
          Учитывать только английские буквы. */

    public static void main(String[] args) {

        String s = "Need To Count Lowercase And Uppercase Letters, Учитывая Только Английские Буквы";

        System.out.println("Amount of uppercase letters = " + countUppercaseLetters(s));
        System.out.println("Amount of lowercase letters = " + countLowercaseLetters(s));
    }

    public static int countUppercaseLetters(String line) {

        int count = 0;

        for (int i = 0; i < line.length(); i++) {

            if ((int) (line.charAt(i)) > 64 && (int) (line.charAt(i)) < 91) {
                count++;
            }
        }
        return count;
    }

    public static int countLowercaseLetters(String line) {

        int count = 0;

        for (int i = 0; i < line.length(); i++) {

            if ((int) (line.charAt(i)) > 96 && (int) (line.charAt(i)) < 123) {
                count++;
            }
        }
        return count;
    }
}
