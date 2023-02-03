// reverse the given number  
package adhoc;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int num = input.nextInt();

        int reversedNum = 0;

        while (num != 0) {
            
            int temp = num % 10;
            reversedNum = reversedNum * 10 + temp;
            num /= 10;
        }
        System.out.printf("The reverse number is %d", reversedNum);
        input.close();
    }
}

