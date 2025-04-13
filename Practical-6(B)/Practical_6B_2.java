class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class Practical_6B_2 {
    public static void main(String[] args) {
        // Create Runnable object and thread
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        
        t.start(); // Start the child thread

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished after child thread");
    }
}
