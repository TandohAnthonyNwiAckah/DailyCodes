class MainTestCase {

public static void main(String[] args) {

    findMaxConsecutiveOnesTest();

}




// Test for the maximum number of consecutive 1s.
public static void findMaxConsecutiveOnesTest() {
    
    ArrayOne arr = new ArrayOne();

    int num[] = { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 ,1};

    System.out.println("The maximum number of consecutive 1s is : " + arr.findMaxConsecutiveOnes(num));

}







}