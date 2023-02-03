// Prints the nth fibonnaci number 
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {

        // takes an input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term you want to find: ");
        int num = input.nextInt();

        // initial setting up of fibonnaci series
        int first = 0, second = 1;
        int next = first + second;
        int count = 2;

        // loop to find the nth term
        while (count <= num) {

            first = second;
            second = next;
            next = first + second;
            count++;
        }
        System.out.printf("The nth number in Fibonnaci is %d.", first);
        input.close();
    }
}