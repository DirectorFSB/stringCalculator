import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static char action;
    static String[] data = new String[0];
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение [\"a\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x] где a и b - строки а x - число  от 1 до 10 включительно  + Enter :");
        String exp = in.nextLine();
        char action = 0;
        String[] data = new String[0];
        if (exp.contains(" + ")) {
            data = exp.split(" \\+ ");
            action = '+';
        } else if (exp.contains(" - ")) {
            data = exp.split(" - ");
            action = '-';
        } else if (exp.contains(" * ")) {
            data = exp.split(" \\* ");
            action = '*';
        } else if (exp.contains(" / ")) {
            data = exp.split(" / ");
            action = '/';
        }



        Exception.inputExp(data[0],data[1],action);

        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        }

        if (action == '+') {
            Arithmetic.addition(data[0], data[1]);
        }else if(action == '-') {
            Arithmetic.subtraction(data[0] , data[1]);
        }else if ( action == '*'){
            Arithmetic.multiplication(data[0] , data[1]);
        }else if (action == '/') {
            Arithmetic.division(data[0], data[1]);
        }

    }
}