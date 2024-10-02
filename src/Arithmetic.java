import static java.lang.Integer.parseInt;

public class Arithmetic {
    public static void addition(String first ,String second){
        System.out.println();
        System.out.println("\"" + first + second + "\"");
    }

    public static void subtraction(String first, String second){
        String[] words = first.split(" ");
        String result ="";
        int i = 0;
        while(i < words.length){
            if(words[i].equals(second) ) {
            i++;
            }else {
                result += words[i];
                i++;
            }

        }
        System.out.println("\"" + result + "\"");
    }
    public static void multiplication(String first , String second){
        System.out.println("\"" + first.repeat(parseInt(second)) + "\"");
    }
    public static void division(String first , String second){
        int wordsCount = first.length() / parseInt(second);
        System.out.println("\""+first.substring(0,wordsCount)+"\"");

    }
}
