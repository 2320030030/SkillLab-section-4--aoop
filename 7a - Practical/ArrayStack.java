package Stack;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        top = -1;
    }

    @Override
    public void push(T item) {
        if (top == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2); 
        }
        array[++top] = item;  
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = array[top];
        array[top--] = null;  
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];     
    }

    @Override
    public boolean isEmpty() {
        return top == -1;      
    }
}
