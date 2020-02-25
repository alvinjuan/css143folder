package Exercises_Examples;

import java.util.Objects;

class FindMaxRet{
    int max;
    boolean valid;

    public FindMaxRet(int max, boolean valid) {
        this.max = max;
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindMaxRet that = (FindMaxRet) o;
        return max == that.max &&
                valid == that.valid;
    }

    @Override
    public String toString() {
        return "FindMaxRet{" +
                "max=" + max +
                ", valid=" + valid +
                '}';
    }
}

public class MaxNumber {
    public static void main(String args[]){
        System.out.println("testFindMax: " + (testFindMax() ? "PASSED" : "FAILED"));
    }
    public static FindMaxRet findMax(int[] values){
        if (values.length==0){
            return new FindMaxRet(-1, false);
        }
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            if (max < values[i]){
                max = values[i];
            }
        }
        return new FindMaxRet(max, true);
    }
    public static boolean testFindMax(){
        int inputs[][] = {
                {},
                {1},
                {1, 2},
                {2, 1},
                {-1, -3, -2},
        };
        int[] outputs = {-1, 1, 2, 2, -1};
        FindMaxRet[] expected = new FindMaxRet[outputs.length];
        for (int i = 0; i < outputs.length; i++){
            expected[i] = new FindMaxRet(outputs[i], (i == 0 ? false : true));
        }
        for (int i = 0; i < inputs.length; i++){
            FindMaxRet actual = findMax(inputs[i]);
            if (!expected[i].equals(actual)){
                System.out.printf("testFindMax: case %d, expect: %s, actual: %s\n", i, expected[i], actual);
                return false;
            }
        }
        return true;
    }
}
