import java.util.Arrays;

public class MainTestCase {

 //TODO:: Uncomment each method in the main Method to run the test.

public MainTestCase(){
    
System.out.printf("1");

new MainTestCase(10);

System.out.printf("5");


}

public MainTestCase(int temp){
System.out.printf("2");

new MainTestCase(10,20);


System.out.printf("4");

}

public MainTestCase(int data,int temp){
    System.out.printf("3");
}


public static void main(String[] args) {

    // MainTestCase obj = new MainTestCase();

    // findMaxConsecutiveOnesTest();

    // evenDigit();

    // jumping();

    arraySquare();


}

// Jumping Statement.
public static void jumping() {

    int x = 2;
    int y = 0;

    for (; y < 10; ++y) {
        if (y % x == 0)

            continue; // causes the loop to jump to the next iteration.

        else if (y == 8)
            break;  // terminate a loop immediately.
        else
            System.out.println(y);
    }


    
}

// Test for the maximum number of consecutive 1s.
public static void findMaxConsecutiveOnesTest() {
    
    ArrayOne arr = new ArrayOne();

    int num[] = { 0, 0, 1, 0, 1, 1, 1, 0, 0,0, 1, 1, 1, 1, 1 ,1};

    System.out.println("The maximum number of consecutive 1s in " + Arrays.toString(num) + " is : " + arr.findMaxConsecutiveOnes(num));

    // int index = 0;
    // int maxCount = 0;

    // for(int x = 0; x < num.length; x++){

    //     if(num[x] == 0){
    //         index++ ;
    //         maxCount = Math.max(index, maxCount);


    //     }
    //     else{
    //       index = 0 ;
    //     }
    // }

    // System.out.println("The maximum number of consecutive 0s in " + Arrays.toString(num) + " is : "  + maxCount);

}

// Test for even digits
public static void evenDigit() {

     EvenDigit evd = new EvenDigit();

     int num[] = { 120, 20, 1, 1230,110,1200};
     

      System.out.println("There  are  " + evd.findNumbers(num) + " number with even Digits");

    
}

public static void arraySquare() {
    
    ArraySquare arr = new ArraySquare();

    int input[] = { -20, 6, 1, 12, 0, -120 };

    System.out.println("The output of the Square Array are   " + Arrays.toString(arr.sortedSquares(input)));




}





}