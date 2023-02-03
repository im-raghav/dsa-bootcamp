// reverses a given array
package adhoc;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // pointers
        int start = 0;
        int end = arr.length - 1;

        // empty array
        if (arr.length == 0)
            System.out.println("Empty Array");
        
        while (start < end) {

            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.print("After reversing: ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}