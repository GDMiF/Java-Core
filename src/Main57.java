import java.util.InputMismatchException;
import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("ENTER THE NUMBER!!!");
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        finally {
            System.out.println("This always executes");
        }


        scanner.close();
    }
}
