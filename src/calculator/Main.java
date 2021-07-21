package calculator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String exp = ReadInput.read();

        Queue<String> numbers;
        Queue<String> operators;

        String numbersArr[] = exp.split("[-+*/]");
        String oprArr[] = exp.split("[0-9]+");

        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operators = new LinkedList<String>(Arrays.asList(oprArr));

        Double res = Double.parseDouble(numbers.poll());

        while(!numbers.isEmpty()){
            String opr = operators.poll();

            Operate operate;

            switch (opr){
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }

            Double num = Double.parseDouble(numbers.poll());
            res = operate.getResult(res, num);
        }

        System.out.println(res);

    }
}
