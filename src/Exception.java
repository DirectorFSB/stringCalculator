import java.io.IOException;
import java.util.Scanner;

public class Exception{

    public static void InputExp(String first,String second ,char action) throws IOException {

        if (first.length() > 10) {
            throw new IOException("Строка длинее 10 символов");
        }
        if (second.length() > 10) {
            throw new IOException("Строка длинее 10 символов");
        }
        if(action == 0){
            throw new IOException("Некорректный знак действия");
        }
        if (action == '*' || action == '/') {
            if (second.contains("\"")) throw new IOException("Строчку можно делить или умножать только на число");
        }
        if(action == '+' || action == '-'){
            if(!first.contains("\"") || !second.contains("\"")) throw new IOException("Аргументы должны быть строками");

        }
    }
//    public static void InputExp(String second, char action) throws IOException{
//        if(action == 0){
//            throw new IOException("Некорректный знак действия");
//        }
//        if (action == '*' || action == '/') {
//            if (second.contains("\"")) throw new IOException("Строчку можно делить или умножать только на число");
//        }
//    }
//
}
