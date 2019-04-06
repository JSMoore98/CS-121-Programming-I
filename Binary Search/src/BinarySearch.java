
import java.util.*;
import java.util.Scanner;

public class BinarySearch{
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean found;
        int size;
        int val;
        
        System.out.println("Enter array size:");
        size = input.nextInt();
        int[] arr = new int[size];
        
        getSortedArray(arr, size);
        System.out.println("Enter the value to search the array for");
        val = input.nextInt();
        found = binary(val, arr, size);
        if (found) {
            System.out.println("The value " + val + " was found in array");
        } else {
            System.out.println("Value " + val + " was not found in array.");
        }
    }

    private static boolean binary(int val, int[] arr, int size) {
        
        int mid;
        int high;
        int low;
        
        low = 0;
        high = size - 1;
        boolean found;
        
        found = false;
        
        while (! found && low <= high) {
            mid = (int) ((double) (low + high) / 2);
            if (arr[mid] == val) {
                found = true;
            } else {
                if (arr[mid] > val) {
                    System.out.println(arr[mid] + " is too high.");
                    high = mid - 1;
                } else {
                    System.out.println(arr[mid] + " is too low.");
                    low = mid + 1;
                }
            }
        }
        
        return found;
    }

    private static void getSortedArray(int[] arr, int size) {
        int i;
        int x;
        int temp;
        
        for (i = 0 ; i <= size - 1 ; i += 1) {
            arr[i] = random.nextInt(100) + 1;
        }
        for (x = 0 ; x <= size ; x += 1) {
            for (i = 0 ; i <= size - 2 ; i += 1) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (i = 0 ; i <= size - 1 ; i += 1) {
            System.out.println((i + 1) + " = " + arr[i]);
        }
    }
}

