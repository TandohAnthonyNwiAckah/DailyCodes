/**Given a binary array, find the maximum number of consecutuive 1s in the array
*Input : [1,1,0,1,1,1]
*Output : 3
*The first two digits or the last three digit are consecutives. The maximum number of 1s is 3.
*/


public class ArrayOne {
    
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCons = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCons = Math.max(count, maxCons);  //Math.max returns the greater of count and maxCons values.
            } else
                count = 0;
        }
        
        
        return maxCons;
    }
}
