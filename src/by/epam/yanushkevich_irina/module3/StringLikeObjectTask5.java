package by.epam.yanushkevich_irina.module3;

public class StringLikeObjectTask5 {

    // 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

    public static void main(String[] args) {

        String s = "Алмаатинец Антон афишировал аванс";
        char ch = 'а';

        System.out.println("Number of letters " + ch + " = " + countLetter(s, ch));
    }

    public static int countLetter(String line, char letter) {

        int count = 0;

        for (int i = 0; i < line.length(); i++) {

            if (line.toLowerCase().charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
