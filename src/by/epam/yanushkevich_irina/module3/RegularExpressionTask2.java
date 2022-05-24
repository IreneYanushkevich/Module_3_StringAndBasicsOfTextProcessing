package by.epam.yanushkevich_irina.module3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTask2 {

    /* 2. Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий последовательно
          возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
          тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя. */

    public static void main(String[] args) throws IOException {

        String file = "c:\\Users\\Irene\\IdeaProjects\\Module3\\src\\by\\epam\\yanushkevich_irina\\module3\\file.xml";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        while (line != null) {
            System.out.println(line.trim());
            String s = xmlAnalyzer(line);
            System.out.println(s);
            line = reader.readLine();
        }
    }

    private static String xmlAnalyzer(String xml) {

        StringBuilder sb = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = xml.split("\n\\s*"); /* разбиваем xml построчно */

        /* проверяем содержимое каждой строки */
        for (String line : lines) {

            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);

            if (mEmpty.find()) {
                sb.append(mEmpty.group());
                sb.append(" - тег без тела\n");
            }
            if (mOpen.find()) {
                sb.append(mOpen.group());
                sb.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                sb.append(mBody.group().substring(1));
                sb.append("\b - содержимое тега\n");
            }
            if (mClose.find()) {
                sb.append(mClose.group());
                sb.append(" - закрывающий тег\n");
            }
        }
        return sb.toString();
    }
}
