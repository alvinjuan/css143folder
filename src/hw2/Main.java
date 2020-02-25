package hw2;
/*
CSS143B homework 1, problem 1
by [Alvin Jasper Juan]
 */

// got help from geeksforgeeks.org on figuring out my code and one of the student in the class

public class Main {
    public static void main(String[] args) {
        // shows the result of the test
        System.out.println("testBinarySearch " + (testBinarySearch() ? "PASSED" : "FAILED"));
    }
    public static int binarySearch(int[] data, int target) {
        int l = 0;                  //determines left side boundary of array
        int r = data.length - 1;    // determines right side boundary of array
        while(l <= r){
            int mid = l + ((r - l) / 2);

            // if they're equal then the target num is in the middle
            if (data[mid] == target){
                return mid;

               // if num is bigger than middle num, ignore left side
            } if (data[mid] < target){
                l = mid + 1;

                // if num is smaller than middle num, ignore right side
            } else {
                r = mid - 1;
            }
        }
        return -1;                  // if none in the array
    }
    public static boolean testBinarySearch() {
        // test cases
        int input[][] = {
                {},
                {3, 100, 321, 67, 8, 43},
                {3, 1, 2},
                {9,15,14,76,188,2},
                {1, 2, 3, 4, 5}
                };
        int target[] = {7,321,1,188,3};     // target nums to find in the arrays
        int result[] = {-1,2,1,4,2};        // position of the target num in array
        for (int i = 0; i < input.length; i++) {        // checks to see the results match with the expected
            int expected = result[i];
            int actual = binarySearch(input[i], target[i]);
            // fails, indicates the error
            if (expected != actual){
                System.out.printf("Case %d:  Expected: %s  Actual: %s\n", i, expected, actual);
                return false;
            }
        }
        return true;
    }
}
// actual is the real result when the code is ran
// expected is the predicted result before the code is ran
