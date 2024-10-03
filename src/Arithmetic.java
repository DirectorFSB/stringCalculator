import static java.lang.Integer.parseInt;

public class Arithmetic {
    public static void addition(String first ,String second){
        System.out.println();
        System.out.println("\"" + first + second + "\"");
    }

    public static void subtraction(String first, String second){
        String result ="";
        int i = first.indexOf(second);
        result =first.substring(0,i) +first.substring(i+second.length(),first.length()) ;
        System.out.println("\"" + result + "\"");
    }
    public static void multiplication(String first , String second){
        String result = first.repeat(parseInt(second));
        if(result.length() > 40) {
            System.out.println("\"" +result.substring(0,40) + "...\"");
        }else{System.out.println("\"" + result + "\"");}

    }
    public static void division(String first , String second){
        int wordsCount = first.length() / parseInt(second);
        System.out.println("\""+first.substring(0,wordsCount)+"\"");

    }
}
