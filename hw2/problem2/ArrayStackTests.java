package hw2.problem2;

// got help from the examples and geeksfromgeeks
// got help from other students
// got help from leetcode videos

public class ArrayStackTests {
    public static boolean testArrayStackEmpty() {
        ArrayStack stack = new ArrayStack(0);
        String testName = "testArrayStack";
        if (stack.size() != 0) {
            printFailMessage(testName, "size wrong", String.valueOf(0), String.valueOf(stack.size()));
            return false;
        }
        if (stack.pop()) {
            printFailMessage(testName, "pop wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }
        return true;
    }

    public static boolean testArrayStackOfSizeOne() {
        // homework
        ArrayStack stack = new ArrayStack(1);
        String testName = "testArrayQueueQueueOfSizeOne";

        boolean newVal = stack.push(10);

        if (!newVal) {
            printFailMessage(testName, "push wrong", String.valueOf(true), String.valueOf(newVal));
            return false;
        }
        if (stack.size() != 1) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }

        StackElement data = stack.peek();

        if (!data.isValid()) {
            printFailMessage(testName, "peek wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }

        boolean popVal = stack.pop();
        if(!popVal){
            printFailMessage(testName, "pop wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }

        if (stack.size() != 0) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }

        data = stack.peek();
        if (data.isValid()) {
            printFailMessage(testName, "peek wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }

        stack.push(10);
        newVal = stack.push(20);
        if (newVal) {
            printFailMessage(testName, "push wrong", String.valueOf(false), String.valueOf(newVal));
            return false;
        }
        return true;
    }


    public static boolean testArrayStackOfSizeTwo() {
        // homework
        ArrayStack stack = new ArrayStack(2);
        String testName = "testArrayQueueQueueOfSizeTwo";

        stack.push(10);
        boolean newVal = stack.push(20);

        if (!newVal) {
            printFailMessage(testName, "push wrong", String.valueOf(true), String.valueOf(newVal));
            return false;
        }
        if (stack.size() != 2) {
            printFailMessage(testName, "size wrong", String.valueOf(2), String.valueOf(stack.size()));
            return false;
        }

        StackElement data = stack.peek();

        if (!data.isValid() || data.getData() != 20) {
            printFailMessage(testName, "peek wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }

        boolean popVal = stack.pop();
        if(!popVal){
            printFailMessage(testName, "pop wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }
        if (stack.size() != 1) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }
        data = stack.peek();
        if (!data.isValid() || data.getData() != 10) {
            printFailMessage(testName, "peek wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }

        return true;
    }

    public static boolean testArrayStackOfSizeThree() {
        // homework
        ArrayStack stack = new ArrayStack(3);
        String testName = "testArrayQueueQueueOfSizeThree";

        stack.push(10);
        stack.push(20);
        boolean newVal = stack.push(65);

        if (!newVal) {
            printFailMessage(testName, "push wrong", String.valueOf(true), String.valueOf(newVal));
            return false;
        }
        if (stack.size() != 3) {
            printFailMessage(testName, "size wrong", String.valueOf(2), String.valueOf(stack.size()));
            return false;
        }

        StackElement data = stack.peek();

        if (!data.isValid()) {
            printFailMessage(testName, "peek wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }

        boolean popVal = stack.pop();
        if(!popVal){
            printFailMessage(testName, "pop wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }
        if (stack.size() != 2) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }
        data = stack.peek();
        if (!data.isValid() || data.getData() != 20) {
            printFailMessage(testName, "peek wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }

        stack.push(10);
        newVal = stack.push(20);
        if (newVal) {
            printFailMessage(testName, "push wrong", String.valueOf(false), String.valueOf(newVal));
            return false;
        }

        return true;
    }

    private static void printFailMessage(String testName, String message, String expected, String actual) {
        System.out.println(testName + " : " + message +
                ", expected: " + expected +
                ", actual: " + actual);
    }
}
