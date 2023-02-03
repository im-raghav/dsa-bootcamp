// counts the recurrence of given number 
package adhoc;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int count = 0;
        
        // takes an number from user and the digit to find occurence of 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();
        System.out.print("Enter the digit: ");
        byte digit = input.nextByte();

        // counts the occurence 
        while (num != 0) {

            long temp = num % 10;
            if (temp == digit) count++;
            num /= 10;

        } 
        System.out.printf("%d lies in the given number %d of times.", digit, count);
        input.close();
    }
}