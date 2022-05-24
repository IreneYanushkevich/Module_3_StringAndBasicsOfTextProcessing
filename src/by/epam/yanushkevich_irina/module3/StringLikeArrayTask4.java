package by.epam.yanushkevich_irina.module3;

public class StringLikeArrayTask4 {

    // 4. В строке найти количество чисел.

    public static void main(String[] args) {

        String s = "       dfg5    gh67           678      ";

        System.out.println("Amount of numbers in the string = " + countNumbers(s));
    }

    public static int countNumbers(String expression) {

        expression = expression.replaceAll("\\D+", " ");
        return expression.trim().split(" ").length;
    }
}


