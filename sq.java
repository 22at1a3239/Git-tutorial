import java.io.*;
import java.util.*;

public class sq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt(); // Number of test cases
        String s="00100000000000000000000000000000";
        int c=0;
        for(int i=0;i<s.length();i++){
            c++;
        }
        System.out.println(c);
        
        // while (t-- > 0) {
        //     int n = sc.nextInt(); // Size of the array
        //     int[] a = new int[n];
            
        //     for (int i = 0; i < n; i++) {
        //         a[i] = sc.nextInt(); // Read array elements
        //     }
            
        //     // Selection Sort
        //     for (int i = 0; i < n - 1; i++) {
        //         int min = i;
                
        //         // Find the index of the minimum element in the unsorted portion
        //         for (int j = i + 1; j < n; j++) {
        //             if (a[j] < a[min]) {
        //                 min = j;
        //             }
        //         }
                
        //         // Swap if necessary
        //         if (min != i) {
        //             // Print the indices involved in the swap
        //             System.out.print(i );
                    
        //             // Perform the swap
        //             int temp = a[i];
        //             a[i] = a[min];
        //             a[min] = temp;
        //         }
        //     }
            
        //     System.out.println(); // New line after each test case
        // }
        
        // sc.close();
    }
}
