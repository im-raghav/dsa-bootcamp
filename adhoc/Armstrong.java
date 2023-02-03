// prints armstrong numbers < 1000
package adhoc;

public class Armstrong {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return (sum == originalNum);
    }
}
