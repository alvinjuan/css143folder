package hw2.problem1;

/*
CSS143B homework 2, problem 1
by [Alvin Jasper Juan]
 */

// credit goes to study.com (Article Name: how to sort an array in java) for helping me
// figure out my code

public class Main {
    public static void main(String[] args) {
        System.out.println("testColorSort " + (Tests.testColorSort() ? "PASSED" : "FAILED"));
    }

    public static void colorSort(int[] input) {
        // 0 = red
        // 1 = yellow
        // 2 = green
        // homework
        int start = 0;
        int end  = input.length - 1;
        int temp = 0;

        if (input.length == 0 || input.length == 1){ return; }

        while (temp <= end && start < end){
            if (input[temp] == 0){
                input[temp] = input[start];
                input[start] = 0;
                temp++;
                start++;
            }
            else if (input[temp] == 2){
                input[temp] = input[end];
                input[end] = 2;
                end--;
            }
            else {
                temp++;
            }
        }

    }
}