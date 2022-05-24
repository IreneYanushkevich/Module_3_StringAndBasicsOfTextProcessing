package by.epam.yanushkevich_irina.module3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpressionTask1 {

    /* 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три
          различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
          слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
          а в случае равенства – по алфавиту. */

    public static void main(String[] args) {

        String text = "It goes without saying, books are our teachers and friends. They teach us to be kind, clever, " +
                "polite, hardworking, friendly. Books help us to learn more about nature, the world around us and " +
                "many other interesting things.\n" +
                "There are a lot of books on history, about animals, travellers, children, school and so on. " +
                "Children like to read adventure and magic books, science fiction and detective stories.\n" +
                "We must keep books clean and tidy.";

        int function = -1;

        while (function != 0) {
            function = chooseFunction("What would you like to do with text? Choose 1, 2, 3 or 0: ", text);
        }
    }

    public static int chooseFunction(String question, String text) {

        System.out.println("________________________________________________________________________________________");
        System.out.println("Press 1 - if you want sort text by number of sentences in a paragraph");
        System.out.println("Press 2 - if you want sort words by length in each sentence in the text");
        System.out.println("Press 3 - if you want sort lexemes by number of symbols in each sentence in the text");
        System.out.println("Press 0 - if you want exit the application");

        Scanner scanner = new Scanner(System.in);
        int function;

        do {
            System.out.println(question);

            while (!scanner.hasNextInt()) {

                System.out.println(question);
                scanner.next();
            }
            function = scanner.nextInt();

        } while (function < 0 || function > 3);


        if (function == 1) {
            sortByNumberOfSentences(text);

        } else if (function == 2) {
            sortByLengthOfWords(text);

        } else if (function == 3) {
            sortByNumberOfSymbol(text);
        }
        return function;
    }

    public static void sortByNumberOfSentences(String text) {

        String[] paragraph = text.split("\\n");
        int[] counterSen = new int[paragraph.length];
        int max = 0;

        for (int i = 0; i < paragraph.length; i++) {

            String[] sentences = splitSentences(paragraph[i]);
            counterSen[i] = sentences.length;

            if (sentences.length > max) {
                max = sentences.length;
            }
        }
        System.out.println("Text sorted by number of sentences in a paragraph: ");
        System.out.println("________________________________________________________________________________________");

        for (int i = 1; i <= max; i++) {

            for (int j = 0; j < counterSen.length; j++) {

                if (i == counterSen[j]) {
                    System.out.println(paragraph[j]);
                }
            }
        }
    }

    public static void sortByLengthOfWords(String text) {

        System.out.println("Text with words sorted by length in each sentence: ");
        System.out.println("________________________________________________________________________________________");

        String[] paragraphs = text.split("\n");

        for (String paragraph : paragraphs) {

            String[] sentences = splitSentences(paragraph);

            for (String sentence : sentences) {

                String[] words = splitWords(sentence);

                for (int i = words.length - 1; i >= 0; i--) {

                    for (int j = 0; j < i; j++) {

                        if (words[j].length() > words[j + 1].length()) {

                            String tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;
                        }
                    }
                }
                for (String word : words) {

                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
    }

    public static void sortByNumberOfSymbol(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a symbol for sorting lexemes by descending >>");
        String symbol = scanner.next();

        System.out.println("Text with sorted by number of symbols in each lexeme: ");
        System.out.println("________________________________________________________________________________________");

        String[] paragraphs = text.split("\n");

        for (String paragraph : paragraphs) {

            String[] sentences = splitSentences(paragraph);

            for (String sentence : sentences) {

                String[] words = splitWords(sentence);

                for (int i = words.length - 1; i >= 0; i--) {

                    for (int j = 0; j < i; j++) {

                        int count1 = 0;
                        int count2 = 0;

                        for (int n = 0; n < words[j].length(); n++) {

                            if (String.valueOf(words[j].charAt(n)).compareTo(symbol) == 0) {
                                count2++;
                            }
                        }
                        for (int n = 0; n < words[j + 1].length(); n++) {

                            if (String.valueOf(words[j + 1].charAt(n)).compareTo(symbol) == 0) {
                                count1++;
                            }
                        }
                        if (count2 < count1) {
                            String temp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = temp;

                        } else if (count1 == count2 && count1 != 0) {
                            String[] compare = {words[j], words[j + 1]};
                            Arrays.sort(compare);
                            words[j] = compare[0];
                            words[j + 1] = compare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
    }

    private static String[] splitSentences(String text) {

        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {

        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }
}
