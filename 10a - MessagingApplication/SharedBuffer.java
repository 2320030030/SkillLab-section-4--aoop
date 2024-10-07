package MessagingApplication;

import java.util.Queue;
import java.util.LinkedList;

class SharedBuffer {
    private final Queue<String> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

   
    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full, waiting for consumer to consume...");
            wait();
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); 
    }

   
    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, waiting for producer to produce...");
            wait();
        }
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); 
        return message;
    }
}
