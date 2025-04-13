class Buffer {
    private int[] buffer;
    private int capacity;
    private int count;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.count = 0;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (count == capacity) {
            wait(); // Wait until there is space to produce
        }
        buffer[count++] = value;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that an item is produced
    }

    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait(); // Wait until there is an item to consume
        }
        int value = buffer[--count];
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer that space is available
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Practical_6B_6 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
