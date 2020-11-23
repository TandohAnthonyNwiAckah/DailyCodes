import java.util.Arrays;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of
 * zero, shifting the remaining elements to the right. Note that elements beyond
 * the length of the original array are not written.
 * 
 * Input: [1,0,2,3,0,4,5,0]
 * 
 * Output: null Explanation: After calling your function, the input array is
 * modified to: [1,0,0,2,3,0,0,4]
 * 
 */



public class DuplicateZero {


    public void duplicateZeros(int[] arr) {

        // Loop through each element
        for (int i = 0; i < arr.length; i++) {

            // if 0 duplicate it and shift
            if (arr[i] == 0) {
                shiftDuplicateArray(arr, i);

                System.out.println(" " + Arrays.toString(arr));

                i += 1;
              

            }

        
        }

    }

  
    // duplicates 0 and shift to the right
    public void shiftDuplicateArray(int[] arr, int index) {
        // tmp variable
        int tmp = 0;

        // Loop through each element starting from index
        for (int i = index; i < arr.length; i++) {
            // Keep swaping elements out

            int inner = arr[i];
            arr[i] = tmp;
            tmp = inner;

        }
    }

}
