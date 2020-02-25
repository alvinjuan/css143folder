package hw2.problem3;

//got help from another student and from the examples
// got help from leetcode
import java.util.Arrays;

public class ArrayStack implements Stack {

    private int data[];
    private int size;

    private int front;
    private int end;

    private ArrayStack() {
    }

    public ArrayStack(int size) {
        // homework
        data = new int[size];
        this.size = 0;
    }

    @Override
    public boolean pop() {
        // homework
        if (size == 0){     // nothing to remove since its empty
            return false;
        }
        size--;
        return true;
    }

    @Override
    public boolean push(int val) {
        // homework
        if (size == data.length){       // can't push another value if its already full
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public StackElement peek() {
        // homework
        if (size == 0){         // cant peek if its empty
            return new StackElement (-1, false);
        }
        return new StackElement(data[size - 1], true);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
