package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PriorityQueue<T> {
    private ArrayList<T> elements;
    private Comparator<? super T> comparator;

    public PriorityQueue(Comparator<? super T> comparator) {
        this.elements = new ArrayList<>();
        this.comparator = comparator;
    }

    public void enqueue(T item) {
        elements.add(item);
        Collections.sort(elements, comparator);  
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return elements.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return elements.get(0);  
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

