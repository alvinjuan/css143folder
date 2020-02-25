package Exercises_Examples;

public class recursive {
    public static void main(String[] args){
        int arr[] = {12,12,1,7,18,10,3};
        int n = 0;
    }
    public static int maxRecursive(int arr[], int n){
        if (arr[arr.length - 1] > arr[n]){
            return arr[arr.length - 1];
        }
        if (arr[n] > arr[arr.length - 1]){
            return arr[n];
        }
        return 0;
    }
}
