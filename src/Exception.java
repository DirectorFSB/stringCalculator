import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exception {

    public static void inputExp(String first, String second, char action) throws IOException {

        if (first.length() > 10) {
            throw new IOException("Строка длинее 10 символов");
        }
        if (second.length() > 10) {
            throw new IOException("Строка длинее 10 символов");
        }
        if (action == 0) {
            throw new IOException("Некорректный знак действия");
        }
        if (action == '*' || action == '/') {
            if (!first.contains("\"")) throw new IOException("Первый аргумент должен быть строкой");
            if (second.contains("\"")) throw new IOException("Строчку можно делить или умножать только на число");
            if (second.length() > 2) throw new IOException("Недопустимое значение аргумента. Введите число от 1 до 10");
            try {parseInt(second);
            }catch(NumberFormatException e){
                throw new IOException("Недопустимое значение аргумента. Введите число от 1 до 10");


            }
            if (parseInt(second) < 1 || parseInt(second) > 10)
                throw new IOException("Допустимые числа при умножении и делении от 1 до 10");

        }
        if (action == '+' || action == '-') {
            if (!first.contains("\"") || !second.contains("\""))
                throw new IOException("Аргументы должны быть строками");

        }
    }
}
