package Exercises_Examples;

public class reverse {

    public static void main(String[] args) {
        System.out.println("testReverseArray " + (testReverseArray() ? "PASSED" : "FAILED"));
    }

    public static void reverseArray(int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            int temp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = temp;
        }
    }

        public static boolean testReverseArray () {
            // prepare the answers
            int inputs[][] = {
                    {},
                    {1},
                    {-2, 2},
                    {3, -3},
                    {1, 2, 3},
                    {3, 2, 1, 0},
                    {-4, -4, -4},
                    {-1, 0, 9, 3, 2}};

            int outputs[][] = {
                    {},
                    {1},
                    {2, -2},
                    {-3, 3},
                    {3, 2, 1},
                    {0, 1, 2, 3},
                    {-4, -4, -4},
                    {2, 3, 9, 0, -1}};

            for (int i = 0; i < inputs.length; i++) {
                for (int j = 0; j < inputs.length; j++) {
                    int expected = outputs[i][j];
                    int actual = inputs[i][j];
                    if (actual != expected) {
                        System.out.printf("testReverseArray: case %d, location %d, " + "actual %d, expected %d\n",
                                i, j, actual, expected);
                        return false;
                    }
                }
            }
            return true;

        }
    }
