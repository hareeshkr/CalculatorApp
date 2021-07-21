package calculator;
import java.util.Scanner;

public class ReadInput {

    public static String read(){
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        input.close();
        return expression;
    }
}
