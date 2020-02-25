package hw2.problem3;

public interface Stack {
    boolean push(int val);
    boolean pop();
    StackElement peek();
    int size();
}
