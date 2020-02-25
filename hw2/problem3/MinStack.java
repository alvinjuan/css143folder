package hw2.problem3;

/*
got help from geeksforgeeks.org
got help from youtuber nick white
got help from a few couple students
 */

public class MinStack extends ArrayStack {
    private ArrayStack min;
    public MinStack(int size) {
        super(size);
        min = new ArrayStack(size);
    }
    @Override
    public boolean pop() {
        StackElement a = min.peek();
        StackElement b = super.peek();
        if (b.isValid() || b.equals(a)){
            min.pop();
        }
        return super.pop();
    }
    @Override
    public boolean push(int val) {
        StackElement a = min.peek();
        if (!a.isValid() || val < a.getData()){
            min.push(val);
        }
        return super.push(val);
    }

    // The array is listed as the top part being the smallest
    // and the biggest number to be the first in the list
    // push it if its smaller than value and pop if it isn't or if theyre equal
    public StackElement getMin() {
        return min.peek();
    }
}
