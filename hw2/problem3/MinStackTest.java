package hw2.problem3;

/*
got help from other students on what test to do and how they implemented it
got help from leetcode codes
 */

public class MinStackTest {

    public static boolean test1() {
        int arr[][] = {
                {},
                {1, 2},
                {0, 1},
                {1, 2, 3},
                {3, 2, 1},
                {0, 1, 2},
                {2, 0, 5, 4}};
        int result[] = {-1, 1, 0, 1, 1, 0, 0};

        StackElement[] expected = new StackElement[result.length];
        for (int i = 0; i < result.length; i++) {
            int empty;
            boolean isEmpty;
            if (arr[i].length == 0) {
                empty = -1;
                isEmpty = false;
            } else {
                empty = result[i];
                isEmpty = true;
            }
            expected[i] = new StackElement(empty, isEmpty);
        }

        for (int i = 0; i < arr.length; i++) {
            int[] push = arr[i];
            MinStack min = new MinStack(push.length);
            for (int j = 0; j < push.length; j++) {
                min.push(push[j]);
            }
            StackElement actual = min.getMin();
            if (!actual.equals(expected[i])) {
                System.out.println("Push Failed:  Expected:" + expected[i] + "  Actual:" + actual);
                return false;
            }
        }
        return true;
    }

    public static boolean test2() {
        int arr[] = {9, 8, 7, 6};
        MinStack min = new MinStack(arr.length);

        for (int i = 0; i < arr.length; i++) {
            min.push(arr[i]);
        }
        int len = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            StackElement act = min.getMin();
            StackElement exp = new StackElement(arr[len - i], true);
            if (!act.equals(exp)) {
                System.out.println("Pop Failed:  Expected:" + exp + "  Actual:" + act);
                return false;
            }
            min.pop();
        }

        StackElement exp = new StackElement(-1, false);
        StackElement act = min.getMin();

        if (!act.equals(exp)) {
            System.out.println("Pop Failed:  Expected: " + exp + "Actual: " + act);
            return false;
        }
        return true;

    }

    public static boolean testMinStack() {
        // homework
        int track = 0;
        if (test1() != true) {
            track++;
        }
        if (test2() != true) {
            track++;
        }
        if (track >= 1){
            return false;
        }
        return true;
    }
}




