package by.epam.yanushkevich_irina.module3;

public class StringLikeArrayTask3 {

    // 3. В строке найти количество цифр.

    public static void main(String[] args) {

        String s = "dfg5 gh67 678";

        System.out.println("Amount of digits in the string = " + countDigits(s));
    }

    public static int countDigits(String expression) {

        int count = 0;

        for (int i = 0; i < expression.length(); i++) {

            if (Character.isDigit(expression.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

