package problem_3;

/*
CSS143B homework 1, problem 3
by [Alvin Jasper Juan]
 */

// got help from a youtube video, name: Francisco Iacobelli
// link of the video: https://www.youtube.com/watch?v=dyWYLXKSPus

class Answer {
    private int val;
    private boolean isValid;

    public Answer(int maxNumber, boolean foundAnswer) {
        this.val = maxNumber;
        this.isValid = foundAnswer;
    }

    public boolean equals(Answer anotherAnswer) {
        return val == anotherAnswer.val &&
                isValid == anotherAnswer.isValid;
    }

    @Override
    public String toString() {
        return "MaxNumberAnswer{" +
                "maxNumber=" + val +
                ", foundAnswer=" + isValid +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("testFindHighestFrequencyNumber " + (testFindHighestFrequencyNumber() ? "PASSED" : "FAILED"));
    }

    public static Answer findHighestFrequencyNumber(int[] data) {
        // determines if an array is empty
        if (data.length == 0) {
            return new Answer(-1, false);
        }

        int repeat = 0;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            int tempRepeat = data[i];       // store element
            int tempCount = 0;              // counter for repeated elements
            for (int j = 0; j < data.length; j++) {
                //compares elements with each other
                if (data[j] == tempRepeat) {
                    tempCount++;
                }
                // repeated number is found, assigned to a new variable
                if (tempCount > count) {
                    repeat = tempRepeat;
                    count = tempCount;
                }
            }
        }
        return new Answer(repeat, true);
    }
    public static boolean testFindHighestFrequencyNumber() {
        // prepare the answers
        int inputs[][] = {
                {},
                {7},
                {-1},
                {2, 2},
                {4, 4, 3},
                {6, 5, -1, 6},
                {7, 8, 9, 8, 8},
                {5, 5, 5, 6, 6},
                {5, 5, 6, 6, 6},
                {4, 4, 5, 5, 5, 6, 6, 6},
                {2, 2, 1, 1, 2}};
        int values[] = {-1, 7, -1, 2, 4, 6, 8, 5, 6, 5, 2};
        Answer[] answers = new Answer[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            answers[i] = new Answer(values[i], (i == 0 ? false : true));
        }

        // compare answer. return false if any case fails. true otherwise
        for (int i = 0; i < inputs.length; i++) {

            Answer actual = findHighestFrequencyNumber(inputs[i]);
            Answer expected = answers[i];

            if (!expected.equals(actual)) {
                System.out.printf("Case %d: Expected %s, actual %s\n", i, expected, actual);
                return false;
            }
        }
        return true;
    }
}

