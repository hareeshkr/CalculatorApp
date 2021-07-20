package calculator;
import java.util.Scanner;

public class Main extends Operations {
    public static void main(String[] args) {
        Operations calc = new Operations();
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the simple calculator");
        System.out.println("Which operation do you want to perform");
        System.out.println("Type 1 - Add; Type 2 - Subtract; Type 3 - Multiplication; Type 4 - Division; Type 5 - Logout");
        int option = inp.nextInt();
        while(true){
            switch (option) {
                case 1:
                    calc.add();
                    break;
                case 2:
                    calc.substract();
                    break;
                case 3:
                    calc.multiplication();
                    break;
                case 4:
                    calc.divide();
                    break;
                case 5:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
