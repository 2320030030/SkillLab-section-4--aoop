package MessageBuffer;

class Producer implements Runnable {
    private final BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(1000); // Simulate production delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
