package Exercises_Examples;

public class LinkedListTests extends Tests {

    public static void testAll() {
        testArrayConstructorAndToString();
        testGoToLastNode();
    }

    public static void testGoToLastNode() {
        int inputs[][] = {
                {1},
                {1,2},
                {3,3},
                {2,3,4},
        };

        // empty case
        SingleLinkedList emptyList = new SingleLinkedList();
        if (emptyList.getLast()!=null) {
            System.out.println("testGoToLastNode FAILED, empty list, expected: null, actual: " + emptyList.getLast());
        }

        int expected[] = {1,2,3,4};
        for (int i = 0; i < inputs.length; i++) {
            SingleLinkedList list = new SingleLinkedList(inputs[i]);

            ListNode lastNode = list.getLast();
            int actual = lastNode.val;

            if (!assertEquals(actual, expected[i])) {
                System.out.printf("testGoToLastNode case %d failed, expected '%d', actual '%d'\n",
                        i, expected[i], actual);
            }
        }
        System.out.println("testGoToLastNode PASSED");
    }

    private static void testArrayConstructorAndToString() {
        int inputs[][] = {
                {},
                {1},
                {1,2},
        };
        String expected[] = {"", "1 -> end", "1 -> 2 -> end"};

        for (int i = 0; i < inputs.length; i++) {
            SingleLinkedList list = new SingleLinkedList(inputs[i]);
            if (!assertTrue(list.toString().equals(expected[i]))) {
                System.out.printf("testToString case %d failed, expected '%s', actual '%s'\n",
                        i, expected[i], list.toString());
            }
        }
        System.out.println("testToString PASSED");
    }


}
