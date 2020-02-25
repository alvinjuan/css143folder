package problem_2;
/*
CSS143B homework 1, problem 2
by [Alvin Jasper Juan]
 */

// got some help from geeksforgeeks.org for my bubbleSort especially the for the logic of the nested for looping

import java.util.Arrays;
public class Main {
    // shows the result of the test
    public static void main(String[] args) {
        // shows the result of the test
        System.out.println("testBubbleSort " + (testBubbleSort() ? "PASSED" : "FAILED"));
    }

    // sorts the nums in a ascending order
    public static void bubbleSort(int[] data) {
        int largest = 0;
        int d = data.length;

        // integer is passed through to be ordered
        for (int i = 0; i < d-1; i++){
            for (int j = 0; j<(d-i-1); j++){

                // larger numbers placed in the back of the array
                if (data[j] > data[j+1]){
                    largest = data[j];
                    data[j] = data[j+1];
                    data[j+1] = largest;
                }
            }
        }
    }

    public static boolean testBubbleSort() {
        // test cases
        int input[] = {3,2,10,8,100,9,38,23,82,61,5};
        // sorted arrays
        int value[] = {2,3,5,8,9,10,23,38,61,82,100};

        // test to determine if the bubbleSort works
        for(int i=0;i<input.length;i++){
            bubbleSort(input);
            int expected = value[i];
            int actual = input[i];
            if (expected != actual){
                // fails, returns the reason of failure
                System.out.printf("Case: %d, Expected: %d, Actual: %d\n", i, expected, actual);
                return false;
            }
        }
        return true;
    }
}
