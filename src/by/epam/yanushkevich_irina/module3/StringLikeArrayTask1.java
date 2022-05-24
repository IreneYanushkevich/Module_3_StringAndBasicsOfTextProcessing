package by.epam.yanushkevich_irina.module3;

public class StringLikeArrayTask1 {

    // 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public static void main(String[] args) {

        String[] names = {"maxValue", "minValue", "sumOfNumbers"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(camelToSnake(names[i]));
        }
    }

    public static String camelToSnake(String camel) {

        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";

        return camel.replaceAll(regex, replacement).toLowerCase();
    }
}
