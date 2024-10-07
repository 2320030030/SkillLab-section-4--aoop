package MessageBuffer;

import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private final int capacity = 10;
    private final Queue<Integer> buffer = new LinkedList<>();

    
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full, producer is waiting...");
            wait(); 
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); 
    }

    
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait(); 
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll(); 
        return item;
    }
}
}
