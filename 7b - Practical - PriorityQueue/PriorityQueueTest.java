package PriorityQueue;

import java.util.Comparator;

public class PriorityQueueTest {

    public static void main(String[] args) {
        // Test with Integer Priority Queue (Max-Heap)
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.reverseOrder());
        intQueue.enqueue(3);
        intQueue.enqueue(1);
        intQueue.enqueue(4);
        intQueue.enqueue(2);
        System.out.println("Integer Priority Queue (Max-Heap):");
        System.out.println(intQueue);         
        System.out.println("Peek: " + intQueue.peek()); 
        System.out.println("Dequeue: " + intQueue.dequeue());  
        System.out.println(intQueue);       
        System.out.println();

        
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.enqueue(2.2);
        doubleQueue.enqueue(3.3);
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(4.4);
        System.out.println("Double Priority Queue (Min-Heap):");
        System.out.println(doubleQueue);      
        System.out.println("Peek: " + doubleQueue.peek());  
        System.out.println("Dequeue: " + doubleQueue.dequeue());  
        System.out.println(doubleQueue);     
        System.out.println();

        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        stringQueue.enqueue("Date");
        System.out.println("String Priority Queue (Alphabetical Order):");
        System.out.println(stringQueue);       
        System.out.println("Peek: " + stringQueue.peek());  
        System.out.println("Dequeue: " + stringQueue.dequeue());  
        System.out.println(stringQueue);      
    }
}
