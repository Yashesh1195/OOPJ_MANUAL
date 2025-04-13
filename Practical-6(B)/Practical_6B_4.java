class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " with priority " + getPriority() + " is running");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Practical_6B_4 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-1");
        PriorityThread t2 = new PriorityThread("Thread-2");
        PriorityThread t3 = new PriorityThread("Thread-3");
        PriorityThread t4 = new PriorityThread("Thread-4");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(4);
        t3.setPriority(7);
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
