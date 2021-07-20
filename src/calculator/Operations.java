package calculator;
import java.util.Scanner;

public class Operations {
    Scanner inp = new Scanner(System.in);
    public void add() {
        int sum = 0;
        System.out.println("How much numbers to add?(Size)");
        int size = inp.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers to add");
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is " + sum);
    }
        public void substract(){
            System.out.println("Enter the two numbers to subtract");
            int a = inp.nextInt();
            int b = inp.nextInt();
            System.out.println("The difference is " + (a - b));
        }
        public void multiplication(){
            System.out.println("Enter how many number you want to multiply");
            int size = inp.nextInt();
            int arr[] = new int[size];
            int mul = 1;
            System.out.println("Enter the numbers to multiply");
            for(int i=0; i<size; i++){
                arr[i] = inp.nextInt();
            }
            for(int i=0; i<size; i++){
                mul *= arr[i];
            }
            System.out.println("The product is " + mul);

        }
        public void divide(){
            System.out.println("Enter the numbers to divide");
            int dividend = inp.nextInt();
            int divisor = inp.nextInt();
            System.out.println("The quotient is " + dividend / divisor);
            System.out.println("The reminder is " + dividend % divisor);
        }

}
