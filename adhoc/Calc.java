// Calculator for basic operations
package adhoc;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        // takes numbers from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt();
        int ans = 0;

        // take operator while user exits
        while(true) {

            System.out.print("Enter the operation you want to perform: ");
            char oper = input.next().trim().charAt(0);

            if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%') {

                if (oper == '+') ans = num1 + num2;
                if (oper == '-') ans = num1 - num2;
                if (oper == '*') ans = num1 * num2;
                if (oper == '/') ans = num1 / num2;
                if (oper == '%') ans = num1 % num2;

            } else if (oper == 'x' || oper == 'X') {
                break;
            } else {
                System.out.println("Invalid operation. Please use (+,-,*,/,% or press 'x' to exit.)");
            }
            System.out.println("The answer of the operation is " + ans);
        }
        input.close();

    }
}

