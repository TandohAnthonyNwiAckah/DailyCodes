import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 *
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 **/

public class ArraySquare {

    public int[] sortedSquares(int[] A) {

        int num = A.length;

        int[] arr = new int[num];

        for (int i = 0; i < num; i++){

            arr[i] = A[i] * A[i];

        }

        Arrays.sort(arr);

        
        return arr;
    }

}
